package com.sehatQ

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.logging.KeywordLogger

import internal.GlobalVariable

public class Utility {

	KeywordLogger log = new KeywordLogger()

	def openUrl(String url) {
		WebUI.maximizeWindow()
		WebUI.navigateToUrl(url)
		WebUI.waitForPageLoad(30)
		WebUI.delay(3)
	}

	@Keyword
	def loginByEmail(String username, String password) {
		WebUI.setText(findTestObject('Home Page/Login/Login By Email/txtEmail'), username)
		WebUI.setText(findTestObject('Home Page/Login/Login By Email/txtPassword'), password)
		WebUI.click(findTestObject('Home Page/Login/Login By Email/btnLogin'))
		WebUI.waitForPageLoad(30)
		WebUI.delay(3)
	}

	@Keyword
	def loginByFB(String username, String password) {
		WebUI.setText(findTestObject('Home Page/Login/Login By FB/txtEmailFB'), username)
		WebUI.setText(findTestObject('Home Page/Login/Login By FB/txtPasswordFb'), password)
		WebUI.delay(3)
		WebUI.click(findTestObject('Home Page/Login/Login By FB/btnLoginFB'))
		WebUI.waitForPageLoad(30)
		WebUI.delay(3)
	}
}
