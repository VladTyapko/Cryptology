package tests;

import algo.Milera_Rabina.Milera_Rabina;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertTrue;

public class Milera_RabinaTest {

    @Test
    public void isPrime() {
        assertTrue(Milera_Rabina.isPrime(new BigInteger("307169"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("45787669"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("407153"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("65654749"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("643439"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("715549"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("715817"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("756673"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("1248715577"), 300));
        assertTrue(Milera_Rabina.isPrime(new BigInteger("12315271"), 300));
    }

}
