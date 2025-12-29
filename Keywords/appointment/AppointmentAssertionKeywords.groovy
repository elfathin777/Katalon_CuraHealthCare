package appointment
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


class AppointmentAssertionKeywords {
	@Keyword
	static void appointmentAssertion(String visitDateType) {
		if (visitDateType == 'valid') {
			WebUI.verifyElementVisible(findTestObject('Make Appointment Repo/Assertion_Success'))
		} else {
			WebUI.verifyElementVisible(
					findTestObject('Make Appointment Repo/visit_date')
					)
		}
	}
}