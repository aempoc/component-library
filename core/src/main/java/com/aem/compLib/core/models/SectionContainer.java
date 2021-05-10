package com.aem.compLib.core.models;

import java.util.List;

public interface SectionContainer {
	public String getColumn();
	
	public List<String> getColumnList();
	
	public String getContainerMeta();
	
	public String getSectionClass();
	
	public String getBgColor();
}