import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Створення кореневої папки
        Folder root = new Folder("Root");

        // Додавання файлів до кореневої папки
        root.add(new File("File1.txt", 500));
        root.add(new File("File2.txt", 300));

        // 2. Створення вкладеної папки
        Folder subFolder = new Folder("SubFolder");
        subFolder.add(new File("SubFile1.txt", 200));
        subFolder.add(new File("SubFile2.txt", 150));

        // Додавання вкладеної папки до кореневої
        root.add(subFolder);

        // 3. Вивід структури
        System.out.println("Структура каталогів:");
        root.printStructure("");

        // 4. Розрахунок загального розміру
        System.out.println("\nЗагальний розмір кореневої папки: " + root.getSize() + " bytes");

        // 5. Перейменування файлу у вкладеній папці
        System.out.println("\nПерейменування SubFile1.txt на SubFile1_Renamed.txt...");
        subFolder.add(new File("SubFile1_Renamed.txt", 200));
        subFolder.remove(new File("SubFile1.txt", 200));

        // Повторний вивід структури
        System.out.println("\nОновлена структура каталогів:");
        root.printStructure("");
    }
}
