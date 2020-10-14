$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/featureFiles/AmazonProductSearch.feature");
formatter.feature({
  "name": "Amazon product search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "searching mobiles",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on amazon search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.AmazonProductSearchDefinition.user_is_on_amazon_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters searchterm \"iphones\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.AmazonProductSearchDefinition.user_enters_searchterm(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user get the name and price of the products",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.AmazonProductSearchDefinition.user_get_the_name_and_price_of_the_cart_products()"
});
formatter.result({
  "status": "passed"
});
});