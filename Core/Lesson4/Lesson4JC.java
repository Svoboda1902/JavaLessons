import java.util.*;

/**
 * Lesson 4. JavaCoreDZ4.
 *
 * @author Tselovalnikov S
 * @version 10 november 2021
 */

public class Lesson4JC {

     public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    for (int i = 0; i < 12; i++) {
        arrayList.add("Запись_" + i);
        if (i % 2 == 0) {
            arrayList.add("Запись_" + i);
        }
    }
    System.out.println("Задание № 1");
    System.out.println("Наш массив до \n" + arrayList);

    //Переводим arrayList в linkedHashSet и он сам удаляет и сортирует дубликаты
    System.out.println("Наш массив после LinkedHashSet (вариант 1)");
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(arrayList);
    System.out.println(linkedHashSet);
    int j = arrayList.size() - linkedHashSet.size();
    System.out.println("количество элементов: " + linkedHashSet.size() + ", дубли off: " + j);

    //Переводим arrayList в hashSet он также удаляет дубликаты но без сортировки
    HashSet<String> hashSet = new HashSet<>();
    for (String s : arrayList) {
        hashSet.add(s);
    }
    int y = arrayList.size() - hashSet.size();
    System.out.println("Наш массив после HashSet (вариант 2) \n" + hashSet + "\n количество элементов: " + hashSet.size() + ", удалено дубликатов: " + y);

    //Переводим arrayList в TreeSet и он сам удаляет дубликаты и плохо сортирует
    System.out.println("Наш массив после TreeSet (вариант 3)");
    TreeSet<String> treeSet = new TreeSet<>(arrayList);
    System.out.println(treeSet);

    System.out.println("Задание № 2");
         TelefoneDirectory telefoneDirectory = new TelefoneDirectory();
         telefoneDirectory.add("89090909090", "Agent1");
         telefoneDirectory.add("89090909091", "Agent2");
         telefoneDirectory.add("89090909092", "Agent3");
         telefoneDirectory.add("89090909093", "Agent4");
         telefoneDirectory.add("89090909094", "Agent2");
         telefoneDirectory.get("Agent2");
         telefoneDirectory.get("Agent4");
    }
}

