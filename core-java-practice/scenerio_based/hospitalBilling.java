class HospitalBilling {

    static void processPayment(double bill, double payment)
            throws InsufficientFundsException {

        if (payment < bill) {
            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {

        try {
            int items = 0;
            double totalBill = 5000;
            double avg = totalBill / items;

        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate average cost: Number of items is zero.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Patient record not found. Invalid patient ID.");

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}