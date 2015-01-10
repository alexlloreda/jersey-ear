package com.alex.jersey;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import com.alex.jersey.resources.SimpleResource;

/**
 * @author alex
 *
 */
public class BaseApplication extends Application {

	private final Set<Class<?>> classes = new HashSet<>();

	public BaseApplication() {
		classes.add(SimpleResource.class);
	}

	@Override
	public Set<Class<?>> getClasses() {
		return Collections.unmodifiableSet(classes);
	}
}
