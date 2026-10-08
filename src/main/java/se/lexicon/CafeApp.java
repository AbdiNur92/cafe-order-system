package se.lexicon;


public class CafeApp {
    void main() {
        // PLAN
// 1. Ask the customer's name and greet them      -> main (IO.readln)
// 2. Show the menu                                -> printMenu()
// 3. Item name and price from the number 1-5      -> getItemName(item), getPrice(item)
// 4. Read item number, quantity, loyalty yes/no   -> main (IO.readln)
// 5. Subtotal = price x quantity                  -> calculateSubtotal(price, quantity)
// 6. Discount: member 15%, else over 150 -> 10%, else 0
//                                                 -> calculateDiscount(subtotal, isMember)
// 7. Amount after discount = subtotal - discount  -> afterDiscount(subtotal, discount)
// 8. VAT = 12% of the amount after discount       -> calculateVat(afterDiscount)
// 9. Total = amount after discount + VAT          -> calculateTotal(afterDiscount, vat)
// 10. Print the receipt                           -> printReceipt(...)
        IO.println("Lexicon Cafe");
    }
}
