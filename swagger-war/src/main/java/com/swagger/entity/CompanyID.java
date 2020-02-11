package com.swagger.entity;

import javax.ws.rs.PathParam;


public class CompanyID {

    @PathParam("companyID")
    private String id;

    public CompanyID() {
    }

    public CompanyID(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }
}
