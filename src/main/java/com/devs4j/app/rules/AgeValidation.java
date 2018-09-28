/**
 * 
 */
package com.devs4j.app.rules;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

import com.devs4j.app.model.Person;

/**
 * @author raidentrance
 *
 */
@Rule(name = "ageValidation", description = "Validates that the person is greater than 18 years")
public class AgeValidation {

	private static Logger log = Logger.getLogger(AgeValidation.class.getName());

	@Condition
	public boolean isGraterThan18(@Fact("person") Person person) {
		return (person.getAge() >= 18);
	}

	@Action
	public void allowAccess(@Fact("person") Person person) {
		log.log(Level.INFO, String.format("Allow access to the person %s", person));
	}
}
