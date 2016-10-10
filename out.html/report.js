$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myfirstcucumberfeature.feature");
formatter.feature({
  "line": 1,
  "name": "A simple google homepage test",
  "description": "",
  "id": "a-simple-google-homepage-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Asserting the title of google homepage",
  "description": "",
  "id": "a-simple-google-homepage-test;asserting-the-title-of-google-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I initilize the firefox browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I am on google homepage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I validate the title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I quit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "FirstStepDefinition.i_initilize_the_firefox_browser()"
});
formatter.result({
  "duration": 4529672908,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinition.i_am_on_google_homepage()"
});
formatter.result({
  "duration": 1854619562,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinition.i_validate_the_title_of_the_page()"
});
formatter.result({
  "duration": 9082120,
  "status": "passed"
});
formatter.match({
  "location": "FirstStepDefinition.i_quit_the_browser()"
});
formatter.result({
  "duration": 129007585,
  "status": "passed"
});
});