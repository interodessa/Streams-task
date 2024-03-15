package app.data;
import app.entity.User;
import java.util.Arrays;
import java.util.List;

public class DataRepository {
    public List<User> getBase(){
        return Arrays.asList(new User("user1", "user123@mail.com"),
                new User("user2", "user223@mail.com"),
                new User("user3", "user323@mail.com"),
                new User("user4", "user4123@mail.com"),
                new User("user5", "user523@mail.com"));
    }
}
