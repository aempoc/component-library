package com.aem.compLib.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import javax.inject.Inject;

@Model (
    adaptables= Resource.class,
    adapters = Title.class
    )
public class TitleImpl implements Title {

    @Inject
    @Default(values="text-center")
    private String alignment;

    @Inject
    @Optional
    private String cssClass;

    @Override
    public String getAlignment() {
        return alignment;
    }

    @Override
    public String getCssClass() {
        return cssClass;
    }
}