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

Mobile.startExistingApplication('pkp.mobile.fmui')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.Selanjutnya'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1926, 0, 1472)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.selanjutnyaInformasi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question1'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List1.Question1'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question2'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List1.Question2'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question3'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List3.Question3'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question4 (1)'), 0)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/android.Penugasan.Button.List4.Question4'), 0)

//Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.List1.Question4'), 0)
Mobile.delay(2.5, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1500, 0, 1000)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_ADS/android.Penugasan.Button.Question5'), 
    0)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.List2.Question5'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 700, 0, 500)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Question6'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.OK.Question6'), 
    0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Question7'), 
    0)

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Camera.Question7'), 
    0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Shutter.Question7'), 
    0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Checklist.Question7'), 
    0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Question8'), 
    0)

Mobile.sendKeys(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Question8'), 
    '0825072023')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Question9'), 
    0)

Mobile.sendKeys(findTestObject('PENUGASAN(TEST)/Hasil_BelumAdaKesepakatan/rencanaLanjutan_PickUpUnit/android.Penugasan.Button.Question9'), 
    'Automate TEST 0825072023')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('PENUGASAN(DEV)/android.Penugasan.Button.Submit'), 0)

Mobile.delay(1.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(DEV)/android.Penugasan.Button.backToMainPage'), 0)