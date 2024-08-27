Feature: ShopperStop Feature
  I want to loging the shopperstop app check e2e

  Background: User is to login
    Given launch the application,login with validate user and click the account btn
    And click the login btn
    And Enter the login id
    And click the proceed btn
    And enter the otp
    And click the verfied otp
    Then user is login succfully

  @Test001
  Scenario: User is login and select the Woman product and payment with COD
    And click on catahories page
    And click on category page
    And scroll the product
    And click the produc
    And scroll the page
    And select the size and bag
    And select card
    Then Order is Successfully

  @Test002
  Scenario: Verify User able to Edit the my profile  Details
    When user select the my profile
    And edit the my profile
    And Select the Gender and edit the text file
    And Update changes btn
    And user is click the add address btn
    And user is fill the address detail
    And select the check box & add address btn

  @Test003
  Scenario: User is login and select the Men product and payment with credit card
    And User select the category page
    And User select the Men Product
    And User landed to PLP page and Select one product
    And User Select the Size of product after add the product in the bag
    And User select the credit card

  Scenario: After login complet the flow
    And click the place order btn
    And click the continue btn
    And select payment method

  @Test004
  Scenario: Brands product check
    Given click the brands btn
    And select the brand
    And click the one brand
    And click the sort btn
    And click the discount btn
    And click the price low to high btn
    And Click the price high to low btn
    And Click the filter btn

  @Test005
  Scenario: PDP product check
    Given click the Search btn &  search the  product
    And select the product in the list
    And click the one product

  @Test006 @login
  Scenario: Verify the functionality of empty cart
    When I wait in seconds Stay in homepage
    And I selected Cart Icon in home page in cart page
    And I Remove all items Clear Cart Products in cart page
    Then verify text Empty Bag Vfy in cart page

  @Test007
  Scenario: Verify user Able to select categories and from categories user is able to add product into cart
    And click on catahorie page
    And click on categorywomen page
    And scroll product
    And click thes product
    And scroll the pages
    And select  bag
    And User select the categorymen page
    And User select the Men Products
    And User landeds to PLP page and Select one product
    And Select thee Size of product after add the product in the bag
    And User select the Kid category
    And User select the boy product
    And User landed the Kid Plp page and select one product
    And user landed the pdp page and select the size and add to bag
