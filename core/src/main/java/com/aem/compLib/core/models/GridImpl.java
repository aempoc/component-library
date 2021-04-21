package com.aem.compLib.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(
		adaptables = Resource.class,
		adapters = Grid.class,
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class GridImpl implements Grid {

	@Inject
	private String gridColLg;

	@Inject
	private String gridOffsetLg;

	@Inject
	private String gridColMd;

	@Inject
	private String gridOffsetMd;

	@Inject
	private String gridColSm;

	@Inject
	private String gridOffsetSm;

	@Inject
	private String gridColXs;

	@Inject
	private String gridOffsetXs;

	@Override
	public String getGridColLg() {
		return (null==gridColLg)?"":"td-col-lg-"+gridColLg;
	}

	@Override
	public String getGridOffsetLg() {
		return (null==gridOffsetLg)?"":"td-col-lg-offset-"+gridOffsetLg;
	}

	@Override
	public String getGridColMd() {
		return (null==gridColMd)?"":"td-col-md-"+ gridColMd;
	}

	@Override
	public String getGridOffsetMd() {
		return (null==gridOffsetMd)?"":"td-col-md-offset-"+gridOffsetMd;
	}

	@Override
	public String getGridColSm() {
		return (null==gridColSm)?"":"td-col-sm-"+gridColSm;
	}

	@Override
	public String getGridOffsetSm() {
		return (null==gridOffsetSm)?"":"td-col-sm-offset-"+gridOffsetSm;
	}

	@Override
	public String getGridColXs() {
		return (null==gridColXs)?"":"td-col-xs-"+gridColXs;
	}

	@Override
	public String getGridOffsetXs() {
		return (null==gridOffsetXs)?"":"td-col-xs-offset-"+gridOffsetXs;
	}

}