$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/SignUp.feature");
formatter.feature({
  "name": "Sign up Functionality in Swiggy Website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Search"
    }
  ]
});
formatter.scenario({
  "name": "Provide the SignUp Functions to Swiggy Users",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is on the Swiggy Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwiggySignup.the_user_isn_on_the_swiggy_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on SignUp",
  "keyword": "When "
});
formatter.match({
  "location": "SwiggySignup.user_click_on_signup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be redirected to SignUp Page",
  "keyword": "Then "
});
formatter.match({
  "location": "SwiggySignup.user_should_be_redirected_to_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Provide the SignUp Function to Swiggy Users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "The user is already on the SignUp page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enters \"\u003cmobile\u003e\" \"\u003cusername\u003e\" \"\u003cemail\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Click Continue button",
  "keyword": "And "
});
formatter.step({
  "name": "User should be able to SignUp",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "mobile",
        "username",
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "1234567897",
        "Shaun",
        "Shaun@xyz.com",
        "abcd1234"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Provide the SignUp Function to Swiggy Users",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Search"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user is already on the SignUp page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwiggySignup.the_user_is_already_on_the_signup_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"1234567897\" \"Shaun\" \"Shaun@xyz.com\" \"abcd1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "SwiggySignup.user_enters_something_something_something_something(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "SwiggySignup.user_click_contiue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to SignUp",
  "keyword": "Then "
});
formatter.match({
  "location": "SwiggySignup.user_should_be_able_to_signup()"
});
formatter.result({
  "status": "passed"
});
});