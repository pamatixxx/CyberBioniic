import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task_2_1 {


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
