import java.util.Scanner;

public class CafeOrderSystem {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        char member;
        int payment;
        char OrderStart;

        FoodItem[] foods = { // list menu and price
                new FoodItem("DANISH CHOCOLATE ROLL   ", 12.00),
                new FoodItem("CROISSANT MATCHA        ", 10.00),
                new FoodItem("CHEESE TART             ", 8.00),
                new FoodItem("CHOCOLATE LAVA CAKE(HOT)", 15.00),
        };

        DrinkItem[] drinks = {
                new DrinkItem("MATCHA                  ", 16.00),
                new DrinkItem("MOCHA                   ", 15.00),
                new DrinkItem("MILK TEA                ", 12.00),
                new DrinkItem("COFFEE                  ", 10.00),
        };

        System.out.println("Do You want to make an order?(Y/N): ");
        OrderStart = scanner.next().charAt(0);
        if (Character.toLowerCase(OrderStart) == 'y') {


            System.out.println("                  ****************************");
            System.out.println("                      WELCOME TO JAVA CAFE    ");
            System.out.println("                  ****************************");

            Order order = new Order();

            while (true) {
                System.out.println("***********************************************************");
                System.out.println("|           MENU              |             PRICE         |");
                System.out.println("***********************************************************");
                for (int i = 0; i < foods.length; i++) { // food.length for total menu in the list menu
                    System.out.print((i + 1) + ". ");
                    foods[i].display();
                }
                System.out.println("*");
                System.out.println("\nEnter (enter 1-" + foods.length + ") to order , or 0 to finish: ");
                choice = scanner.nextInt();

                if (choice == 0) {
                    break;
                } else if (choice >= 1 && choice <= foods.length) {
                    order.addItem(foods[choice - 1]);
                } else {
                    System.out.println("Invalid Choice!");
                    continue; // continue display food menu
                }
            }


            while (true) {
                System.out.println("***********************************************************");
                System.out.println("|           MENU              |             PRICE         |");
                System.out.println("***********************************************************");

                for (int i = 0; i < drinks.length; i++) {
                    System.out.print((i + 1) + ". ");
                    drinks[i].display();
                }
                System.out.println("*");
                System.out.println("\nEnter (enter 1-" + foods.length + ") to order , or 0 to finish: ");
                choice = scanner.nextInt();
                if (choice == 0) {
                    break;
                } else if (choice >= 1 && choice <= drinks.length) {
                    order.addItem(drinks[choice - 1]);
                } else {
                    System.out.println("Invalid Choice!");
                    continue; // continue to display drinks menu
                }
            }

            System.out.println("Are you a member? (Y/N): ");
            member = scanner.next().charAt(0);
            order.isMember = (Character.toLowerCase(member) == 'y');

            if (order.isMember) {
                System.out.println("Enter your membership ID: ");
                String memberId = scanner.next();
                order.setMemberId(memberId); // Set the member ID
            }

            System.out.println("Payment method: ");
            System.out.println("1. Cash");
            System.out.println("2. Card");
            System.out.println("3. DuitNow");
            System.out.println("Select payment method: ");
            payment = scanner.nextInt();

            switch (payment) {
                case 1 -> order.paymentMethod = "Cash";
                case 2 -> order.paymentMethod = "Card";
                case 3 -> order.paymentMethod = "DuitNow";
                default -> order.paymentMethod = "Unknown";
            }

            order.printReceiptCustomer();
            order.printReceiptAdmin();
        }
        else {
            System.out.println("THANK YOU!");
        }
    }
}



