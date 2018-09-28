/**
 * 
 */
package com.devs4j.app;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

import com.devs4j.app.model.Person;
import com.devs4j.app.rules.AgeValidation;

/**
 * @author maagapi
 *
 */
public class RuleSampleApplication {

	public static Rules getRules() {
		Rules rules = new Rules();
		rules.register(new AgeValidation());
		return rules;
	}

	public static void main(String[] args) {
		Facts facts = new Facts();
		facts.put("person", new Person("Alex", "raiden", "Bautista", 18));

		RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(getRules(), facts);
	}
}
