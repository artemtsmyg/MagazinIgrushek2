package org.example.МагазинИгрушек2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

/**
 * Главный класс программы.
 */
public class ToyStore {

    private final PriorityQueue<Toy> toyQueue = new PriorityQueue<>();

    /**
     * Метод для добавления новой игрушки.
     *
     * @param id     ID игрушки.
     * @param name   Название игрушки.
     * @param weight Вес (частота выпадения) игрушки.
     */
    public void addToy(int id, String name, int weight) {
        Toy toy = new Toy(id, name, weight);
        toyQueue.offer(toy);
    }

    /**
     * Метод для получения игрушки из очереди.
     *
     * @return Игрушка с наибольшим весом (наивысшей частотой выпадения).
     */
    public Toy getToy() {
        return toyQueue.poll();
    }

    /**
     * Метод для записи результатов в файл.
     *
     * @param filename Имя файла для записи.
     * @param count    Количество игрушек для записи.
     */
    public void writeToFIle(String filename, int count) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (int i = 0; i < count; i++) {
                Toy toy = getToy();
                if (toy != null) {
                    writer.write("ID: " + toy.getId() + ", Name: " + toy.getName() + ", Weight: " + toy.getWeight() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
