package com.geekbrains.cats;

public class Plate {
    private int food;

//    Конструктор
    public Plate(int food){
        this.food = food;
    }

//    Сокращаем еду, когда кот её ест
    public void decreaseFood(int n){
        if ((food - n) >= 0){
            food = food - n;
        } else {
            System.out.println("Еда почти закончилась! Необходимо добавить еды.");
        }
    }

//    Информация по еде
    public void info(){
        System.out.println("Сейчас в тарелке: " + food);
    }

//    Доступ к тарелке
    public int getFood(){
        return food;
    }
}