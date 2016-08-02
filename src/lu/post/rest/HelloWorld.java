package lu.post.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloWorld {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMessage(@QueryParam("NAME") String name) {
        return String.format("Hello %s", name);
    }

    /*
    @GET
    @Path( "user" )
    @Produces(MediaType.APPLICATION_XML)
    public User getUserXML() {
        return generateDummyUser();
    }*/

    @GET
    @Path("user")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserJSON() {
        return generateDummyUser();
    }

    private User generateDummyUser() {

        User user = new User();
        user.name = "Fabien Steines";
        user.adress = "30, rue Thomas Byrne";
        user.age = 28;
        user.workplace = "POST Technologies";

        return user;
    }
}