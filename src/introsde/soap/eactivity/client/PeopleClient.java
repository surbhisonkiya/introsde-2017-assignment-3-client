package introsde.soap.eactivity.client;

import java.io.PrintWriter;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import introsde.soap.eactivity.ws.Activity;
import introsde.soap.eactivity.ws.ActivityType;
import introsde.soap.eactivity.ws.People;
import introsde.soap.eactivity.ws.PeopleImplService;
import introsde.soap.eactivity.ws.Person;

public class PeopleClient{

	public static String printPerson(Person person) {
		String id= "NA";
		if (person.getPersonId()!=0) {
			id = String.valueOf(person.getPersonId());
		}

		String result = "Person [Id = "+ id + ", FirstName = " + person.getFirstName() + ", LastName = " + person.getLastName() + ", BirthDate = "+ person.getBirthDate();
		if (person.getActivityPreferences()!=null) {
			result = result + "," + printActivityPreferences(person.getActivityPreferences());
		}
		result = result +  "]";
		return result;
	}


	private static String printActivityPreferences(List<Activity> activitypreference) {
		String result = "(";
		for(int i=0;i<activitypreference.size();i++) {
			if (i>0) {
				result = result + "," + printActivity(activitypreference.get(i));
			}else {
				result = result + printActivity(activitypreference.get(i));
			}

		}
		result = result + ")";
		return result;
	}



	private static String printActivity(Activity activity) {
		String id = "NA";
		if (activity.getActivityId()!=0) {
			id = String.valueOf(activity.getActivityId());
		}
		String rating = "NA";
		if(activity.getRating()!=0) {
			rating = String.valueOf(activity.getRating())+"/5";
		}

		return "\nActivity\n{Id = " + id +", Name = " + activity.getName() + ", \n Description = " + activity.getDescription() + ", \n Place=" + activity.getPlace() + ", \n Type = " + activity.getType() + ", \n startDate = " + activity.getStartdate() + ", \n Rating = " + rating + "}";
	}



	public static void main(String[] args) throws Exception {

		PeopleImplService service = new PeopleImplService();
		People people = service.getPeopleImplPort();
		people.databaseInit();
		
		List<Person> pList = people.readPersonList();

		
		int personid = pList.get(0).getPersonId();


		int activityId = pList.get(0).getActivityPreferences().get(0).getActivityId();

		//wsimport -keep http://localhost:6902/ws/people?wsdl

		//Method 0
		System.out.println("WSDL Documentation available at: "+service.getWSDLDocumentLocation());

		//Method 1
		
		System.out.println("\nMethod #1 | readPersonList()\n");
		for (int i=0;i<pList.size();i++) {
			System.out.println("Person: "+(i+1));
			System.out.println(printPerson(pList.get(i)));
			System.out.println("");
		}
		//Method 2
		System.out.println("\nMethod #2 | readPerson(int personid)");		
		System.out.println("Person with person ID = "+personid + "\n");
		Person person = people.readPerson(personid);
		System.out.println(printPerson(person));

		person.setFirstName("Nandini");
		person.setLastName("Tadimeti");

		//Method 3
		System.out.println("\nMethod #3 | updatePerson(Person person)");
		System.out.println("Updated person = "+printPerson(person) + "\n");
		int updatedId = people.updatePerson(person);
		System.out.println("Person with id="+ updatedId + " has been updated.");

		List<Activity> activities = new ArrayList<>();
		Activity activity1 = new Activity();
		activity1.setName("Pilates");
		activity1.setDescription("Pilates in Sanba");
		activity1.setPlace("Trento");
		activity1.setType(ActivityType.SPORT);
		activity1.setStartdate("2017-10-05");

		activities.add(activity1);

		Activity activity2 = new Activity();
		activity2.setName("Dance");
		activity2.setDescription("Dance Club");
		activity2.setPlace("Mumbai");
		activity2.setType(ActivityType.SOCIAL);
		activity2.setStartdate("2017-12-14");		
		activities.add(activity2);
		Person personNew = new Person();
		personNew.setFirstName("Sagar");
		personNew.setLastName("Gupta");
		personNew.setBirthDate("1991-10-04");
		personNew.getActivityPreferences().add(activity1);
		personNew.getActivityPreferences().add(activity2);

		//Method 4
		System.out.println("\nMethod #4 | createPerson(Person person)");
		System.out.println("New person created"+"\n");
		System.out.println(printPerson(personNew) + "\n");
		Person newPerson = people.createPerson(personNew);
		int createdId = newPerson.getPersonId();
		System.out.println("Person with id = "+ createdId + " has been created");

		//Method 5
		System.out.println("\nMethod #5 | deletePerson(int personid)");
		boolean success = people.deletePerson(createdId);
		if (success) {
			System.out.println("Person with id="+ createdId + " has been deleted.");
		}else {
			System.out.println("Person with id="+ createdId + " cannot be found and hence not deleted.");
		}

		//Method 6
		System.out.println("\nMethod #6 | readPersonPreferences(int personid, String activityType)\n");
		System.out.println("Reading activities of person with id = "+personid);
		System.out.println("activityType=Sport \n");
		List<Activity> activitiesWithType = people.readPersonPreferences(personid, "SPORT");
		for (int i=0;i<activitiesWithType.size();i++) {
			System.out.println("Activity #"+(i+1));
			System.out.println(printActivity(activitiesWithType.get(i)));
			System.out.println("");
		}

		//Method 7
		System.out.println("\nMethod #7 | readPreferences()\n");
		List<Activity> all_activities = people.readPreferences();
		for (int i=0;i<all_activities.size();i++) {
			System.out.println("Activity: "+(i+1));
			System.out.println(printActivity(all_activities.get(i)));
			System.out.println("");
		}

		//Method 8
		System.out.println("\nMethod #8 | readPersonPreferencesWithId(int personid, int activityId)\n");
		System.out.println("person id="+personid+" and activity id=" + activityId+ "\n");
		Activity activityWithId = people.readPersonPreferencesWithId(personid, activityId);
		System.out.println(printActivity(activityWithId));

		//Method 9
		System.out.println("\nMethod #9 | savePersonPreferences(int personid, Activity activity)\n");
		System.out.println("person id = "+personid);
		Activity activity3 =  new Activity();
		activity3.setName("Party");
		activity3.setDescription("Get together with family friends");
		activity3.setType(ActivityType.SOCIAL);
		activity3.setPlace("Goa");
		activity3.setStartdate("2017-10-08");
		System.out.println("activity=" + printActivity(activity3)+ "\n");
		Activity newActivity = people.savePersonPreferences(personid, activity3);
		int newActivityId = newActivity.getActivityId();
		System.out.println("Activity added to person id = " +personid+ " and activity id = " + newActivity.getActivityId());

		//Method 10
		System.out.println("\nMethod #10 | updatePersonPreferences(int personid, Activity activity)\n");
		System.out.println("Updating person with id = "+personid);
		Activity activity4 =  new Activity();
		activity4.setName("Sing");
		activity4.setActivityId(3);
		activity4.setDescription("Singing in party");
		activity4.setType(ActivityType.SOCIAL);
		activity4.setPlace("Bangalore");
		activity4.setStartdate("2017-12-09");
		System.out.println(printActivity(activity4)+ "\n");
		Activity updatedActivity = people.updatePersonPreferences(personid, activity4);
		System.out.println(printActivity(updatedActivity));

		//Method 11
		System.out.println("\nMethod #11 | evaluatePersonPreferences(int personid, Activity activity, int value)\n");		
		System.out.println("Rating person with id = "+personid);
		System.out.println(printActivity(updatedActivity)+ "\n");
		Activity updatedActivity2 = people.evaluatePersonPreferences(personid, updatedActivity, 4);
		System.out.println("The ratings are on a scale of 1 to 5");
		System.out.println(printActivity(updatedActivity2));


	}

}

