package com.aem.compLib.core.models;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;

@Model(
		adaptables = Resource.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class ConfigManager {
	
	@Inject
	private String theme;
	
	@Inject
	private String sitename;
	
	@SlingObject
    private Resource currentResource;
	
    @SlingObject
    private ResourceResolver resourceResolver;
    
    private String currentPagePath;
    
    @PostConstruct
    protected void init() {
    	PageManager pageManager= currentResource.getResourceResolver().adaptTo(PageManager.class);
    	Page currentPage = pageManager.getContainingPage(currentResource);
    	currentPagePath = currentPage.getPath();
    }
    
    public String getCurrentPagePath() {
    	return currentPagePath;
    }
	
	public String getTheme() {
		return theme;
	}
	
	public String getSitename() {
		return sitename;
	}
}