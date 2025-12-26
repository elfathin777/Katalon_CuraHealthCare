import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('BTN_Make_Appointment'))

WebUI.callTestCase(findTestCase('curaHealthCare/Make Appointment/TC.MakeAppointment.DDT'), [('facility') : 'Tokyo CURA Healthcare Center'
        , ('readmission') : 'uncheck', ('healthcareProgram') : 'Medicare', ('visitDateType') : 'valid', ('comment') : 'First Appointment'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/icon_burgerMenu'))

WebUI.click(findTestObject('Object Repository/History/historyMenu'))

WebUI.verifyElementPresent(findTestObject('Object Repository/History/historyHeading'), 5)

WebUI.verifyElementPresent(findTestObject('Object Repository/History/successAssertionHeading'), 5)

