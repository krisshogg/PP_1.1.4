package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 11);
        userService.saveUser("Артем", "Артемов", (byte) 22);
        userService.saveUser("Никита", "Никитич", (byte) 33);
        userService.saveUser("Илья", "Ильич", (byte) 44);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
