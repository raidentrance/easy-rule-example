/**
 * 
 */
package com.devs4j.app;

import java.util.ArrayList;
import java.util.List;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

import com.devs4j.app.model.Person;
import com.devs4j.app.rules.AgeValidation;

/**
 * @author raidentrance
 *
 */
public class RuleSampleApplication {

	public static Rules getRules() {
		Rules rules = new Rules();
		rules.register(new AgeValidation());
		return rules;
	}

	public static List<Person> getPeople() {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alex", "raiden", "bautista", 18));
		people.add(new Person("Juan", "juan123", "ramírez", 17));
		people.add(new Person("Pedro", "pedro123", "hernandez", 30));
		people.add(new Person("Arturo", "artur2019", "juarez", 15));
		people.add(new Person("Edgar", "edgar1020", "sanchez", 18));
		people.add(new Person("Oscar", "oscar11", "perez", 4));
		people.add(new Person("Hugo", "hugiño", "lopez", 10));
		return people;
	}

	public static void main(String[] args) {
		RulesEngine rulesEngine = new DefaultRulesEngine();
		for (Person person : getPeople()) {
			Facts fact = new Facts();
			fact.put("person", person);
			rulesEngine.fire(getRules(), fact);
		}
	}
}
