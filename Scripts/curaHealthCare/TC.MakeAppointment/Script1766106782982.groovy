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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

// ==== LOGIN=========
WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.click(findTestObject('BTN_Make_Appointment'))
		

WebUI.acceptAlert()

WebUI.sendKeys(findTestObject('Login_Repo/Username_field'), GlobalVariable.username)

WebUI.sendKeys(findTestObject('Login_Repo/Password_field'), GlobalVariable.password)

WebUI.click(findTestObject('Login_Repo/BTN_Login'))

// ==== MAKE APPOINTMENT ====
WebUI.selectOptionByValue(findTestObject('Make Appointment Repo/Facilty_Dropdown'), facility, false)

WebUI.check(findTestObject('Make Appointment Repo/Readmission_radio'))

WebUI.click(findTestObject('Make Appointment Repo/healthCareProgram_Medicaid'))

// ===== VISIT DATE (DI SINI) =====
WebUI.executeJavaScript((('var d=document.getElementById(\'txt_visit_date\');' + 'd.removeAttribute(\'readonly\');') + 'd.value=\'22/08/2026\';') + 
    'd.blur();', null)

WebUI.executeJavaScript('document.activeElement.blur();', null)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Make Appointment Repo/comment_field'), comment)

WebUI.click(findTestObject('Make Appointment Repo/bookAppointment_BTN'))

WebUI.verifyElementVisible(findTestObject('Make Appointment Repo/Assertion_Success'))

