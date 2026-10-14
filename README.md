# Café Order System

A Java console app for Lexicon Café. It greets the customer, shows the menu, takes one order (item and quantity) and prints a receipt.

## Rules

- Loyalty members get 15% off.
- Other customers get 10% off orders over 150 SEK.
- VAT is 12% of the price after the discount.

## Run it

Needs JDK 25 or newer (the project is set to 26). Open the project in IntelliJ IDEA and run `CafeApp`, or from the project folder:

```
java src/main/java/se/lexicon/CafeApp.java
```

## Example receipt

Sara orders 3 cappuccinos and is not a loyalty member:

```
==============================
      LEXICON CAFE
==============================
Customer  : Sara
Item      : Cappuccino x 3
Subtotal  : 105.00 SEK
VAT       : 12.60 SEK
------------------------------
TOTAL     : 117.60 SEK
==============================
   Thank you, Sara!
   See you next time.
==============================
```
