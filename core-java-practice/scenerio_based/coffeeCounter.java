import java.util.Scanner;

public class coffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit': ");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Café closed.");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // consume newline

            double price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double bill = price * quantity;
            double gst = bill * 0.18; // 18% GST
            double totalAmount = bill + gst;

            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Bill Amount : ₹" + bill);
            System.out.println("GST (18%)   : ₹" + gst);
            System.out.println("Total Bill  : ₹" + totalAmount);
            System.out.println("----------------\n");
        }

        sc.close();
    }
}