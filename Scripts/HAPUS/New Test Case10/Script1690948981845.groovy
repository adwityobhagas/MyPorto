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

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question4'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question4.List6'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question5'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question5.List1'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1950, 0, 1460)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question8'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question8'), 
    '10000000')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question9'), 
    0)

Mobile.sendKeys(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question9'), 
    '1000000')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('null'), 
    0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question10.List1'), 
    0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question11.Camera'), 
    0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question12'), 
    0)

Mobile.sendKeys(findTestObject(''), '08080220023')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_PelunasanNormal/android.Penugasan.Button.Question13'), 
    0)

Mobile.sendKeys(findTestObject(''), 'AUTOMATED 08022023')

Mobile.hideKeyboard()

Mobile.closeApplication()

