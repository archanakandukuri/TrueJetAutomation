Feature: Login functionality

Scenario Outline: User is in login page
Given url "https://trujet.com/" and browser "Chrome" details
When User enter "<username>" and "<password>"
Then User should successfully logged in

Examples:
|username       | password|
|abcde@gmail.com|q1w2e3@1 |


Scenario Outline: User is in login page
Given url "https://trujet.com/" and browser "Chrome" details
When User enter "<username>" and "<password>"
Then Error message has to show


Examples:
|username       | password|
|abc@gmail.com  |tette    |
