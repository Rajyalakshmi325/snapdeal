$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/main/java/Feature/SecurePayment.feature");
formatter.feature({
  "line": 1,
  "name": "Snapdeal SecurePayment Page",
  "description": "",
  "id": "snapdeal-securepayment-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Snapdeal SecurePayment Page",
  "description": "",
  "id": "snapdeal-securepayment-page;snapdeal-securepayment-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "open the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters user credentials",
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
  "name": "user name is the page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on the Snapdeal SecurePayment",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the web browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SecurePaymentStepDef.open_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 19284665000,
  "status": "passed"
});
formatter.match({
  "location": "SecurePaymentStepDef.user_enters_user_credentials(DataTable)"
});
formatter.result({
  "duration": 6208761000,
  "status": "passed"
});
formatter.match({
  "location": "SecurePaymentStepDef.user_name_is_the_page()"
});
formatter.result({
  "duration": 3017532700,
  "status": "passed"
});
formatter.match({
  "location": "SecurePaymentStepDef.click_on_the_Snapdeal_SecurePayment()"
});
formatter.result({
  "duration": 2547933600,
  "status": "passed"
});
formatter.match({
  "location": "SecurePaymentStepDef.close_the_web_browser()"
});
formatter.result({
  "duration": 1003125000,
  "status": "passed"
});
});