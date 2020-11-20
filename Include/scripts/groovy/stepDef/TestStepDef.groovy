package stepDef
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class TestStepDef {
	
	@Given("navigate to {string}")
	def navigate_to(String url) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(url)
	}
	
	@When("enter a valide login {string} and password {string}")
	def enter_a_valide_login_and_password(String login, String password) {
		
		WebUI.click(findTestObject('Object Repository/OrangeHRMOR/Page_OrangeHRM/span_Username'))
		WebUI.setText(findTestObject('Object Repository/OrangeHRMOR/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), login)
		WebUI.setEncryptedText(findTestObject('Object Repository/OrangeHRMOR/Page_OrangeHRM/input_Username_txtPassword'), password)
		
	}
	
	@When("click on submit")
	def click_on_submit() {
		
		WebUI.click(findTestObject('Object Repository/OrangeHRMOR/Page_OrangeHRM/input_Password_Submit'))
	}
	
	@Then("navigate to the home page")
	def navigate_to_the_home_page() {
		
		WebUI.verifyElementPresent(findTestObject('Object Repository/OrangeHRMOR/Page_OrangeHRM/b_Dashboard'), 0)
		WebUI.closeBrowser()
	}
}