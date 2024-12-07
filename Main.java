import java.util.Arrays;
import java.util.Comparator;
/**
 * Основний клас для демонстрації роботи з класом Furniture.
 * Реалізовано:
 * - створення масиву меблів;
 * - сортування за ціною та вагою;
 * - пошук меблів із заданими характеристиками.
 */
public class Main {
    /**
     * Головний метод для запуску програми.
     *
     * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        //масив об'єктів Furniture
        Furniture[] furnitureArray = new Furniture[] {
                new Furniture("стілець", "дерев'яний", 120.5, 5, "сірий"),
                new Furniture("стіл", "металевий", 300.0, 15, "чорний"),
                new Furniture("диван", "шкіряний", 500.0, 30, "червоний"),
                new Furniture("полиця", "дерев'яна", 150.0, 12, "білий"),
                new Furniture("лампа", "пластикова", 45.0, 2, "жовта")
        };

        //Виведення масиву до сортування
        System.out.println("До сортування:");
        for (Furniture f : furnitureArray) {
            System.out.println(f);
        }

        //Сортування масиву за полем price за зростанням
        Arrays.sort(furnitureArray, Comparator.comparingDouble(Furniture::getPrice));
        System.out.println();
        System.out.println("Після сортування ціни (ascending):");
        for (Furniture f : furnitureArray) {
            System.out.println(f);
        }

        //Сортування масиву за полем weight за спаданням
        Arrays.sort(furnitureArray, Comparator.comparingInt(Furniture::getWeight).reversed());
        System.out.println("\nПісля сортування ваги (descending):");
        for (Furniture f : furnitureArray) {
            System.out.println(f);
        }

        //пошук об'єкта, який ідентичний заданому
        Furniture searchItem = new Furniture("диван", "шкіряний", 500.0, 30, "червоний");
        boolean found = false;
        for (Furniture f : furnitureArray) {
            if (f.getName().equals(searchItem.getName()) &&
                    f.getMaterial().equals(searchItem.getMaterial()) &&
                    f.getPrice() == searchItem.getPrice() &&
                    f.getWeight() == searchItem.getWeight() &&
                    f.getColor().equals(searchItem.getColor())) {
                found = true;
                break;
            }
        }
        System.out.println("Чи знайдені меблі? " + found);
    }
}