package assignments;

public class Assignment12_PrimeNumber {

	public static void main(String[] args) {
		// A Prime number is a number greater than 1
		// that is divisible only by 1 and itself.
		// Example: 2, 3, 5, 7, 11, ...

		int input = 5; // input number to check for prime

		boolean prime = true; // assume number is prime initially

		// Check if the number is less than or equal to 1
		// because prime numbers start from 2
		if (input <= 1) {
			System.out.println(input + " is not a prime number");
			prime = false; // set prime to false for 0 or 1 or negative numbers
		}

		// Loop from 2 to input-1 to check if any number divides 'input'
		// If any number divides it completely (remainder is 0), then it's not prime
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				// Found a divisor other than 1 and itself, so it's not prime
				prime = false;
			}
		}

		// Final decision after checking all possible divisors
		if (prime)
			System.out.println(input + " is a prime number");
		else
			System.out.println(input + " is not a prime number");
	}
}