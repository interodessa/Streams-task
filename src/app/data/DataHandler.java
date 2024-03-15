package app.data;
import app.entity.User;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class DataHandler {
    public String StreamData(List<User> list) {
        AtomicInteger count = new AtomicInteger(1);
        StringBuilder stringBuilder = new StringBuilder();
        Stream<User> filtredData = list.stream().filter(user -> user.getEmail().contains("123"));
         filtredData.forEach(user -> stringBuilder.
                append(count.getAndIncrement())
                .append(") ").append(user)
                .append("\n"));
        return stringBuilder.toString();
    }
}
