package book.java.com.Java2Lesson2;

public enum Calendar {
    OCTOBER("октябрь", 10),
    NOVEMBER("ноябрь", 11),
    DECEMBER("декабрь", 12);

    private String russianWord;
    private int monthNumber;

    Calendar(String russianWord, int monthNumber){
        this.russianWord = russianWord;
        this.monthNumber = monthNumber;
    }

    public String getRussianWord() {
        return russianWord;
    }

    public int getMonthNumber(){
        return monthNumber;
    }

    public static void testSwitch(Calendar month){
        switch (month){
            case OCTOBER:
                System.out.println("Сейчас октябрь!");
                break;
            case NOVEMBER:
                System.out.println("Сейчас ноябрь!");
                break;
            case DECEMBER:
                System.out.println("Сейчас декабрь!");
                break;
            default:
                System.out.println("Такого месяца нет!");
        }
    }
}