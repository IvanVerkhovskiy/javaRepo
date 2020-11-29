package book.java.com.Java2Lesson1;

public class Cat {
    private String name;
    private int age;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Возраст кота не может быть отрицательным!");
        }
    }

//    Метод - вызов информации по котику
    public void getInformationForCat(){
        if (age == 0){
            System.out.println("Кота зовут: " + this.name + "\n" +
                    "Возраст кота не указан.");
        } else {
            System.out.println("Кота зовут: " + this.name + "\n" +
                    "Возраст кота: " + this.age);
        }
    }
}