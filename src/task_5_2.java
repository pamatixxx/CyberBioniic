import java.lang.reflect.Array;
import java.util.ArrayList;

public class task_5_2 {


    /*
  Задание 2
В каждом предложении текста поменять местами первое слово с последним, не изменяя длины
предложения.

     */

    public static void main(String[] args) {
        String text = "Java[прим. 1] — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems (в последующем приобретённой компанией Oracle). Разработка ведётся сообществом, организованным через Java Community Process; язык и основные реализующие его технологии распространяются по лицензии GPL. Права на торговую марку принадлежат корпорации Oracle. Приложения Java обычно транслируются в специальный байт-код, поэтому они могут работать на любой компьютерной архитектуре, для которой существует реализация виртуальной Java-машины. Дата официального выпуска — 23 мая 1995 года. Стабильно занимает высокие места в рейтингах популярности языков программирования (2-е место в рейтингах IEEE Spectrum (2020)[2] и TIOBE (2021)[3]).";


        // System.out.println(      firstWord(text));

        String[] mass = text.split(". ");
        System.out.println(mass[1]);


    }


    public static String firstWord(String input) {
        String result = "";  // Return empty string if no space found

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                result = input.substring(0, i);
                break; // because we're done
            }
        }

        return result;
    }
}
