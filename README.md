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

For each of the requests mentioned below, send the request first with the Accept and Content-type (for POST/PUT requests) headers both set to Application/XML. After receiving the response, the output is printed in the console. Also, output of Application/XML is recorded in a file named "client-server.log".

Below are the list of tasks that are implemented:

    Step 1. Print server WSDL url (one generated for you by Heroku + e.g. /ws/people?wsdl).

    Step 3.1: Send Request#1 (GET BASE_URL/person). Calculate how many people are in the response. If more than 4, result is OK, else is ERROR (less than 5 persons). Save into a variable id of the first person (first_person_id) and of the last person (last_person_id).

    Step 3.2: Send Request#2 for first_person_id. If the responses for this is 200 or 202, the result is OK.

    Step 3.3: Send Request#3 for first_person_id changing the firstname. If the responses has the name changed, the result is OK.

    Step 3.4: Send Request#4 to create a new person (with one activity preference) using an XML. Store the id of the new person. If the answer is 201 (200 or 202 are also applicable) with a person in the body who has an ID, the result is OK.

    Step 3.5: Send Request#5 for the person you have just created. Then send Request#1 with the id of that person. If the answer is 404, your result must be OK.

    Step 3.6: Follow now with the Request#6 (GET BASE_URL/activity_types ). If response contains more than 2 activity_types - result is OK, else is ERROR (less than 3 activity_types ). Save all activity Types into array (activity_types).

    Step 3.7: Send Request#7 (GET BASE_URL/person/{id}/{activity_type}) for the first person you obtained at the beginning (first_person_id) and the last person (last_person_id), and for each activity type from activity_types. If no response has at least one activity the result is ERROR (no data at all) else result is OK. Store one activity_id and one activity_type.

    Step 3.8: Send Request#8 (GET BASE_URL/person/{id}/{activity_type}/{activity_id}) for the stored activity_id and activity_type. If the response is 200, result is OK, else is ERROR.

    Step 3.9: Choose a activity_type from activity_types and send the request Request#7 (GET BASE_URL/person/{first_person_id}/{activity_type}) and save count value (e.g. 5 measurements). Then send Request#9 (POST BASE_URL/person/{first_person_id}/{activity_type}) with the activity specified below. Follow up with another Request#7 as the first to check the new count value. If it is 1 measure more - print OK, else print ERROR. Remember, first with JSON and then with XML as content-types.

    Step 3.10: Send Request#10 using the {activity_id} or the activity created in the previous step and updating the value at will. Follow up with at Request#6 to check that the value was updated. If it was, result is OK, else is ERROR (Indicate if service not available).

    Step 3.11: Send Request#11 for an activity_type, before and after dates given by your fellow student (who implemented the server). If status is 200 and there is at least one activity in the body, result is OK, else is ERROR (Indicate if service not available).

Execution:

    In the browser, execute the below mentioned database_init to initialize the database on the server -

      https://activityperson.herokuapp.com/database_init

    Clone the client github repository to your local machine -

    Client github repository: https://github.com/surbhisonkiya/introsde-2017-assignment-2-client.git

    In the terminal, navigate to the path where you have cloned the repository on your local machine.

    Execute below command in the terminal -

      ant execute.client

    Check the output in the newly generated files named "client-server-xml.log".

Additional Notes:

Please do step 1 mentioned under Execution part. If not done, database will not be initialised and client will throw an error.
