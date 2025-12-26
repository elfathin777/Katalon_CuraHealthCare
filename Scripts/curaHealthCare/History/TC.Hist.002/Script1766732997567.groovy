import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('BTN_Make_Appointment'))

WebUI.sendKeys(findTestObject('Login_Repo/Username_field'), GlobalVariable.username)

WebUI.sendKeys(findTestObject('Login_Repo/Password_field'), GlobalVariable.password)

WebUI.click(findTestObject('Login_Repo/BTN_Login'))

WebUI.click(findTestObject('Object Repository/icon_burgerMenu'))

WebUI.click(findTestObject('Object Repository/History/historyMenu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/History/historyHeading'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/History/noAppointment_Assertion'), 5)
