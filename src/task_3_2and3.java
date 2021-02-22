import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class task_3_2and3 {
    /*
    Задание 2
    Программа определяет, какая семья (фамилия) живёт в городе:
    Пример ввода:
     Москва
     Ивановы
     Киев
     Петровы
     Лондон
     Абрамовичи
     Лондон
    Пример вывода:
     Абрамовичи

     */
    static Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws IOException {


        map.put("Москва", "Ивановы");
        map.put("Киев", "Петровы");
        map.put("Лондон", "Абрамовичи");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите ключ для поиска : ");
        System.out.println(map.get(reader.readLine()));

/*

Задание 3
Собственная Hashtable. Реализовать методы замещения, удаления в собственном классе SimpleHashtable
дополняя предыдущее задание.


 */
    }

    public static String insert(String key, String value) {
        map.put(key, value);
        return "Связка добавлена";
    }

    public static String dell(String key) {
        map.remove(key);
        return "Связка удалена по ключу";
    }

}
