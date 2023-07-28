$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile1/ScenarioOutline.feature");
formatter.feature({
  "name": "To verify the login functionality.",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "To validate login function valid and invalid datas.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "To user launch Chrome browser.",
  "keyword": "Given "
});
formatter.step({
  "name": "To user enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\".",
  "keyword": "When "
});
formatter.step({
  "name": "To user click login button.",
  "keyword": "And "
});
formatter.step({
  "name": "To user verify the valid.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "java",
        "1111"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate login function valid and invalid datas.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To user launch Chrome browser.",
  "keyword": "Given "
});
formatter.match({
  "location": "WithHeader.toUserLaunchChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user enter \"java\" and \"1111\".",
  "keyword": "When "
});
formatter.match({
  "location": "ScenarioOutlineLogin.toUserEnterAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user click login button.",
  "keyword": "And "
});
formatter.match({
  "location": "WithHeader.toUserClickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To user verify the valid.",
  "keyword": "Then "
});
formatter.match({
  "location": "ScenarioOutlineLogin.toUserVerifyTheValid()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cbutton value\u003d\"1\" class\u003d\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\" name\u003d\"login\" data-testid\u003d\"royal_login_button\" type\u003d\"submit\" id\u003d\"u_0_5_L2\"\u003e...\u003c/button\u003e is not clickable at point (959, 304). Other element would receive the click: \u003cdiv class\u003d\"_3ixn\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d114.0.5735.199)\nBuild info: version: \u00274.10.0\u0027, revision: \u0027c14d967899\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_361\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [13e1b4acc810cc59f018ab4613abad8c, clickElement {id\u003d1CC0C320A012CC825E4D3D8D7B8F881F_element_16}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.199, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\Computer\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52994}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:52994/devtoo..., se:cdpVersion: 114.0.5735.199, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on windows (13e1b4acc810cc59f018ab4613abad8c)] -\u003e name: login]\nSession ID: 13e1b4acc810cc59f018ab4613abad8c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:199)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:132)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:51)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:531)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:242)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy22.click(Unknown Source)\r\n\tat org.base.BaseClasses.clickElement(BaseClasses.java:120)\r\n\tat org.stepdefintion.ScenarioOutlineLogin.toUserVerifyTheValid(ScenarioOutlineLogin.java:24)\r\n\tat ✽.To user verify the valid.(file:src/test/resources/FeatureFile1/ScenarioOutline.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});