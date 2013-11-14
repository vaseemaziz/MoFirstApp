package com.app.portal.rest.businessobjects;

import java.util.List;

public class ConfigurationBO {
	private List<String> typeList;
	private List<String> languageList;
	public List<String> getTypeList() {
		return typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}
	public List<String> getLanguageList() {
		return languageList;
	}
	public void setLanguageList(List<String> languageList) {
		this.languageList = languageList;
	}
	
}
