import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_5_1 {


    public static void main(String[] args) {

        String login = "pamatixxx";
        String password = "4654445sadasd856";


        Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9-_\\.]");
        Matcher matcherLohin = pattern.matcher(login);
        System.out.println(matcherLohin);

        Matcher matcherPassword = pattern.matcher(password);
        System.out.println(matcherPassword);


    }
}
