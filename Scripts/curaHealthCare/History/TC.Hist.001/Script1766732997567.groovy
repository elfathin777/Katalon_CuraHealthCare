import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import history.ClickBurgerMenuKeyword as ClickBurgerMenu
import history.ClickHistoryKeyword as ClickHistory
import history.VerifyHistoryKeyword as Verify

WebUI.callTestCase(findTestCase('curaHealthCare/Make Appointment/TC.MakeAppointment.DDT'), [('facility') : 'Tokyo CURA Healthcare Center'
        , ('readmission') : 'uncheck', ('healthcareProgram') : 'Medicare', ('visitDateType') : 'valid', ('comment') : 'First Appointment'], 
    FailureHandling.STOP_ON_FAILURE)

ClickBurgerMenu.clickBurgerMenu()
ClickHistory.clickHistory()
Verify.verifyHistory()


