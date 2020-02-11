package com.swagger.control;

import com.github.phillipkruger.apiee.ApieeService;
import com.swagger.boundary.CustomerResource;
import com.swagger.boundary.RootResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;


@ApplicationPath("/v1")
public class ApiApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();

        classes.add(ApieeService.class);
        classes.add(RootResource.class);
        classes.add(CustomerResource.class);

        return classes;
    }
}
