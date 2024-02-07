import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberTest {

    private NumberChecker numberChecker;

    @BeforeEach
    public void init() {
        numberChecker = new NumberChecker();
    }


        @Test
        public void testCorrectPhoneNumber() {

            assertTrue(numberChecker.isCorrectNumber("3334567"));
            assertTrue(numberChecker.isCorrectNumber("333 4567"));
            assertTrue(numberChecker.isCorrectNumber("333-4567"));
        }

        @Test
        public void testIncorrectPhoneNumber() {


            assertFalse(numberChecker.isCorrectNumber("123456"));
            assertFalse(numberChecker.isCorrectNumber("123-456"));
            assertFalse(numberChecker.isCorrectNumber("123 45678"));
            assertFalse(numberChecker.isCorrectNumber("123 456"));         }
    }

