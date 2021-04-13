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
    @Default(values="button-primary")
    public String buttonType;

    @Inject
    @Default(values="large")
    public String buttonSize;

    @Override
    public String getButtonType() {
        return buttonType;
    }
    @Override
    public String getButtonSize() {
        return buttonSize;
    }
}