package book.java.com.TestMarcs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String nameFile = "NewGenerateMarks.txt";
    public static String newMarks = "Z3TGLRRQBWIKBVBBDLNXDYYEBYITH436KNUELVDU46WFD52S3LS3FAFNCKV3GMR66UJ6I5Z57ZH3R5DHIKUNWF7F6IIBFGF4WOTXFQQI63FQ3BTBFVLU2LTSN5H8KEQSI"; // шаблон новой марки
    public static String[] finalMarks; // массив с марками
    public static String [] arrayMarksTagAmc; // массив с марками (тег Amc)
    public static Scanner scanner = new Scanner(System.in); // Для чисел
    public static Scanner scannerText = new Scanner(System.in); // Для текста

    public static void main(String[] args) throws IOException {

        //134 404 51246341 0550001
        int step = 0; // Выбор раздела
        int stepFile = 0;
        int count = 0; // Количество марок для генерации
        int typeMarks = 0; // Тип марки 3 символа
        int serialMarks = 0; // Серия марки 3 символа
        int numberMarks = 0; // Номер марки 8 символов
        int serviceInformation; // служ информация ЕГАИС (7 символов)

        System.out.println("Генерация новых марок (150 символов)\n" +
                "1. Старт\n" +
                "2. Выход из программы");
        step = scanner.nextInt();
        switch (step) {
            case 1:
                while (step == 1 || step == 2) {
                    System.out.println("1. Задать параметры автоматически\n" +
                            "2. Задать параметры вручную (тип, серия, номер, служеб. информация ЕГАИС)");
                    step = scanner.nextInt();
                    switch (step) {
                        case 1:
                            System.out.println("Введите количество марок для генерации:");
                            count = scanner.nextInt();
                            if (stepFile > 0){
                                System.out.println("Введите имя нового файла (без расширения)");
                                nameFile = scannerText.nextLine();
                                nameFile = nameFile + ".txt";
                            }
                            System.out.println("Идёт генерация марок...");
                            typeMarks = 200;
                            serialMarks = 216;
                            numberMarks = 27459081 + (int)(Math.random() * 9991);
                            serviceInformation = 7283756 + (int)(Math.random() * 893);
                            generateMarks(count, typeMarks, serialMarks, numberMarks, serviceInformation);
                            change();
                            break;
                        case 2:
                            System.out.println("Введите количество марок для генерации:");
                            count = scanner.nextInt();
                            if (stepFile > 0){
                                System.out.println("Введите имя нового файла (без расширения)");
                                nameFile = scannerText.nextLine();
                                nameFile = nameFile + ".txt";
                            }
                            System.out.println("Введите тип марки (3 символа:)");
                            typeMarks = scanner.nextInt();
                            System.out.println("Введите серию марки (3 символа:)");
                            serialMarks = scanner.nextInt();
                            System.out.println("Введите номер марки (8 символов)");
                            numberMarks = scanner.nextInt();
                            System.out.println("Введите служебную информацию ЕГАИС (7 символов)");
                            serviceInformation = scanner.nextInt();
                            generateMarks(count, typeMarks, serialMarks, numberMarks, serviceInformation);
                            change();
                    }
                    System.out.println("Сгенерировать новые данные?\n" +
                            "1. Да (данные в файле " + nameFile + " будут заменены)\n" +
                            "2. Создать новый файл\n" +
                            "3. Нет");
                    step = scanner.nextInt();
                    if (step == 2){
                        stepFile++;
                    } else {
                        stepFile = 0;
                    }
                }
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Команда не выбрана!");
        }
        scanner.close();
        scannerText.close();
    }

    // Метод - создание марки
    public static void generateMarks(int count, int typeMarks, int serialMarks, int numberMarks, int serviceInformation){
        int newValue = 0;
        String [] marks = new String[count];
        String [] marksTagAmc = new String[count];

        for (int i = 0; i < count; i++) {
            newValue = numberMarks + i;
            marks[i] = typeMarks + "" + serialMarks + "" + newValue + "" + serviceInformation + newMarks;
            marksTagAmc[i] = "<Amc>" + marks[i] + "</Amc>"; // складываем в массив марки с тегом <Amc> и </Amc>
        }
        finalMarks = marks;
        arrayMarksTagAmc = marksTagAmc;
    }

    // Создане файла + перекладывание данных
    public static void createFile(String[] marks) throws IOException{
        File file = new File(nameFile);
        boolean success = file.createNewFile();
        FileWriter writer = new FileWriter(file);
        String m;

        for (int i = 0; i < marks.length; i++){
            m = marks[i];
            if (i != marks.length - 1){
                m = marks[i] + "\n";
            }
            writer.write(m);
            writer.flush();
        }
        writer.close();
        if (!checkFile(file)) {
            System.out.println("Данные готовы!");
        } else {
            System.out.println("Что-то пошло не так!");
        }
    }

    // Выбор
    public static void change() throws IOException{
        createFile(finalMarks);
        int step = 0;
        System.out.println("Создать отдельный файл с тегами <Amc> и </Amc>?\n" +
                "1. Да\n" +
                "2. Нет");
        step = scanner.nextInt();
        if (step == 1){
            nameFile = "AmcTag" + nameFile;
            createFile(arrayMarksTagAmc);
        }
    }

    //    Метод - проверка, пустой файл или нет
    public static boolean checkFile(File file) {
        return file.length() == 0;
    }
}