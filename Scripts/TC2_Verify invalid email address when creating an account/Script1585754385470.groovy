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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.utest.com/signup/personal')

WebUI.setText(findTestObject('Page_uTest - User SignUp/input_First name_firstName'), 'abc')

WebUI.setText(findTestObject('Page_uTest - User SignUp/input_Last name_lastName'), 'def')

WebUI.setText(findTestObject('Page_uTest - User SignUp/input_Email address_email'), 'c@gmail')

WebUI.click(findTestObject('Object Repository/Page_uTest - User SignUp/div_Email address                    Did yo_a2f1c8'))

WebUI.verifyElementText(findTestObject('Page_uTest - User SignUp/span_Enter valid email'), 'Enter valid email')

WebUI.closeBrowser()

