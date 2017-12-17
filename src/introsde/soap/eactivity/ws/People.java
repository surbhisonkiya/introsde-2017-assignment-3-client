
package introsde.soap.eactivity.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "People", targetNamespace = "http://ws.eactivity.soap.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface People {


    /**
     * 
     */
    @WebMethod
    @RequestWrapper(localName = "databaseInit", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.DatabaseInit")
    @ResponseWrapper(localName = "databaseInitResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.DatabaseInitResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/databaseInitRequest", output = "http://ws.eactivity.soap.introsde/People/databaseInitResponse")
    public void databaseInit();

    /**
     * 
     * @return
     *     returns java.util.List<introsde.soap.eactivity.ws.Person>
     */
    @WebMethod
    @WebResult(name = "people", targetNamespace = "")
    @RequestWrapper(localName = "readPersonList", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPersonList")
    @ResponseWrapper(localName = "readPersonListResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPersonListResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/readPersonListRequest", output = "http://ws.eactivity.soap.introsde/People/readPersonListResponse")
    public List<Person> readPersonList();

    /**
     * 
     * @param id
     * @return
     *     returns introsde.soap.eactivity.ws.Person
     */
    @WebMethod
    @WebResult(name = "person", targetNamespace = "")
    @RequestWrapper(localName = "readPerson", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPerson")
    @ResponseWrapper(localName = "readPersonResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPersonResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/readPersonRequest", output = "http://ws.eactivity.soap.introsde/People/readPersonResponse")
    public Person readPerson(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param person
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "id", targetNamespace = "")
    @RequestWrapper(localName = "updatePerson", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.UpdatePerson")
    @ResponseWrapper(localName = "updatePersonResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.UpdatePersonResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/updatePersonRequest", output = "http://ws.eactivity.soap.introsde/People/updatePersonResponse")
    public int updatePerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param person
     * @return
     *     returns introsde.soap.eactivity.ws.Person
     */
    @WebMethod
    @WebResult(name = "id", targetNamespace = "")
    @RequestWrapper(localName = "createPerson", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.CreatePerson")
    @ResponseWrapper(localName = "createPersonResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.CreatePersonResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/createPersonRequest", output = "http://ws.eactivity.soap.introsde/People/createPersonResponse")
    public Person createPerson(
        @WebParam(name = "person", targetNamespace = "")
        Person person);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "id", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.DeletePerson")
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.DeletePersonResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/deletePersonRequest", output = "http://ws.eactivity.soap.introsde/People/deletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "id", targetNamespace = "")
        int id);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<introsde.soap.eactivity.ws.Activity>
     */
    @WebMethod
    @WebResult(name = "personPreferences", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPreferences", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPersonPreferences")
    @ResponseWrapper(localName = "readPersonPreferencesResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPersonPreferencesResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/readPersonPreferencesRequest", output = "http://ws.eactivity.soap.introsde/People/readPersonPreferencesResponse")
    public List<Activity> readPersonPreferences(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns java.util.List<introsde.soap.eactivity.ws.Activity>
     */
    @WebMethod
    @WebResult(name = "preferences", targetNamespace = "")
    @RequestWrapper(localName = "readPreferences", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPreferences")
    @ResponseWrapper(localName = "readPreferencesResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPreferencesResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/readPreferencesRequest", output = "http://ws.eactivity.soap.introsde/People/readPreferencesResponse")
    public List<Activity> readPreferences();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.soap.eactivity.ws.Activity
     */
    @WebMethod
    @WebResult(name = "personPreferencesWithId", targetNamespace = "")
    @RequestWrapper(localName = "readPersonPreferencesWithId", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPersonPreferencesWithId")
    @ResponseWrapper(localName = "readPersonPreferencesWithIdResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.ReadPersonPreferencesWithIdResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/readPersonPreferencesWithIdRequest", output = "http://ws.eactivity.soap.introsde/People/readPersonPreferencesWithIdResponse")
    public Activity readPersonPreferencesWithId(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.soap.eactivity.ws.Activity
     */
    @WebMethod
    @WebResult(name = "savedActivity", targetNamespace = "")
    @RequestWrapper(localName = "savePersonPreferences", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.SavePersonPreferences")
    @ResponseWrapper(localName = "savePersonPreferencesResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.SavePersonPreferencesResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/savePersonPreferencesRequest", output = "http://ws.eactivity.soap.introsde/People/savePersonPreferencesResponse")
    public Activity savePersonPreferences(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Activity arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.soap.eactivity.ws.Activity
     */
    @WebMethod
    @WebResult(name = "updatedActivity", targetNamespace = "")
    @RequestWrapper(localName = "updatePersonPreferences", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.UpdatePersonPreferences")
    @ResponseWrapper(localName = "updatePersonPreferencesResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.UpdatePersonPreferencesResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/updatePersonPreferencesRequest", output = "http://ws.eactivity.soap.introsde/People/updatePersonPreferencesResponse")
    public Activity updatePersonPreferences(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Activity arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns introsde.soap.eactivity.ws.Activity
     */
    @WebMethod
    @WebResult(name = "evaluatedActivity", targetNamespace = "")
    @RequestWrapper(localName = "evaluatePersonPreferences", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.EvaluatePersonPreferences")
    @ResponseWrapper(localName = "evaluatePersonPreferencesResponse", targetNamespace = "http://ws.eactivity.soap.introsde/", className = "introsde.soap.eactivity.ws.EvaluatePersonPreferencesResponse")
    @Action(input = "http://ws.eactivity.soap.introsde/People/evaluatePersonPreferencesRequest", output = "http://ws.eactivity.soap.introsde/People/evaluatePersonPreferencesResponse")
    public Activity evaluatePersonPreferences(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Activity arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2);

}
