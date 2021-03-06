package tests;

import algo.Euclid.Euclid;

import org.junit.Test;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class EuclidTest {

    @Test
    public void extendedEuclid() {
        assertEquals(
                new Euclid.Result(BigInteger.ONE, new BigInteger("269783107"), new BigInteger("-748601496")),
                Euclid.extendedEuclid(new BigInteger("1565461651"), new BigInteger("564165461"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.ONE, new BigInteger("241666850462"), new BigInteger("-318203555")),
                Euclid.extendedEuclid(new BigInteger("849819498"), new BigInteger("645414541465"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.ONE, new BigInteger("26503922304989"), new BigInteger("-16971358")),
                Euclid.extendedEuclid(new BigInteger("54164651"), new BigInteger("84588145614561"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.ONE, new BigInteger("257378082"), new BigInteger("-32546575")),
                Euclid.extendedEuclid(new BigInteger("684768768"), new BigInteger("5415146513"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.valueOf(6), new BigInteger("1474"), new BigInteger("-41535")),
                Euclid.extendedEuclid(new BigInteger("1454514"), new BigInteger("51618"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.TWO, new BigInteger("233480"), new BigInteger("-15697")),
                Euclid.extendedEuclid(new BigInteger("144778"), new BigInteger("2153454"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.valueOf(6), new BigInteger("739152"), new BigInteger("-177157")),
                Euclid.extendedEuclid(new BigInteger("5161314"), new BigInteger("21534546"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.ONE, new BigInteger("-2024616708781"), new BigInteger("287312772384")),
                Euclid.extendedEuclid(new BigInteger("5451416354651"), new BigInteger("38414681486548"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.TWO, new BigInteger("-2214896"), new BigInteger("21175287")),
                Euclid.extendedEuclid(new BigInteger("654168446"), new BigInteger("68424814"))
        );
        assertEquals(
                new Euclid.Result(BigInteger.valueOf(5), new BigInteger("531308799"), new BigInteger("-46103")),
                Euclid.extendedEuclid(new BigInteger("564165"), new BigInteger("6501655610"))
        );
    }
}
