import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

// Login
//WebUI.sendKeys(findTestObject('Login_Repo/Username_field'), GlobalVariable.username)
//WebUI.sendKeys(findTestObject('Login_Repo/Password_field'), GlobalVariable.password)
//WebUI.click(findTestObject('Login_Repo/BTN_Login'))

// Dropdown Facility
if (facility == 'Tokyo CURA Healthcare Center') {
	WebUI.selectOptionByValue(findTestObject('Make Appointment Repo/Facilty_Dropdown'), facility, false)
}
else if (facility == 'Hongkong CURA Healthcare Center') {
	WebUI.selectOptionByValue(findTestObject('Make Appointment Repo/Facilty_Dropdown'), facility, false)
}
else if (facility == 'Seoul CURA Healthcare Center') {
	WebUI.selectOptionByValue(findTestObject('Make Appointment Repo/Facilty_Dropdown'), facility, false)
}

// readmission
if (readmission == 'check') {
	WebUI.check(findTestObject('Make Appointment Repo/Readmission_radio'))	
}

// healthcare program
if (healthcareProgram == "Medicaid") {
	WebUI.click(findTestObject('Object Repository/Make Appointment Repo/healthCareProgram_Medicaid'))
}

else if (healthcareProgram == "Medicare") {
	WebUI.click(findTestObject('Object Repository/Make Appointment Repo/healthCareProgram_Medicare'))
}

else {
	WebUI.click(findTestObject('Object Repository/Make Appointment Repo/healthCareProgram_None'))
}

// visit date
if (visitDateType == "valid") {
	WebUI.executeJavaScript((('var d=document.getElementById(\'txt_visit_date\');' + 'd.removeAttribute(\'readonly\');') + 'd.value=\'24/12/2030\';') + 'd.blur();', null)
}
else if (visitDateType == "past") {
	WebUI.executeJavaScript((('var d=document.getElementById(\'txt_visit_date\');' + 'd.removeAttribute(\'readonly\');') + 'd.value=\'24/12/2020\';') + 'd.blur();', null)
}

WebUI.delay(1)

WebUI.sendKeys(findTestObject('Make Appointment Repo/comment_field'), comment)

WebUI.click(findTestObject('Make Appointment Repo/bookAppointment_BTN'))

// assertion
if (visitDateType == 'valid') {
	WebUI.verifyElementVisible(findTestObject('Make Appointment Repo/Assertion_Success'))
} else {
	WebUI.verifyElementVisible(
		findTestObject('Make Appointment Repo/visit_date')
	)
}

WebUI.delay(1)

