Feature: Computer Page Test Cases
  @author-JDL @smoke
    Scenario: verify User navigate to Computer Page successfully
    Given     User is on Home Page
    When      User Click on computer tab
    Then      User verify the text "Computer"

    Scenario: Verify User Should Navigate To Desktops Page Successfully
      Given   User is on the home Page
      When    User Click on computer tab
      And     User click on Desktops link
      Then    User verify "Desktops" text

      @author-JDL @sanity @smoke @regression
      Scenario Outline: Verify That User Should Build You Own Computer And Add Them To Cart Successfully
        Given   User is on the  Home Page
        When    User Click on computer tab
        And     User click on Desktops link
        And     User Click on product name "Build your own computer"
        And     User Select processor '<processor>'
        And     User Select RAM '<ram>'
        And     User Select HDD '<hdd>'
        And     User Select OS '<os>'
        And     User Select Software '<software>'
        And     User Click on "ADD TO CART" Button
        Then    User Verify message "The product has been added to your shopping cart"

        Examples:
          | processor                                       | ram           | hdd               | os                      | software                    |
          | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    |  Microsoft Office [+$50.00] |
          | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]    |
          | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista  Home [+$50.00]   | Total Commander [+$5.00]    |


