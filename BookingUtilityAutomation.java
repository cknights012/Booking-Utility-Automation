import java.util.Scanner;

public class BookingUtilityAutomation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== BOOKING AND UTILITY AUTOMATION SYSTEM =====");
            System.out.println("1. Book a Room");
            System.out.println("2. Calculate Electricity Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    bookRoom(sc);
                    break;

                case 2:
                    calculateBill(sc);
                    break;

                case 3:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    // Room Booking Method
    public static void bookRoom(Scanner sc) {
        System.out.print("Enter Customer Name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        int roomCharge = 1000;
        int total = days * roomCharge;

        System.out.println("\n----- Booking Details -----");
        System.out.println("Customer Name : " + name);
        System.out.println("Days Booked   : " + days);
        System.out.println("Total Amount  : Rs." + total);
        System.out.println("Booking Successful!");
    }

    // Electricity Bill Method
    public static void calculateBill(Scanner sc) {
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 2;
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
        } else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        System.out.println("Electricity Bill = Rs." + bill);
    }
}

