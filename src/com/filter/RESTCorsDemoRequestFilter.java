package com.filter;
import java.io.IOException;
import java.util.logging.Logger;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;

import javax.ws.rs.ext.Provider;
 
@Provider

public class RESTCorsDemoRequestFilter implements ContainerRequestFilter {
 
    private final static Logger log = Logger.getLogger( RESTCorsDemoRequestFilter.class.getName() );
 
    @Override
    public void filter( ContainerRequestContext reqContext ) throws IOException {
        log.info( "Executing REST request filter" ); 
        System.out.println("geldi");
        System.out.println("-- req info --");
     
    }
}
