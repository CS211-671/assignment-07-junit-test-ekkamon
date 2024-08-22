package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    @DisplayName("User can set password")
    public void testSetPassword() {
        User user = new User("user01", "12345");
        user.setPassword("plain-p@ssw0rd");

        assertTrue(user.validatePassword("plain-p@ssw0rd"));
    }


    @Test
    @DisplayName("User should be same username")
    public void testIsUserName() {
        User user = new User("xxxx", "12345");

        assertTrue(user.isUsername("xxxx"));
    }
}