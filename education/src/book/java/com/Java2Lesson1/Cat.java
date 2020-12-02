package book.java.com.Java2Lesson1;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    public class CatAttt{
        String eat;

        public String getEat() {
            return eat;
        }
    }
    @Override
    public void say(){
        System.out.println("Говорит мяу!");
    }
}