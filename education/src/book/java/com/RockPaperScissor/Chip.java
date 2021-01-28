package book.java.com.RockPaperScissor;

public class Chip {
    // Выбор фишки компьютера
    private int peopleChip;
    // Выбор фишки пользователем
    private int computerChip;
    // Массив из фишек
    private String [] gameChip = {"Камень", "Ножницы", "Бумага"};

    public String[] getGameChip() {
        return gameChip;
    }

    public int getPeopleChip() {
        return peopleChip;
    }

    public void setPeopleChip(int peopleChip) {
        this.peopleChip = peopleChip;
    }

    public int getComputerChip() {
        return computerChip;
    }

    public void setComputerChip(int computerChip) {
        this.computerChip = computerChip;
    }

    public int getGameChipLength(){
        int value = gameChip.length;
        return value;
    }

    // Отрисовка игровых фишек
    public void visibilityGameChip(){
        int count = 1;
        for (int i = 0; i < gameChip.length; i++){
            System.out.println(count + ". " + gameChip[i]);
            count++;
        }
    }

    // Логика проверки кто победил
    public boolean whoWin(int a, int b){
        System.out.println(gameChip[a] + " против " + gameChip[b]);
        if (a == 0 && b == 1){
            System.out.println("Вы победили!");
            return false;
        } else if (a == 0 && b == 2){
            System.out.println("Победил компьютер!");
            return false;
        } else if (a == 1 && b == 0){
            System.out.println("Победил компьютер!");
            return false;
        } else if (a == 1 && b == 2){
            System.out.println("Вы победили!");
            return false;
        } else if (a == 2 && b == 1){
            System.out.println("Победил компьютер!");
            return false;
        } else if (a == 2 && b == 0){
            System.out.println("Вы победили!");
            return false;
        } else {
            System.out.println("Ничья!");
            return true;
        }
    }
}