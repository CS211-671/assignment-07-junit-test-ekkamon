package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    private UserList userList;

    @BeforeEach
    public void setUp() {
        userList = new UserList();
        userList.addUser("test01", "111111111");
        userList.addUser("test02", "222222222");
        userList.addUser("test03", "333333333");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: find one of them
        User user = userList.findUserByUsername("test02");

        // TODO: assert that UserList found User
        String expected = "test02";
        String actual = user.getUsername();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: assert that user can change password
        boolean actual = userList.changePassword("test01", "111111111", "444444444");

        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: call login() with correct username and password
        User user = userList.login("test03", "333333333");

        assertEquals(userList.findUserByUsername("test03"), user);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: call login() with incorrect username or incorrect password
        User user = userList.login("test03", "111111111");

        // TODO: assert that the method return null
        assertNull(user);
    }
}