package org.studyeasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name ="category_updated")
public class CategoryUpdated {

	@Id
	@Column(name = "category_name")
	String category_name;

	
	public CategoryUpdated() {
	
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	
	
}
