Feature: Login Validation

Background:
 Given User opens the browser
 And Users enters the url "www.gmail.com"
 
 
Scenario: Login functionality with valid credentials

When Users enters username "ajayhawale21@gmail.com"
And Users enters the password "Ajay@1997"
And Users clicks on Sign In button
Then User should get successfully logged in
And browser should get closed


Scenario Outline: Login Functionality with multiple data


When Users enters username <username>
And Users enters the password <password>
And Users clicks on Sign In button
Then User should get successfully logged in
And browser should get closed


Examples:
 | username                  |  password   |
 | ajayhawale21@gmail.com    |  Ajay@1997  |
 | user1                     | pass1       |
 | user2                     | pass2       |
 | user3                     | pass3       |









