package com.aem.compLib.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(
		adaptables = Resource.class,
		adapters = ConfigManager.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public interface ConfigManager {
	@Inject
	public String getTheme();
	@Inject
	public String getSitename();
}