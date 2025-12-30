import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import history.ClickBurgerMenuKeyword as ClickBurgerMenu
import history.ClickHistoryKeyword as ClickHistory
import history.VerifyNoHistoryKeyword as NoHistory

ClickBurgerMenu.clickBurgerMenu()
ClickHistory.clickHistory()
NoHistory.verifyNoHistory()


