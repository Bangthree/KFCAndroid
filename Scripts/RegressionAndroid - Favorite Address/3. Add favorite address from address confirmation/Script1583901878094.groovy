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

Mobile.startExistingApplication('com.kfc.mobile.hkStaging', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Home Screen - New/btn_delivery_new'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/addrs_search_btnMap'), 1)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/New Maps/maps_header_title'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_selection_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_selection_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/New Maps/maps_selection_desc'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_selection_title_DELIVADDRESS'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_selection_title_DELIVADDRESS'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/New Maps/maps_selection_title_DELIVADDRESS'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_google_location'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_google_location'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Delivery Address - New/New Maps/maps_google_location'), 'enabled', 'true', 
    1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_selection_pinIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_selection_pinIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_RedPinPoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_RedPinPoint'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Maps/maps_btnConfirmRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Maps/maps_btnConfirmRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/New Maps/maps_btnConfirmRed'), 1)

Mobile.tap(findTestObject('Delivery Address - New/New Maps/maps_btnConfirmRed'), 1)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_header_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_header_btnX'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_header_title_ADDRESSCON'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_header_title_ADDRESSCON'), 
    1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_header_title_ADDRESSCON'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_favIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_favIcon'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_pinIconred'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_pinIconred'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_title_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_title_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_title_TEBETDALAM'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_desc_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_desc_TEBETDALAM'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_desc_TEBETDALAM'), 1)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_TextNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_TextNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_btnEditNotes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_btnOrderNowred'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Delivery Address - New/New Address Confirmation/addrscon_favIcon'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(4, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_btnBack'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_btnBack'), 2, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_title'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_header_title'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_name'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_name'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_name'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_address'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_address'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_address'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_notes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_notes'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_title_notes'), 1)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/field_address'), 1)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/field_name'), 1)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/field_notes'), 1)

Mobile.clearText(findTestObject('Favorite Address/Save Fav Address/field_name'), 1)

Mobile.clearText(findTestObject('Favorite Address/Save Fav Address/field_notes'), 1, FailureHandling.OPTIONAL)

Mobile.setText(findTestObject('Favorite Address/Save Fav Address/field_name'), 'Rumah Mantan SMP', 1)

Mobile.setText(findTestObject('Favorite Address/Save Fav Address/field_notes'), 'Rasa kenangan tidak selalu nikmat', 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1)

Mobile.tap(findTestObject('Favorite Address/Save Fav Address/savefavadd_btnSaveRed'), 1)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savsuccess_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savsuccess_desc'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.getText(findTestObject('Favorite Address/Save Fav Address/savsuccess_desc'), 1)

Mobile.verifyElementExist(findTestObject('Favorite Address/Save Fav Address/savsuccess_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Favorite Address/Save Fav Address/savsuccess_btnOk'), 1, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Favorite Address/Save Fav Address/savsuccess_btnOk'), 1, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(4, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.takeScreenshot()

Mobile.pressBack()

