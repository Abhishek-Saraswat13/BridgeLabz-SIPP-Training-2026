import java.util.Scanner;

public class Election {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {

            System.out.print("\nEnter age (or 0 to exit): ");
            int age = scanner.nextInt();

            if (age == 0) {
                break;
            }

            if (age >= 18) {

                System.out.println("Eligible to vote!");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");

                System.out.print("Enter your vote (1/2/3): ");
                int vote = scanner.nextInt();

                if (vote == 1) {
                    candidate1Votes++;
                    System.out.println("Vote recorded for Candidate 1.");
                } else if (vote == 2) {
                    candidate2Votes++;
                    System.out.println("Vote recorded for Candidate 2.");
                } else if (vote == 3) {
                    candidate3Votes++;
                    System.out.println("Vote recorded for Candidate 3.");
                } else {
                    System.out.println("Invalid vote!");
                }
                System.out.print("Do you want to continue? (Y/N): ");
                char choice = scanner.next().charAt(0);

                if (choice == 'N' || choice == 'n') {
                    break;
                }

            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        System.out.println("\n===== Election Results =====");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);

        scanner.close();
    }
}