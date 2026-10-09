package se.lexicon;
import java.util.Locale;

public class CafeApp {
    static String getItemName(int item) {
        return switch (item) {
            case 1 -> "Espresso";
            case 2 -> "Cappuccino";
            case 3 -> "Latte";
            case 4 -> "Croissant";
            case 5 -> "Sandwich";
            default -> "Unknown";
        };
    }
    static double getPrice(int item) {
        return switch (item) {
            case 1 -> 25;
            case 2 -> 35;
            case 3 -> 40;
            case 4 -> 30;
            case 5 -> 55;
            default-> 0;
        };
    }
    static void printMenu() {
        String name = IO.readln("Welcome! What is your name? ");
        IO.println("Hi " + name + "! Here is our menu:");
        IO.println();
        IO.println("=".repeat(30));
        IO.println("       Lexicon Cafe");
        IO.println("=".repeat(30));
        for (int i = 1; i <= 5; i++) {
            IO.println(String.format(Locale.US, "%d. %-17s%.2f SEK", i, getItemName(i), getPrice(i)));
        }
        IO.println("=".repeat(30));
        IO.println();
        int number = Integer.parseInt(IO.readln("Enter item number (1-5): "));
        int quantity = Integer.parseInt(IO.readln("How many? "));
        boolean isMember = IO.readln("Loyalty member? (yes/no): ").equalsIgnoreCase("yes");
    }



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
        CafeApp.printMenu();
    }
}
