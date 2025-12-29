package appointment

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class AppointmentSubmitKeywords {

	@Keyword
	static void appointmentSubmit() {
		WebUI.click(findTestObject('Object Repository/Make Appointment Repo/bookAppointment_BTN'))
	}
}
