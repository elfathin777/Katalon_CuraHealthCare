import auth.LoginKeywords as Login
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

// Jalankan login via custom keyword
Login.login(username, password, testCategory)
