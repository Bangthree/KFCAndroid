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

Mobile.comment('Earn Page Components check started')

if (Mobile.verifyElementExist(findTestObject('Session Time Out/Session Time Out - Title'), 2, FailureHandling.OPTIONAL) == 
true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Additional Cases/Session Time Out Reset'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Session is new'
}

if (Mobile.verifyElementExist(findTestObject('Login Page/DESC_WELCOME'), 2, FailureHandling.OPTIONAL) == true) {
    Mobile.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

    WebUI.callTestCase(findTestCase('Additional Cases/Login Dana - User 1919'), [:], FailureHandling.STOP_ON_FAILURE)
} else {
    println = 'Logged in, Homepage ready'
}

Mobile.verifyElementExist(findTestObject('Home Screen/btn_home_bottombar'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_earnpay_bottombar'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(500, 800, 500, 1500, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/title_header_yourQR'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/title_header_yourQR'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/btn_header_earn_refresh'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/btn_header_earn_refresh'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/container_points_earn_red'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/container_points_earn_red'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_acquired_yourQR_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_acquired_yourQR_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Your QR Page - New/desc_acquired_yourQR_month'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_acquired_yourQR_monthamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_acquired_yourQR_monthamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Your QR Page - New/desc_acquired_yourQR_monthamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_acquired_yourQR_today'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_acquired_yourQR_today'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_acquired_yourQR_todayamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_acquired_yourQR_todayamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Your QR Page - New/desc_acquired_yourQR_todayamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_points_yourQR_KFCpointsamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_points_yourQR_KFCpointsamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Your QR Page - New/desc_points_yourQR_KFCpointsamt'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_points_earn_mybalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_points_earn_mybalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Your QR Page - New/desc_points_earn_mybalance'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/img_points_earn_KFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/img_points_earn_KFC'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/progressbar_acquired_yourQR_daily'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/progressbar_acquired_yourQR_daily'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/progressbar_acquired_yourQR_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/progressbar_acquired_yourQR_month'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/img_earn_QRCode'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/img_earn_QRCode'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.swipe(500, 1500, 500, 800, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_earn_scanaboveQR'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_earn_scanaboveQR'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_yourQR_finishyour'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_yourQR_finishyour'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/desc_yourQR_earnKFCpoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/desc_yourQR_earnKFCpoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/img_earn_scanaboveQR'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/img_earn_scanaboveQR'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/img_earn_finishyour'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/img_earn_finishyour'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Your QR Page - New/img_earn_getkfcpoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Your QR Page - New/img_earn_getkfcpoints'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen/btn_home_bottombar'), 2, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Earn Page Components check finished')

