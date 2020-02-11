package com.swagger.entity;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.HeaderParam;
import java.util.Locale;


/**
 * @author squinn
 */
public class Language {

    @HeaderParam("Accept-Language")
    @DefaultValue("en-US")
    private LocaleParam locale;

    public Language() {
    }

    public Language(String language) {
        this.locale = new LocaleParam(language);
    }

    public Locale getLocale() {
        return this.locale.getLocale();
    }
}
