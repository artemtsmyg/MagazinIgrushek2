package org.example.МагазинИгрушек2;


/**
 * Класс `Toy` представляет собой объект игрушки с идентификатором, именем и весом.
 *  Он реализует интерфейс Comparable для возможности сравнения на основе веса.
 */
public class Toy implements Comparable<Toy> {
    private final int id; // Уникальный идентификатор игрушки.
    private final String name; // Название игрушки.
    private final int weight; // Вес игрушки в граммах.

    /**
     * Конструктор создает новый объект игрушки с указанным идентификатором, именем и весом.
     * @param id Уникальный идентификатор игрушки.
     * @param name Название игрушки.
     * @param weight Вес игрушки в граммах.
     */
    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    /**
     * Получить идентификатор игрушки.
     * @return Идентификатор игрушки.
     */
    public int getId() {
        return id;
    }

    /**
     * Получить название игрушки.
     * @return название игрушки.
     */
    public String getName() {
        return name;
    }

    /**
     * Получить вес игрушки.
     * @return вес игрушки.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Сравнить эту игрушку с другой игрушкой на основе их веса.
     * @param other the object to be compared.
     * @return  Отрицательное целое число, ноль или положительное целое число,
     * если вес этой игрушки меньше, равен или больше веса другой игрушки.
     */
    @Override
    public int compareTo(Toy other) {
        return Integer.compare(this.weight, other.weight);
    }
}
