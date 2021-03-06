import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Additional Cases/Device Info'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

if (Mobile.verifyElementExist(findTestObject('Login Page/DESC_WELCOME'), 2, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Additional Cases/Login Dana - User 1919'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in'
}

Mobile.waitForElementPresent(findTestObject('Home Screen - New/img_kfc_newhomepage'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Delivery Order Button')

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/btn_delivery_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Pay & Pick Button')

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_PNP_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/btn_PNP_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on KFC Points Button')

Mobile.verifyElementExist(findTestObject('Home Screen/btn_points_option'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/btn_points_option'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/txt_kfcpoint_amt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/txt_kfcpoint_amt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on History Button')

Mobile.verifyElementExist(findTestObject('Home Screen/btn_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/btn_history'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Profile Button')

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_userprofile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/btn_userprofile'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on KFC Logo on Homepage')

Mobile.verifyElementExist(findTestObject('Home Screen - New/img_kfc_newhomepage'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/img_kfc_newhomepage'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Ongoing Promo')

Mobile.verifyElementExist(findTestObject('Home Screen - New/img_ongoingpromo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/img_ongoingpromo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/btn_ongoingpromo_viewall_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/btn_ongoingpromo_viewall_new'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/img_banner_promo_1'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/img_banner_promo_1'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/page_1_promo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/page_1_promo'), 2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.comment('Quick Check on Bottom Bar')

Mobile.verifyElementExist(findTestObject('Home Screen/icon_home_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/icon_home_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/title_home_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/title_home_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Screen/title_home_bottombar'), 'Home', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/icon_earnpay_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/icon_earnpay_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen - New/title_yourQR_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen - New/title_yourQR_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Screen - New/title_yourQR_bottombar'), 'Your QR', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/icon_voucher_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/icon_voucher_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Home Screen/title_voucher_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Home Screen/title_voucher_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Home Screen/title_voucher_bottombar'), 'Voucher', FailureHandling.CONTINUE_ON_FAILURE)

