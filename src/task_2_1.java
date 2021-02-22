import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task_2_1 {

/*
Задание 2
Используя коллекцию удвойте слово:
1. Введите с клавиатуры 5 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведите результат на экран, каждое значение с новой строки.

 */
    public static void main(String[] args) throws IOException {


        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }

        for (Object str : doubleValues(list)
        ) {
            System.out.println(str);
        }


    }

    public static ArrayList doubleValues(ArrayList<String> arrayList) {
        ArrayList<String> doubleList = new ArrayList<>();

        for (String str1 : arrayList
        ) {
            doubleList.add(str1);
            doubleList.add(str1);
        }
        return doubleList;
    }
}
