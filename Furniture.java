/**
 * Клас Furniture описує об'єкт меблів із певними характеристиками:
 * назва, матеріал, ціна, вага та колір.
 */
public class Furniture {
    private final String name;
    private final String material;
    private final double price;
    private final int weight;
    private final String color;

    /**
     * Конструктор для створення об'єкта меблів.
     *
     * @param name     назва меблів
     * @param material матеріал виготовлення
     * @param price    ціна меблів
     * @param weight   вага меблів
     * @param color    колір меблів
     */
    public Furniture(String name, String material, double price, int weight, String color) {
        this.name = name;
        this.material = material;
        this.price = price;
        this.weight = weight;
        this.color = color;
    }

    /**
     * Отримання назви меблів.
     *
     * @return назва меблів
     */
    public String getName() {
        return name;
    }
    /**
     * Отримання матеріалу меблів.
     *
     * @return матеріал меблів
     */
    public String getMaterial() {
        return material;
    }
    /**
     * Отримання ціни меблів.
     *
     * @return ціна меблів
     */
    public double getPrice() {
        return price;
    }
    /**
     * Отримання ваги меблів.
     *
     * @return вага меблів
     */
    public int getWeight() {
        return weight;
    }
    /**
     * Отримання кольору меблів.
     *
     * @return колір меблів
     */
    public String getColor() {
        return color;
    }
    /**
     * Повертає рядкове представлення об'єкта меблів.
     *
     * @return текстова інформація про меблі
     */
    @Override
    public String toString() {
        return "Меблі [назва=" + name + ", матеріал=" + material + ", ціна=" + price + ", вага=" + weight + ", колір=" + color + "]";
    }
}
