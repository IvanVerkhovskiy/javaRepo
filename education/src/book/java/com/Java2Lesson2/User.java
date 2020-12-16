package book.java.com.Java2Lesson2;

public class User {
    public static void main(String[] args){
        User user = new User();

        User.Man man = user.new Man();
        man.age = 10;
        System.out.println(man.age);
    }

    protected class Man{
        protected String name;
        protected int age;
    }

    protected class Woman{
        protected String name;
        protected int age;
    }
}