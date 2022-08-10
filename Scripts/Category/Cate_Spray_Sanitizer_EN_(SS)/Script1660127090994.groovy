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

WebUI.click(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Arabian Oud  Best Perfumes 2022  KSA O_bdd05c/p_Category_Name_Spray  Sanitizer'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_main_banner'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_Category_Title'), 
    'Spray & Sanitizer')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/div_SS_breadCrumb'), 
    'Spray & Sanitizer')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_1_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/h1_SS_1_name'), 
    'Musk Spray & Sanitizer')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_1_regular price'), 
    '82.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/button_SS_1_Add Cart'))

WebUI.verifyElementNotVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_1_wishlist'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_2_Image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/h1_SS_2_Name'), 
    'Arabian Leather Spray & Sanitizer')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_2_regular price'), 
    '82.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/button_SS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_3_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/h1_SS_3_Name'), 
    'Kalemat Spray & Sanitizer')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_2_regular price'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/button_SS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_4_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/h1_SS_4_Name'), 
    'Centro Spray & Sanitizer')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_2_regular price'), 
    '82.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/button_SS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_5_Image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/h1_SS_5_Name'), 
    'Rose Wood Spray & Sanitizer')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_2_regular price'), 
    '82.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/button_SS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_6_Image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/h1_SS_6_name'), 
    'Adore Spray & Sanitizer')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_2_regular price'), 
    '82.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/button_SS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/img_SS_7_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/h1_SS_7_name'), 
    'Madawi Spray & Sanitizer')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/span_SS_2_regular price'), 
    '82.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_Spray_Sanitizer/Page_Spray  Sanitizer Saudi Arabia  2022 Be_afc429/button_SS_2_Add cart'))

