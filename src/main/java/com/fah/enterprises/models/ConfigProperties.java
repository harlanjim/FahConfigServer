package com.fah.enterprises.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "properties")
public class ConfigProperties {
	
	public ConfigProperties() {
		super();
	}


	public ConfigProperties(Date createdDate, String application, String profile, String label, String propertyKey,
			String value) {
		super();
		this.createdDate = createdDate;
		this.application = application;
		this.profile = profile;
		this.label = label;
		this.propertyKey = propertyKey;
		this.value = value;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "created_on")
	private Date createdDate;
	
	@Column(name = "application")
	private String application;
	
	@Column(name = "profile")
	private String profile;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "prop_key")
	private String propertyKey;
	
	@Column(name = "value")
	private String value;

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getPropertyKey() {
		return propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
