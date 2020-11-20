Feature: Login

Scenario Outline: Test Login with correct credentials
Given navigate to "https://opensource-demo.orangehrmlive.com/"
When enter a valide login "<login>" and password "<password>"
And click on submit
Then navigate to the home page


Examples:
|login|password|
|admin|hUKwJTbofgPU9eVlw/CnDQ==|

