import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import history.ClickBurgerMenuKeyword as ClickBurgerMenu
import history.ClickHistoryKeyword as ClickHistory
import history.VerifyHistoryKeyword as Verify

def appointmentData = [
	[('facility') : 'Tokyo CURA Healthcare Center', 
		('readmission') : 'uncheck', 
		('healthcareProgram') : 'Medicare', 
		('visitDateType') : 'valid', 
		('comment') : 'First Appointment'
		], 
	
	[('facility') : 'Seoul CURA Healthcare Center', 
		('readmission') : 'check', 
		('healthcareProgram') : 'Medicaid', 
		('visitDateType') : 'valid', 
		('comment') : 'Second Appointment'
		]
	]

for (def data : appointmentData) {
    WebUI.callTestCase(findTestCase('curaHealthCare/Make Appointment/TC.MakeAppointment.DDT'), data, FailureHandling.STOP_ON_FAILURE)
	
	// Tunggu halaman success make appointment muncul
	WebUI.verifyElementPresent(findTestObject('Object Repository/Make Appointment Repo/Assertion_Success'), 5)

	// Kembali ke homepage untuk input data berikutnya
	WebUI.click(findTestObject('Object Repository/History/gotoHomePage_BTN'))

	// Verifikasi form Make Appointment sudah muncul
	WebUI.verifyElementPresent(findTestObject('Object Repository/Make Appointment Repo/Facilty_Dropdown'), 5)
}

ClickBurgerMenu.clickBurgerMenu()
ClickHistory.clickHistory()
Verify.verifyHistory()

