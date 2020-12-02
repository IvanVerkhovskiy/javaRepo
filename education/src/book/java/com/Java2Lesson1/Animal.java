package book.java.com.Java2Lesson1;

public abstract class Animal {
    int age;
    String type;
    String name;

    public Animal(String name){
        this.name = name;
    }

    public void information(){
        System.out.println("Имя домашнего питомца: \n" + this.name +
                "Возраст питомца: \n" + this.age +
                "Тип питомца: " + this.type);
    }

    public abstract void say();
}