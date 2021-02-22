import java.io.FileWriter;

public class task_4_3 {

    public static void main(String[] args) {


        try {

            FileWriter fileWriter = new FileWriter("S:\\MyProjectJava\\CyberBionic\\src\\randonInt.txt");


            //запись в файл 10 рандомных числе от 0 до 30

            String result = "";

            for (int i = 0 ; i < 10 ; i++){
                result += 0 + (int) (Math.random() * 20)+ "\n";

            }
            fileWriter.write( result);
            fileWriter.flush();
            System.out.println("Строку записали в файл");
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
