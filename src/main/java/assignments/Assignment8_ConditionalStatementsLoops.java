package assignments;

public class Assignment8_ConditionalStatementsLoops {

	public static void main(String[] args) {
		int[] transactions = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};

        int creditCount = 0, debitCount = 0;
        int creditSum = 0, debitSum = 0;
        int balance = 0;
        int suspiciousCount = 0;

        // Loop through each transaction
        for (int t : transactions) {
            if (t > 0) {  // Credit
                creditCount++;
                creditSum += t;
            } else {      // Debit
                debitCount++;
                debitSum += Math.abs(t);
            }

            // Add to balance
            balance += t;

            // Check for suspicious transaction (> 10000 or < -10000)
            if (Math.abs(t) > 10000) {
                System.out.println("Suspicious transaction detected: " + t);
                suspiciousCount++;
            }
        }

        // Output results
        System.out.println("Total Credit Transactions: " + creditCount);
        System.out.println("Total Debit Transactions: " + debitCount);
        System.out.println("Total Credited Amount: " + creditSum);
        System.out.println("Total Debited Amount: " + debitSum);
        System.out.println("Final Account Balance: " + balance);
        System.out.println("Total Suspicious Transactions: " + suspiciousCount);
    

	}

}
