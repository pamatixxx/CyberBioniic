import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class task_2_2 {

    public static void main(String[] args) throws IOException {

        //считываем колличество вводов N
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int isMinimum = getMinimum((LinkedList<Integer>) getIntegerList(N));
        System.out.println(isMinimum);
    }


    //метод для сортировки по возврастанию и нахождению минимума (1 элемента с начала)
    static int getMinimum(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        return linkedList.get(0);
    }

    //Метод заполнения листа , колличеством целых чисел N раз
    static List<Integer> getIntegerList(int N) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integersList = new LinkedList<Integer>();

        for (int i = 0; i < N; i++) {
            integersList.add(Integer.parseInt(reader.readLine()));
        }
        return integersList;
    }


}
