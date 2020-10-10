package com.company;

public class Main {
    public static void main(String[] args){
        //    Создадим новый объект
        Employee employee = new Employee();
        //    Создаём объект (как массив)
        Employee[] employeeArray = new Employee[5];
        //    Создаём сотрудников
        employeeArray[0] = new Employee("Романенко Василий Александрович", "Программист", "test1@gmail.com", "8-222-222-22-22", 50000, 45);
        employeeArray[1] = new Employee("Сафонов Артём Юрьевич", "Программист", "test2@gmail.com", "8-454-345-34-34", 50000, 43);
        employeeArray[2] = new Employee("Левин Борис Аркадьевич", "Тестировщик", "test3@gmail.com", "8-567-456-56-67", 45000, 30);
        employeeArray[3] = new Employee("Романов Владимир Владимирович", "Тестировщик", "test4@gmail.com", "8-345-444-55-55", 45000, 34);
        employeeArray[4] = new Employee("Лобанов Руслан Русланович", "Руководитель проета", "test5@gmail.com", "8-333-788-99-00", 70000, 46);
        //    Вызываем список сотрудников
        for (int i = 0; i < employeeArray.length; i++){
            if (employeeArray[i].age > 40){
                employeeArray[i].informationAboutEmployees();
                System.out.println();
            }
        }
    }
}
