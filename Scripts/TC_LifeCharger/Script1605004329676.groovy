import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://lifecharger.org')

WebUI.click(findTestObject('Object Repository/LifeChargerOR/Page_Life Charger   a new beginning/a_Stretch Zone  Why Nobody talks about this'))

//WebUI.setText(findTestObject('Object Repository/LifeChargerOR/Page_Life Charger   a new beginning/input_Search for_s'), username)

for(def numRow=1; numRow<=findTestData('myData/testData').getRowNumbers(); numRow++){
	
	WebUI.setText(findTestObject('Object Repository/LifeChargerOR/Page_Life Charger   a new beginning/input_Search for_s'),
		findTestData('myData/testData').getValue(1, numRow))
	Thread.sleep(3000)
}

not_run: WebUI.click(findTestObject('Object Repository/LifeChargerOR/Page_Life Charger   a new beginning/button_Search for_search-submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/LifeChargerOR/Page_Life Charger   a new beginning/a_Home'), 
    0)

WebUI.setText(findTestObject('Object Repository/LifeChargerOR/Page_Life Charger   a new beginning/input_Search for_s'), 
    password)

WebUI.delay(3)

WebUI.closeBrowser()

