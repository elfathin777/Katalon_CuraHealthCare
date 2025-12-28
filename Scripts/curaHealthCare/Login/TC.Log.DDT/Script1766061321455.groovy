<<<<<<< HEAD
import auth.LoginKeywords as Login
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Jalankan login via custom keyword
Login.login(username, password, testCategory)
=======
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (password != 'empty') {
    WebUI.sendKeys(findTestObject('Login_Repo/Password_field'), password)
}

WebUI.click(findTestObject('Login_Repo/BTN_Login'))

if (testCategory != 'P') {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Login_Repo/Warning_failed_message'), 5)
}

>>>>>>> 2f91b01392f1780bdb340d22abef8907cb1366be
