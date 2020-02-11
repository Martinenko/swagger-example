package com.swagger.entity;

import java.util.Locale;


/**
 * @author squinn
 */
public class LocaleParam {

    private Locale locale;

    public LocaleParam(String acceptLanguage) {
        this.locale = Locale.forLanguageTag(acceptLanguage);
    }

    public Locale getLocale() {
        return this.locale;
    }
}
