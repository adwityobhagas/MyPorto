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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import io.appium.java_client.android.AndroidDriver as AndroidDriver
import io.appium.java_client.android.AndroidKeyCode as AndroidKeyCode
import io.appium.java_client.android.AndroidElement as AndroidElement
import io.appium.java_client.android.nativekey.AndroidKey as AndroidKey
import io.appium.java_client.android.nativekey.KeyEvent as KeyEvent
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

// You can fill it with the 'Package Name' of your Mobile APP (.apk had been installed) 
//using third party app 'Package Names Viewer' 

//Mobile.startApplication('C:\\Adwityo\\FM-UI\\APK-DEV\\fmui-dev-1.91.apk', false)
Mobile.startExistingApplication('pkp.mobile.fmui', FailureHandling.STOP_ON_FAILURE)

// Script for tapping Username Field
Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/loginPage/android.loginPage.Field.Username'), 0)

AndroidDriver<?> driver = MobileDriverFactory.getDriver()

// INPUTING TEXT TO FIELD ON ANDROID 
//driver.getKeyboard().sendKeys("$USER_NAME") Data Driven Testing
driver.getKeyboard().sendKeys('mitra040323')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/loginPage/android.loginPage.Field.Password'), 0)

// INPUTING TEXT TO FIELD ON ANDROID
driver.getKeyboard().sendKeys('1234Qwer')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('androidButtons/FMUI(DEV)/loginPage/androidButtonLogin'), 2)

