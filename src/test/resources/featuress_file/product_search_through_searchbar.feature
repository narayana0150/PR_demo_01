
Feature: user able to search the product through searchbar

 
  Scenario: Product search 
  Given open browser and enter valid url
  When close login popup
  When click on search textbox and enter valid product and sumit
  Then user navigated to product list page
  When close the broser
   

 