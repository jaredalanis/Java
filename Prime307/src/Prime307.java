import java.math.BigInteger;
import java.util.Random;
import java.time.Duration;
import java.time.Instant;

public class Prime307 {
    public static void main(String[] args) {
        Instant start = Instant.now(); // Start time
        
        // Generate a 307-digit prime number
        BigInteger prime = find307DigitPrime();
        
        Instant end = Instant.now(); // End time
        
        Duration duration = Duration.between(start, end); // Calculate the duration

        // Calculate precise times with additional decimal places using nanoseconds for consistency
        double minutes = duration.toNanos() / 60_000_000_000.0;       // Convert nanoseconds to minutes
        double seconds = duration.toNanos() / 1_000_000_000.0;        // Convert nanoseconds to seconds
        double milliseconds = duration.toNanos() / 1_000_000.0;       // Convert nanoseconds to milliseconds
        double microseconds = duration.toNanos() / 1_000.0;           // Convert nanoseconds to microseconds

        // Print out the time in different units with 5 decimal places
        System.out.println("307-digit prime: " + prime + "\n");
        
        System.out.println("Language used: Java");
        System.out.println("Data type used for large integers: BigInteger\n");
        
        System.out.println("Time taken to generate the prime:");
        System.out.printf("  - Minutes: %.10f\n", minutes);
        System.out.printf("  - Seconds: %.8f\n", seconds);
        System.out.printf("  - Milliseconds: %.5f\n", milliseconds);
        System.out.printf("  - Microseconds: %.2f\n", microseconds);
        System.out.println("  - Nanoseconds: " + duration.toNanos());
    }

    public static BigInteger find307DigitPrime() {
        Random rand = new Random();

        // Set the range for a 307-digit number
        BigInteger min = new BigInteger("1" + "0".repeat(306)); // Smallest 307-digit number
        BigInteger max = new BigInteger("9".repeat(307)); // Largest 307-digit number

        BigInteger candidate;
        int attempts = 0; // Counter to track the number of attempts
        
        do {
            // Generate a random 307-digit number
            candidate = new BigInteger(307, rand);
            attempts++; // Increment the counter with each new candidate
            if (candidate.compareTo(min) < 0) {
                candidate = candidate.add(min); // Ensure it's 307 digits long
            } else if (candidate.compareTo(max) > 0) {
                candidate = candidate.mod(max).add(min); // Ensure it's within range
            }
        } while (!candidate.isProbablePrime(200)); // Certainty level of 200 for high likelihood of primality
        System.out.println("Number of attempts to find prime: " + attempts + "\n");

        return candidate;
    }
}
