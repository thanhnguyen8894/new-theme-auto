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

WebUI.navigateToUrl('https://theme-new.snaptec.co/en')

WebUI.click(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Arabian Oud  Best Perfumes 2022  KSA O_bdd05c/a_Best Sellers'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_bestSeller_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_arabian leather'), 
    'arabian leather')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_bestSeller_1_regular price'), 
    '495.66 SAR')

WebUI.verifyElementClickable(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_1_Add to Cart'))

WebUI.verifyElementClickable(findTestObject('Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_2_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_2_name'), 
    'Arabella')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_2_regular_price'), 
    '382.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'))

'item 3\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_3_name'), 
    'Diwan')

'item 3\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_3_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_3_regular price'), 
    '547.83 SAR')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_Sold out'), 
    'Sold out')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_4_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_4_name'), 
    'Al Fareed')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_4_regular price'), 
    '739.14 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://theme-new.snaptec.co/en')

WebUI.click(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Arabian Oud  Best Perfumes 2022  KSA O_bdd05c/a_Best Sellers'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_bestSeller_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_arabian leather'), 
    'arabian leather')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_bestSeller_1_regular price'), 
    '495.66 SAR')

WebUI.verifyElementClickable(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_1_Add to Cart'))

WebUI.verifyElementClickable(findTestObject('Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_2_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_2_name'), 
    'Arabella')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_2_regular_price'), 
    '382.61 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'))

'item 3\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_3_name'), 
    'Diwan')

'item 3\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_3_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_3_regular price'), 
    '547.83 SAR')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_Sold out'), 
    'Sold out')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_4_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_4_name'), 
    'Al Fareed')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_4_regular price'), 
    '739.14 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sa.theme-new.snaptec.co/en')

WebUI.click(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Arabian Oud  Best Perfumes 2022  KSA O_bdd05c/a_Best Sellers'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_5_image (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_5_name'), 
    'Bella 100 Ml')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_5_Regular price'), 
    '239.13 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_6_name'), 
    'Amiri 75 ml')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_5_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_6_regular price'), 
    '543.48 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_7_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_7_name'), 
    'Ehsas (Khas) 100 ml')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_7_regular price'), 
    '286.96 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_8_image'))

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/h1_BS_8_name'), 
    'Sultani')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_8_special price'), 
    '300.00 SAR')

WebUI.verifyElementText(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/span_BS_8_regular price'), 
    '634.78 SAR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/button_BS_2_Add cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Cat_BestSeller_EN/Page_Best Sellers Saudi Arabia  2022 Best Perfumes/img_BS_1_wishlist'))

