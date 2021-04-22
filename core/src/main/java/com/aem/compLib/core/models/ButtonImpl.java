package com.aem.compLib.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import javax.inject.Inject;

@Model(adaptables = Resource.class, adapters = Button.class)
public class ButtonImpl implements Button {

	@Inject
	@Default(values = "td-button td-button-block td-cta-button td-cta-action td-button-primary")
	private String buttonType;

	@Inject
	@Default(values = "col-7 col-sm-3 col-md-3 col-lg-3")
	private String buttonSize;

	@Override
	public String getButtonType() {
		return buttonType;
	}

	@Override
	public String getButtonSize() {
		return buttonSize;
	}
}