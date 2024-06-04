Feature: Login Validation



 
 @Login
Scenario: Login functionality with valid credentials
 Given User opens the browser
 And Users enters the url "www.gmail.com"
When Users enters username "LGuser1"
And Users enters the password "password@1"
And Users clicks on Sign In button
Then User should get successfully logged in
And browser should get closed