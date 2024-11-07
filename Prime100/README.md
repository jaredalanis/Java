# Prime100

Prime100 is a Java program that generates a random 100-digit prime number using probabilistic methods to ensure high confidence in primality. 
The program measures the time taken to generate the prime number in various units (minutes, seconds, milliseconds, etc.) and counts the number of attempts required.

## Features

- **100-Digit Prime Generation**: Generates a large prime number with 100 digits.
- **High Certainty Primality Test**: Uses the Miller-Rabin test with a certainty level of 200 to verify primality.
- **Timing and Attempt Tracking**: Records and displays the time taken to find the prime in multiple units and the number of attempts.

## Requirements

- Java Development Kit (JDK) 8 or later.

## How It Works

- **Random Number Generation**: The program generates random 100-digit numbers using Java’s `BigInteger` class and ensures they fall within the 100-digit range.
- **Primality Testing**: Each candidate is tested for primality using `isProbablePrime(200)`, where a certainty level of 200 provides a high probability that the number is prime.
- **Timing and Attempts Tracking**: The program counts each attempt to find a prime and uses Java’s `Instant` and `Duration` classes to measure the time taken.

## Example Output

```
Number of attempts to find prime: 326

100-digit prime: 1000000000000000000000000000000000000000000000000000000000000000000000066900112252235054507195794033

Language used: Java
Data type used for large integers: BigInteger

Time taken to generate the prime:
  - Minutes: 0.0007326967
  - Seconds: 0.04396180
  - Milliseconds: 43.96180
  - Microseconds: 43961.80
  - Nanoseconds: 43961800
```
