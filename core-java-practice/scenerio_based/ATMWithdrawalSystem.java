class ATMWithdrawalSystem {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }

        System.out.println("Withdrawal successful.");
    }

    public static void main(String[] args) {

        double balance = 5000;
        double withdrawalAmount = 8000;

        try {
            withdraw(balance, withdrawalAmount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed!");
            System.out.println(e.getMessage());
        }
    }
}