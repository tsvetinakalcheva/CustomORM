
import entities.User;
import orm.Connector;
import orm.EntityManager;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws SQLException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {

        String username = "root";
        String password = "1234";
        Connector.createConnection(username, password, "orm_db");
        EntityManager<User> entityManager = new EntityManager<>(Connector.getConnection());
        User user = new User("Pesho", "1234", 25, new Date());
        entityManager.persist(user);
       // User user = entityManager.findFirst(User.class, "age = 25");
    }
}
