package org.enset.msbanque;

import org.enset.msbanque.web.CompteRestJaxRSAPI;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    //@Bean
    public ResourceConfig resourceConfig(){
        ResourceConfig jersyServlet =new ResourceConfig();
        jersyServlet.register(CompteRestJaxRSAPI.class);
        return  jersyServlet;
    }
}
