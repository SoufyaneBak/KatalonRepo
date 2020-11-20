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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.chanel.com/#languages')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/ChanelOR/Page_CHANEL Official Website/button_EUROPE'))

WebUI.click(findTestObject('Object Repository/ChanelOR/Page_CHANEL Official Website/a_france'))

WebUI.click(findTestObject('Object Repository/ChanelOR/Page_CHANEL Site Officiel  Mode, Parfum, Be_976de9/svg_Rechercher_icon is-large  is-account'))

WebUI.click(findTestObject('ChanelOR/Page_CHANEL Official Website/Page_CHANEL Site Officiel  Mode, Parfum, Beaut, Horlogerie, Joaillerie  CHANEL/button_Autoriser tous les cookies'))

WebUI.click(findTestObject('Object Repository/ChanelOR/Page_Crer un compte  CHANEL/a_Connexion'))

WebUI.setText(findTestObject('Object Repository/ChanelOR/Page_Connexion  CHANEL/input_e-mail_username'), 'trrr@gmail.com')

WebUI.click(findTestObject('ChanelOR/Page_Connexion  CHANEL/label_Mot de passe'))

WebUI.setEncryptedText(findTestObject('Object Repository/ChanelOR/Page_Connexion  CHANEL/input_Mot de passe_password'), 
    'RigbBhfdqOD+04WBHw5iKw==')

WebUI.click(findTestObject('Object Repository/ChanelOR/Page_Connexion  CHANEL/span_Connexion'))

WebUI.verifyElementText(findTestObject('Object Repository/ChanelOR/Page_Connexion  CHANEL/p_Votre adresse e-mail ou mot de passe sont_da6aea'), 
    'Votre adresse e-mail ou mot de passe sont incorrects. Veuillez réessayer ou réinitialiser votre mot de passe.')

WebUI.closeBrowser()

