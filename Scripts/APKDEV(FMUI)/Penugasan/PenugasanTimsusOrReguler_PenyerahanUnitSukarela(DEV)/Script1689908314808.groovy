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

//Mobile.startExistingApplication('pkp.mobile.fmui', FailureHandling.STOP_ON_FAILURE)
Mobile.startExistingApplication('pkp.mobile.fmui')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.Selanjutnya'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1926, 0, 1472)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.selanjutnyaInformasi'), 0)

Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.Question1'), 
    0)

Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.DDL1.List1'), 0)

//Mobile.tap(findTestObject('Object Repository/HAPUS/android.view.View'), 0)
//
//Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.DDL1.List2'), 0)
//
//Mobile.tap(findTestObject('Object Repository/HAPUS/android.view.View (1)'), 0)
//
//Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.DDL1.List3'), 0)
//
//Mobile.tap(findTestObject('Object Repository/HAPUS/android.view.View (2)'), 0)
//
//Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.DDL1.List4'), 0)
//
//Mobile.tap(findTestObject('Object Repository/HAPUS/android.view.View (3)'), 0)
//
//Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.DDL1.List5'), 0)
Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.Question2'), 
    0)

Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.DDL2.List1'), 0)

Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.Question3'), 
    0)

Mobile.tap(findTestObject('Object Repository/androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.DDL3.List1'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question4'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question4.DDL3(PU)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 2100, 0, 1745)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question5(PU)'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('PENUGASAN(DEV)/android.Penugasan.Button.Question5.DDL1(PU)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question6(PU)'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.OKDatePicker.Question6'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question7(PU)'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question7.DDL1(PU)'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question8(PU)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question8.CameraButton(PU)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question8.CameraButton.Shutter(PU)'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question8.CameraButton.Checklist(PU)'), 
    0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question9(PU)'), 0)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question9.DDL(PU)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question10(PU).Nomor Telepon Aktif Konsumen'), 
    0)

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question10(PU).Nomor Telepon Aktif Konsumen'), 
    '0818072023')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question11(PU).KronologiSingkat'), 0)

Mobile.hideKeyboard()

Mobile.sendKeys(findTestObject('Object Repository/PENUGASAN(DEV)/android.Penugasan.Button.Question11(PU).KronologiSingkat(Input)'), 
    'automation 18072023')

Mobile.hideKeyboard()

Mobile.delay(0.5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.Submit'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.backToMainPage'), 0)

