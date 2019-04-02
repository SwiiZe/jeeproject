package jeeproject.services;

import java.io.IOException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import jeeproject.domain.model.LoginBean;

import org.codehaus.jackson.map.ObjectMapper;


public class LoginService {
    
    @POST
    @Path("/login/{credentials}")
    public Response login(@PathParam("credentials") String credentials) {
        System.out.println("Login");
        ObjectMapper mapper = new ObjectMapper();
        try {
            LoginBean user = mapper.readValue(credentials, LoginBean.class);
            //DAO
            System.out.println(user);
            if(user.getName()=="root") {
                System.out.println("Logged");
                return Response.status(Response.Status.ACCEPTED).entity(credentials).build();
            }  
            else {
                return Response.status(Response.Status.UNAUTHORIZED).entity(credentials).build();
            }
            } catch(IOException e) {
                e.printStackTrace();
            }
        return Response.status(Response.Status.UNAUTHORIZED).entity(credentials).build();
    }
    
    @POST
    @Path("/register/{newUser}")
    public void register(@PathParam("newUser") String newUser) {
        System.out.println("IN LOGIN SERVICE");
        ObjectMapper mapper = new ObjectMapper();
        try {
            LoginBean user = mapper.readValue(newUser, LoginBean.class);
            //USERDAO
            System.out.println(user);
            if(user.getName()=="root") {
              
            }  
            else {
            }
            } catch(IOException e) {
                e.printStackTrace();
            }
    }
}
