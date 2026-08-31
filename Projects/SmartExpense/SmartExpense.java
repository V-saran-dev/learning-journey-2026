

import java.util.ArrayList;
import java.util.Scanner;

public class SmartExpense {

    static ArrayList<Transaction> transactions = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("        SMART EXPENSE");
            System.out.println("=================================");

            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Transactions");
            System.out.println("4. Search Transaction");
            System.out.println("5. Delete Transaction");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();

            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1:
                    addIncome();
                    break;

                case 2:
                    addExpense();
                    break;

                case 3:
                    viewTransactions();
                    break;

                case 4:
                    searchTransaction();
                    break;

                case 5:
                    deleteTransaction();
                    break;

                case 6:
                    System.out.println("Thank you for using SmartExpense!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


    static void addIncome() {

        System.out.println("\n===== ADD INCOME =====");

        System.out.print("Enter income amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter income source: ");
        String description = scanner.nextLine();

        int id = transactions.size() + 1;

        Transaction transaction =
                new Transaction(
                        id,
                        "INCOME",
                        "Income",
                        amount,
                        description
                );

        transactions.add(transaction);

        System.out.println("Income added successfully!");
    }


    static void addExpense() {

        System.out.println("\n===== ADD EXPENSE =====");

        System.out.print("Enter expense amount: ");
        double amount = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter category: ");
        String category = scanner.nextLine();

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        int id = transactions.size() + 1;

        Transaction transaction =
                new Transaction(
                        id,
                        "EXPENSE",
                        category,
                        amount,
                        description
                );

        transactions.add(transaction);

        System.out.println("Expense added successfully!");
    }


    static void viewTransactions() {

        if (transactions.isEmpty()) {

            System.out.println("No transactions found.");

            return;
        }

        System.out.println("\n===== ALL TRANSACTIONS =====");

        for (Transaction transaction : transactions) {

            transaction.displayTransaction();
        }
    }


    static void searchTransaction() {

        System.out.print("Enter transaction ID: ");

        int id = Integer.parseInt(scanner.nextLine());

        for (Transaction transaction : transactions) {

            if (transaction.getId() == id) {

                System.out.println("Transaction found:");

                transaction.displayTransaction();

                return;
            }
        }

        System.out.println("Transaction not found.");
    }


    static void deleteTransaction() {

        System.out.print("Enter transaction ID: ");

        int id = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < transactions.size(); i++) {

            if (transactions.get(i).getId() == id) {

                transactions.remove(i);

                System.out.println(
                        "Transaction deleted successfully!"
                );

                return;
            }
        }

        System.out.println("Transaction not found.");
    }
}
