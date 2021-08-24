package com.aem.compLib.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(
		adaptables = Resource.class,
		adapters = CustomTeaser.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public interface CustomTeaser {
	@Inject
	public String getDesktopImage();
	@Inject
	public String getLandscapeImage();
	@Inject
	public String getPortraitImage();
	@Inject
	public String getMobileImage();
	@Inject
	public String getTitle();
	@Inject
	public String getDescription();
}