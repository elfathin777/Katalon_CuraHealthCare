import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

if (password != 'empty') {
    WebUI.sendKeys(findTestObject('Login_Repo/Password_field'), password)
}

WebUI.click(findTestObject('Login_Repo/BTN_Login'))

if (testCategory != 'P') {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Login_Repo/Warning_failed_message'), 5)
}

