import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int res =0;
        while (true) {
            String path = new Scanner(System.in).nextLine();
            File file = new File(path); //существует ли файл путь к которому указан?
            boolean fileExists = file.exists(); // -//- тру или фолс по вопросу выше
            boolean isDirectory = file.isDirectory(); // является ли указанный путь путём именно к файлу, а не к папке?
            res=res+1;
            if (fileExists==true && isDirectory==false) {
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер" + " " + res);
            }
            if (fileExists == false) System.out.println("Файл не существует");
            if (isDirectory == true) System.out.println("Указан путь к папке, а не к файлу");
            }

        }
    }

