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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://motif-dev.fifgroup.co.id/#/')

WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/loginPage/input_Username_form-control ng-untouched ng_437d41'))

WebUI.setText(findTestObject('WEBDEV(FMUI)/loginPage/input_Username_form-control ng-untouched ng_437d41'), '15958')

WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/loginPage/input_Password_userPassword'))

WebUI.setEncryptedText(findTestObject('WEBDEV(FMUI)/loginPage/input_Password_userPassword'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/loginPage/button_Masuk'))

WebUI.enhancedClick(findTestObject('Object Repository/WEBDEV(FMUI)/task_taskDistribution/buttonTASK'))

WebUI.enhancedClick(findTestObject('Object Repository/WEBDEV(FMUI)/task_taskDistribution/buttonDistributionTask'))

WebUI.enhancedClick(findTestObject('WEBDEV(FMUI)/task_taskDistribution/ddl_NamaMitra'))

WebUI.waitForAngularLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('WEBDEV(FMUI)/task_taskDistribution/DropdownMitra'))

