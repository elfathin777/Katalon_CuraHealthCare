package appointment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

class appointmentFormKeywords {
	@Keyword
	static void appointmentForm(String facility, String readmission, String healthcareProgram, String visitDateType, String comment) {
		WebUI.delay(2)
		// Dropdown Facility
		if (facility == 'Tokyo CURA Healthcare Center') {
			WebUI.selectOptionByValue(findTestObject('Object Repository/Make Appointment Repo/Facilty_Dropdown'), facility, false)
		}
		else if (facility == 'Hongkong CURA Healthcare Center') {
			WebUI.selectOptionByValue(findTestObject('Object Repository/Make Appointment Repo/Facilty_Dropdown'), facility, false)
		}
		else if (facility == 'Seoul CURA Healthcare Center') {
			WebUI.selectOptionByValue(findTestObject('Object Repository/Make Appointment Repo/Facilty_Dropdown'), facility, false)
		}

		// readmission
		if (readmission == 'check') {
			WebUI.check(findTestObject('Object Repository/Make Appointment Repo/Readmission_radio'))
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


		WebUI.setText(findTestObject('Object Repository/Make Appointment Repo/comment_field'), comment)
	}
}