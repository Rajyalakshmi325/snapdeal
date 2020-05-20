$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Feature/Categories.feature");
formatter.feature({
  "line": 1,
  "name": "Snapdeal  Categories AddtoCart Page",
  "description": "",
  "id": "snapdeal--categories-addtocart-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "snapdeal Categories AddtoCart Page",
  "description": "",
  "id": "snapdeal--categories-addtocart-page;snapdeal-categories-addtocart-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "open the website Page and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the Credentials",
  "rows": [
    {
      "cells": [
        "rajyalakshmi325@gmail.com",
        "Raji@26"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user name on the Home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "move to the categories",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select The Product",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks On Product",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user wants to add the product to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "CategoriesStepDef.open_the_website_Page_and_enter_the_url()"
});
formatter.result({
  "duration": 20538611600,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesStepDef.user_enters_the_Credentials(DataTable)"
});
formatter.result({
  "duration": 1924159100,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesStepDef.user_name_on_the_Home_page()"
});
formatter.result({
  "duration": 3019339900,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesStepDef.move_to_the_categories()"
});
formatter.result({
  "duration": 5149152000,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesStepDef.user_select_the_Product()"
});
formatter.result({
  "duration": 7525891400,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesStepDef.user_clicks_On_Product()"
});
formatter.result({
  "duration": 1000169300,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesStepDef.user_wants_to_add_the_product_to_cart()"
});
formatter.result({
  "duration": 6048395400,
  "status": "passed"
});
formatter.match({
  "location": "CategoriesStepDef.close_The_Browser()"
});
formatter.result({
  "duration": 943332000,
  "status": "passed"
});
});