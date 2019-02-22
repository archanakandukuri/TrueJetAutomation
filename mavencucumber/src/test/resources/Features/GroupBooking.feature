@GroupBooking
Feature: Group Booking
Scenario Outline: Group Booking oneway
Given url "https://trujet.com/" and browsers "Chrome" details
When user enters "<firstname>","<lastname>","<emailaddress>","<mobilenumber>","<city>","<TravelType>","<fromCity>","<toCity>","<depatureDate>","<returnDate>","<noOfPassengers>".
Then User is able to do group booking

Examples:
|firstname| lastname| emailaddress		| mobilenumber	| city		|  TravelType	| fromCity			| toCity	| depatureDate	| returnDate	| noOfPassengers	|
|sandhya  | dogle	| abcde@gmail.com	|9999999999		|hyderabad	|	One Way		| Hyderabad (HYD)	| Goa (GOI)	| 2/25/2019		| 2/28/2019		| 2					|
|sandhya  | dogle	| abcde@gmail.com	|9999999999		|hyderabad	|	Round Trip	| Hyderabad (HYD)	| Goa (GOI)	| 2/25/2019		| 2/28/2019		| 2					|
