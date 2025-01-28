import org.junit.jupiter.api.Test;
import original.Account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testValidName() {
        Account account = new Account("Тимоти Шаламе");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    void testNoSpace() {
        Account account = new Account("ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    void testMultipleSpaces() {
        Account account = new Account("Тимоти  Шаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    void testSpaceAtStart() {
        Account account = new Account(" ТимотиШаламе");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    void testSpaceAtEnd() {
        Account account = new Account("ТимотиШаламе ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    void testTooShortName() {
        Account account = new Account("Т Ш");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    void testTooLongName() {
        Account account = new Account("Тимоти Шаламе Тимоти Шаламе");
        assertFalse(account.checkNameToEmboss());
    }
}
