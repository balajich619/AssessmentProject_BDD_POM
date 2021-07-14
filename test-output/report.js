$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/CucumberPOM_BDD/src/main/java/com/qa/feature/values.feature");
formatter.feature({
  "line": 1,
  "name": "Mass Mutual QA Assessment - Values",
  "description": "",
  "id": "mass-mutual-qa-assessment---values",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Validate Value details",
  "description": "",
  "id": "mass-mutual-qa-assessment---values;validate-value-details",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on Values Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "validate the count of values in the screen",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate values are greater than zero",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate the total balance",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate the currency format of the values",
  "keyword": "Then "
});
formatter.match({
  "location": "ValuesSteps.user_is_on_Values_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValuesSteps.validate_the_count_of_values_in_the_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValuesSteps.validate_values_are_greater_than_zero()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValuesSteps.validate_the_total_balance()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValuesSteps.validate_the_currency_format_of_the_values()"
});
formatter.result({
  "status": "skipped"
});
});