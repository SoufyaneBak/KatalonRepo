$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/test.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test Login with correct credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate to \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "enter a valide login \"\u003clogin\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "name": "navigate to the home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "login",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test Login with correct credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "navigate to \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepDef.navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter a valide login \"admin\" and password \"hUKwJTbofgPU9eVlw/CnDQ\u003d\u003d\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestStepDef.enter_a_valide_login_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDef.click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDef.navigate_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});