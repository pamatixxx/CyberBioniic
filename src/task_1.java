import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();


        for (int i = 0 ; i < 10; i++){
            list.add("elem "+ (i+1));
        }

        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }

}
