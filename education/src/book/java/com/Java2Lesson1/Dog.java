package book.java.com.Java2Lesson1;

public class Dog extends Animal{
    String color;
    String abc = "Тест";

    public Dog(String name, String color){
        super(name);
        this.color = color;
    }

    public String getAbc() {
        return abc;
    }

    @Override
    public void say(){
        System.out.println("Гав!");
    }
}
