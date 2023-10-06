package org.example;

import org.example.МагазинИгрушек2.Toy;
import org.example.МагазинИгрушек2.ToyStore;

/**
 * Главный метод программы.
 */
public class App {
public static void main(String[] args) {
    ToyStore toyStore = new ToyStore();

    /**
     * Добавление новых игрушек
     */
    toyStore.addToy(1, "Кукла", 3);
    toyStore.addToy(2, "Машинка", 2);
    toyStore.addToy(3, "Мишка", 2);
    toyStore.addToy(4, "Пистолетик", 5);
    toyStore.addToy(5, "Мяч", 6);

    /**
     * Вызов метода Get 10 раз
     */
    for (int i = 0; i < 10; i++) {
        Toy toy = toyStore.getToy();
        if (toy != null) {
            System.out.println("ID: " + toy.getId() + ", Name: " + toy.getName() + ", Weight: " + toy.getWeight());
        }
    }

    /**
     * Запись результатов в файл
     */
    toyStore.writeToFIle("results.txt", 10);
    }
}
