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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sa.theme-new.snaptec.co/en')

WebUI.click(findTestObject('Object Repository/Cat_HairMist_EN/Page_Arabian Oud  Best Perfumes 2022  KSA O_bdd05c/p_Hair Mists'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/img_HM_main_banner'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/span_HM_Cat_title'), 
    'Hair Mists')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/div_HM_BreadCrumb'), 
    'Hair Mists')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/img_HM_1_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/h1_HM_1_name'), 
    'hair mists Madawi')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/span_HM_1_regular price'), 
    '191.31 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/button_HM_1_Sold out'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/img_HM_1_wishlist'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/img_HM_2_Image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/h1_HM_2_name'), 
    'hair mists Rose Wood')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/span_HM_1_regular price'), 
    '191.31 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/button_HM_2_add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/img_HM_3_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/h1_HM_3_name'), 
    'Hair mists musk rose')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/span_HM_3_regular price'), 
    '191.31 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_HairMist_EN/Page_Hair Mists Saudi Arabia  2022 Best Perfumes/button_HM_2_add cart'))

