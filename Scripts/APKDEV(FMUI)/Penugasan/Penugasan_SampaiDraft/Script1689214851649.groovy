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

//Mobile.startExistingApplication('pkp.mobile.fmui')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('HAPUS/android.Page.ProfileView'), 3)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('HAPUS/androidButtonMenu'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/menuPage/android.menuPage.Button.Penugasan'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.cardPenugasan'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.Selanjutnya'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(0, 1926, 0, 1472)

Mobile.verifyElementExist(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.selanjutnyaInformasi'), 
    3)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.selanjutnyaInformasi'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.back(PojokKananAtas)'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.Button.back(PojokKananAtas)'), 0)

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/penugasanPage/android.Penugasan.popUpPage.yesButton'), 0)

