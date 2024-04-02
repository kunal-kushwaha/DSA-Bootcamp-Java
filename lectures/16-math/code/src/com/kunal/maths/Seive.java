package com.kunal.maths;

public class Seive {
    public static void main(String[] args) {
        int n = 40; // Example limit for prime numbers
        boolean[] primes = new boolean[n+1];// Initialize boolean array
        sieve(n, primes);
    }
// Sieve of Eratosthenes algorithm to mark prime numbers
    // false in array means number is prime
    static void sieve(int n, boolean[] primes) {
        for (int i = 2; i*i <= n; i++) {
            if (!primes[i]) {
                for (int j = i*2; j <= n; j+=i) {
                    primes[j] = true;
                }
            }
        }
// Sieve of Eratosthenes algorithm to mark non-prime numbers
        for (int i = 2; i <= n; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
