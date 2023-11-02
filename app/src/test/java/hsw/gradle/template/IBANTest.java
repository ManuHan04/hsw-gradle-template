package hsw.gradle.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IBANTest {
    @Test
    void IBANDE() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertTrue(classUnderTest.check(myIBAN));
    }

    @Test
    void IBANWrong() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertFalse(classUnderTest.check(myIBAN));
    }

    @Test
    void IBANGermanTest() {
        String myIBAN = "DE68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertTrue(classUnderTest.isGermanIBAN(myIBAN));
    }

    @Test
    void IBANGermanTestWrong() {
        String myIBAN = "ZZ68210501700012345678";
        IBAN classUnderTest = new IBAN(myIBAN);
        assertFalse(classUnderTest.isGermanIBAN(myIBAN));
    }
}