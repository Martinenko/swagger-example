package com.swagger.boundary;

import com.swagger.control.RestParam;
import com.swagger.entity.CompanyID;
import com.swagger.entity.Language;
import io.swagger.annotations.Api;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.validation.Valid;
import javax.ws.rs.BeanParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("/{companyID}")
@Api(value = "RootResource")
@RequestScoped
public class RootResource {

    private CompanyID companyID;
    private Language language;

    @Produces
    @RestParam
    public Language getLanguage() {
        return this.language;
    }

    @GET
    @Path("/info")
    public String infoResource(@BeanParam @Valid CompanyID companyID, @BeanParam @Valid Language language) {
        this.companyID = companyID;
        this.language = language;
        return this.companyID + " " + this.language;
    }
}
