package book.java.com.Java2Lesson1;

public class Dog extends Animal implements Waterfowl{
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

    @Override
    public void swim(){
        System.out.println(this.name + " плывёт");
    }
}