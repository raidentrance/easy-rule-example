/**
 * 
 */
package com.devs4j.app.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

import com.devs4j.app.model.Person;

/**
 * @author maagapi
 *
 */
@Rule(name = "ageValidation", description = "Validates that the person is greater than 18 years")
public class AgeValidation {

	@Condition
	public boolean isGraterThan18(@Fact("person") Person person) {
		return (person.getAge() >= 18);
	}

	@Action
	public void allowAccess(@Fact("person") Person person) {
		System.out.println("Allow access to the person"+person );
	}
}
