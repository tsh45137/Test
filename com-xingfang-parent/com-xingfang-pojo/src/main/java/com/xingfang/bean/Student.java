package com.xingfang.bean;

import org.codehaus.jackson.annotate.JsonProperty;

public class Student {

	private String id;
	private String name;
	private String pId;
	private boolean isParent;
	
	
	public Student(){
		
	}
	
	public Student(String id, String pId,String name) {
		super();
		this.id = id;
		this.name = name;
		this.setpId(pId);
	}

	public Student(String id, String pId,String name,  boolean isParent) {
		super();
		this.id = id;
		this.name = name;
		this.pId = pId;
		this.isParent = isParent;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public boolean isParent() {
		return isParent;
	}

	@JsonProperty(value = "isParent")
	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}
	
}
