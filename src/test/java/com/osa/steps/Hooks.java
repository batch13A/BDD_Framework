package com.osa.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
		@Before
		public void beforeHook() {
			System.out.println("+++++++++Before Scenario++++++++++");
		}
		@After
		public void afterHook() {
			System.out.println("------------After Scenario-----------");
		}
		@Before("@about,@forumPage")
		public void beforeTagHook() {
			System.out.println("=================This is before Tag hook+========");
		}
		@After("@forumPage")
		public void afaterTagHook() {
			System.out.println("=================This is after Tag hook+========");
		}
}
