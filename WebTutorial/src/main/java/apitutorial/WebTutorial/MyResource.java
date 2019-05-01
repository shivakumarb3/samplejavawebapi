package apitutorial.WebTutorial;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import apitutorial.WebTutorial.*;
import java.util.*;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Person> getIt() {
    	Person p=new Person("babloo",20);
    	Person q=new Person("sk",15);
    	ArrayList<Person> li=new ArrayList<Person>();
    	li.add(p);
    	li.add(q);
    	return li;
    	
       
    }
}
