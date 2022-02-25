Feature: Temperature based selection

  In order to purchase either Moisturizers or Sunscreens
  Opens the application and check the temperature value
  I will buys either sunscreen or moisturizers on the basis of temperature

Scenario: Purchasing Moisturizers or Sunscreen on the basis of the temperature

 Given User launches the browser and opens the application
  When  User read the temperature value
  Then  User buys either moisturizers or Sunscreens on the basis of temperature

