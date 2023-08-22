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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://motif-dev.fifgroup.co.id/#/')

WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/loginPage/input_Username_form-control ng-untouched ng_437d41'))

WebUI.sendKeys(findTestObject('WEBDEV(FMUI)/loginPage/input_Username_form-control ng-untouched ng_437d41'), '60534')

//DATA DRIVEN TESTING
//WebUI.sendKeys(findTestObject('WEBDEV(FMUI)/loginPage/input_Username_form-control ng-untouched ng_437d41'), "$USER_CODE")
WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/loginPage/input_Password_userPassword'))

WebUI.setEncryptedText(findTestObject('WEBDEV(FMUI)/loginPage/input_Password_userPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/loginPage/button_Masuk'))

WebUI.delay(2)

//WebUI.clickOffset(findTestObject('WEBDEV(FMUI)/mainPage/Dropdown_Logout'), 0, 5)

WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/mainPage/Dropdown_Logout'))

