# introsde-2017-assignment-3-client

Surbhi Sonkiya

Email-id: surbhi.sonkiya@studenti.unitn.it

Worked Alone.

Server URL: https://studentactivity.herokuapp.com/ws/people?wsdl

Server github repository: https://github.com/surbhisonkiya/introsde-2017-assignment-3-server.git

Project:

The project provides the implementation of the system for the Univeristy to understand the preferences of their students, that can help them register students and their preferred activities. The system is capable of storing firstname, lastname, birthdate of the students and name, description, type of activity, place, start date/time about the activity preferred by the student. The University can add, read, modify and delete the information via Web (SOAP Services). Additionally, the results are saved in a database.

About the code:

The system supports the output of the application in XML.

For each of the requests mentioned below, send the request with the Accept and Content-type (for POST/PUT requests) headers both set to Application/XML. After receiving the response, the output is printed in the console. Also, output of Application/XML is recorded in a file named "client-server.log".

Below are the list of tasks that are implemented:

    Step 1. Print server WSDL url (one generated for you by Heroku + e.g. /ws/people?wsdl).

    Step 2.0: databaseInit() => an initialization process at deployment should create 5 new persons to initialise the database and return the newly created persons including at least one activity preference per person.

    Step 2.1:  readPersonList() => List<Person> | should list all the people in the database (all information related to each person) in your database.
    
    Step 2.2: readPerson(Long id) => Person | should give all the Personal information of one Person identified by {id}.
    
    Step 2.3: updatePerson(Person p) => Person | should update the Personal information of the Person identified by {id} (e.g., only the Person's information)
    
    Step 2.4: createPerson(Person p) => Person | should create a new Person and return the newly created Person with its assigned id (if a preference is included, create also those values for the new Person).
    
    Step 2.5: deletePerson(Long id) | should delete the Person identified by {id} from the system
    
    Step 2.6: readPersonPreferences(Long id, String activity_type) => List<Preference> | should return the list of values of {activity_type} (e.g. sport) for a Person identified by {id}
    
    Step 2.7: readPreferences() => List<Preferences> | should return the list of all preferences
    
    Step 2.8: readPersonPreferences(Long id, Long activity_id) => Preference | should return the value identified by {activity_id} for a Person identified by {id}
    
    Step 2.9: savePersonPreferences(Long id, Activity activity) | should save a new activity object {activity} of a Person identified by {id}
    
    Step 2.10: updatePersonPreferences(Long id, Activity activity) => Preference | should update the activity identified with {activity.id}, related to the Person identified by {id}
    
    Step 2.11: evaluatePersonPreferences(Long id, Activity activity, int value) => Preference | should update the activity identified with {activity.id}, related to the Person identified by {id} with the value that define a specific value of preferences (e.g. 4 out of 5, or 8 out of 10).
    
    Step 2.12: getBestPersonPreference(Long id) => List<Preference> | should  return the best preference (or preferences if there are more) of the Person identified by {id}  from his/her list of preferences.   

Execution:

    1. Clone the client github repository to your local machine -

    Client github repository: https://github.com/surbhisonkiya/introsde-2017-assignment-2-client.git

    2. In the terminal, navigate to the path where you have cloned the repository on your local machine.

    3. Execute below command in the terminal -

      wsimport -keep https://studentactivity.herokuapp.com/ws/people?wsdl
      
     4. Execute below command in the terminal -
     
     ant execute.client

    Check the output in the newly generated files named "client-server.log".

Additional Notes:

Step 2.12 has not been implemented.
