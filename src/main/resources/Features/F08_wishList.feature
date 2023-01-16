@smoke
  Feature: F08_wishList | user can add products to wishlist
    Scenario: when user click on the first product's wish, it should added to wishlist
      When user click on product's wish 0
      Then the product added to wishlist

    Scenario: when user click on the second product's wish, it should added to wishlist
      When user click on product's wish 1
      Then the product added to wishlist

    Scenario: when user click on the third product's wish, it should added to wishlist
      When user click on product's wish 2
      Then the product added to wishlist

    Scenario: when user click on the forth product's wish, it should added to wishlist
      When user click on product's wish 3
      Then the product added to wishlist