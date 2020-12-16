package book.java.com.Java2Lesson2;

public enum SqlCommand {
    UPDATE{
        @Override
        public void action(){
            System.out.println("обновить");
        }
    },

    SELECT{
        @Override
        public void action(){
            System.out.println("выборка");
        }
    };

    public abstract void action();
}
