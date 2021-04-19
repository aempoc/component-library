package com.aem.compLib.core.models;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import javax.inject.Inject;

@Model (
    adaptables= Resource.class,
    adapters = Button.class
    )
public class ButtonImpl implements Button {

    @Inject
    @Default(values="td-button td-button-block td-cta-button td-cta-action td-button-primary")
    public String buttonType;

    @Override
    public String getButtonType() {
        return buttonType;
    }
}