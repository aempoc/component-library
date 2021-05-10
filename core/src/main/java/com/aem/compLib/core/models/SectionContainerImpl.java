package com.aem.compLib.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = Resource.class, adapters = SectionContainer.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class SectionContainerImpl implements SectionContainer {

	@Inject
	@Default(values = "1")
	private String column;

	@Inject
	private String containerMeta;

	@Inject
	private String sectionClass;

	@Inject
	@Default(values = "")
	private String bgColor;

	private List<String> columnList =  new ArrayList<>();

	@Override
	public String getColumn() {
		//setColumnList();
		return column;
	}

	@Override
	public String getContainerMeta() {
		return containerMeta;
	}

	@Override
	public String getSectionClass() {
		return sectionClass;
	}

	@Override
	public String getBgColor() {

		return bgColor;
	}

	@Override
	public List<String> getColumnList() {

		return columnList;
	}

	public void setColumnList() {
		for (int i = 1; i <= Integer.parseInt(column); i++) {
			columnList.add(String.valueOf(i));
		}
	}

	@PostConstruct
	protected void init() {
		setColumnList();
	}

}