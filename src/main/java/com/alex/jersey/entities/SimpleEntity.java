package com.alex.jersey.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author alex
 *
 */
public class SimpleEntity {

	public String name = "Alex";

	@JsonIgnore
	private String other = "Other";
}
