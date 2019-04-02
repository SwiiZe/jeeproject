/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeeproject.services;


import java.io.IOException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import jeeproject.domain.model.LoginBean;

import org.codehaus.jackson.map.ObjectMapper;


public class StoreService {
    @POST
    @Path("/storeInfo/{storeId}")
    public Response getStoreInfo(@PathParam("storeId") String credentials) {
        System.out.println("Store info");
        int storeId = Integer.valueOf(credentials);
        //CALLDAO
        return null;
    }
}
