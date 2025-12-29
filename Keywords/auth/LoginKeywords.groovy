package auth

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

class LoginKeywords {

	@Keyword
	static void login(String username, String password, String testCategory) {
		WebUI.waitForElementVisible(findTestObject('Login_Repo/Username_field'), 10)

		if (username != 'empty') {
			WebUI.setText(findTestObject('Login_Repo/Username_field'), username)
		}


		if (password != 'empty') {
			WebUI.setText(findTestObject('Login_Repo/Password_field'), password)
		}

		WebUI.click(findTestObject('Login_Repo/BTN_Login'))

		if (testCategory != 'P') {
			WebUI.waitForElementPresent(findTestObject('Login_Repo/Warning_failed_message'), 5)
		}
	}
}
