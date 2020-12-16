package book.java.com.Java2Lesson2;

public class Main {
    public static void main(String[] args){
        Calendar monthOne = Calendar.DECEMBER;
        Calendar monthTwo = Calendar.NOVEMBER;
        Calendar monthThree = Calendar.OCTOBER;

        System.out.println(Calendar.DECEMBER.getRussianWord());
        System.out.println(Calendar.DECEMBER.ordinal());

        Calendar.testSwitch(monthOne);
        Calendar.testSwitch(monthTwo);

        SqlCommand sqlCommandSelect = SqlCommand.SELECT;
        SqlCommand sqlCommandUpdate = SqlCommand.UPDATE;

        sqlCommandSelect.action();
        sqlCommandUpdate.action();
    }
}