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
	public Resource getDesktopImage();
	@Inject
	public Resource getLandscapeImage();
	@Inject
	public Resource getPortraitImage();
	@Inject
	public Resource getMobileImage();
	@Inject
	public String getTitle();
	@Inject
	public String getDescription();
}