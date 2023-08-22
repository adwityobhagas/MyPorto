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

Mobile.startExistingApplication('pkp.mobile.fmui', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question1'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List1.Question1'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question2'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List1.Question2'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question3'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List3.Question3'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question4 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List1.Question4'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question5'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List2.Question5'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.datePicker.Question6'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.datePicker(OK).Question6'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question7'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List.Question7'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1500, 0, 995)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question8'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Camera.Question8'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Shutter.Question8'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Checklist.Question8'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question10'), 0)

Mobile.sendKeys(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question10'), 'AUTOMATE TEST 21072023')

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question8 (1)'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List1.Question8'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question9'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Camera.Question9'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Shutter.Question9'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Checklist.Question9'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question11'), 0)

Mobile.sendKeys(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question11'), 'AUTOMATE TEST 21072023')

Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Submit'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.backToMainPage'), 0)

Mobile.closeApplication()

