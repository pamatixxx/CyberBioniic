import java.io.*;

public class task_4_2 {
    /*
    Задание 2
    Создайте файл, запишите в него произвольные данные и закройте файл.
    Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.

     */
    public static void main(String[] args) throws IOException {
        String strSave = "записую что-то в файл"; //строка для записи в файл

        try {

            FileWriter fileWriter = new FileWriter("S:\\MyProjectJava\\CyberBionic\\src\\text.txt");
            fileWriter.write(strSave);
            fileWriter.flush();
            System.out.println("Строку записали в файл");
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        System.out.println("Начинаем чтение из файла");
        System.out.println();
        try (FileReader reader = new FileReader("S:\\MyProjectJava\\CyberBionic\\src\\text.txt"))//try-with-resourse закрывает поток после чтения
        {

            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
