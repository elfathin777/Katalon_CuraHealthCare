import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.SetUp
import com.kms.katalon.core.annotation.SetupTestCase
import com.kms.katalon.core.annotation.TearDown
import com.kms.katalon.core.annotation.TearDownTestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import auth.LoginKeywords
import internal.GlobalVariable

@SetupTestCase(skipped = false)
def setupTestCase() {
	WebUI.openBrowser('')
	WebUI.navigateToUrl(GlobalVariable.URL)
	WebUI.click(findTestObject('BTN_Make_Appointment'))
	LoginKeywords.login(GlobalVariable.username, GlobalVariable.password, 'P')
}

@TearDownTestCase(skipped = true) // Please change skipped to be false to activate this method.
def tearDownTestCase() {
	WebUI.closeBrowser()
}
