Feature: Temperature based selection

  In order to purchase either Moisturizers or Sunscreens
  Opens the application and check the temperature value
  I will buys either sunscreen or moisturizers on the basis of temperature

 Scenario: As a user, I can shop cheapest things

   Given  User is on the weather app
   When   User reads the temperature and decides what to shop
   When   User adds cheapest products into the cart
   Then   Cart should be populated correctly
   Then   Checkout should be successful