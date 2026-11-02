//https://github.com/practicetasks/java_tasks/blob/main/collections/map/task_4/README.md
package lesson_8.hash4;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class FindId {
    private static Map<User, String> users = new HashMap<>();

    public static void main(String[] args) {
        // создадим 1 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            String name = "Имя " + i;
            users.put(new User(i, name), name);
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
        System.out.println("Поиск занял " + ((endTime - startTime)/1000000) + " милисекунд.");
    }

    private static User findUser(Long userId) {
        for (User user : users.keySet()) {
            if (user.id.equals(userId)) {
                return user;
            }
        }

        return null;
    }
}
