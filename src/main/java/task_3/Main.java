package task_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.addIntoDictionary("Fortschritt", new ArrayList<>(List.of("прогрес")));
        dictionary.addIntoDictionary("Fortschritt", new ArrayList<>(List.of("прогрес", "будинок")));
        System.out.println(dictionary.getTranslate("Fortschritt"));
        dictionary.removeFromDictionary("Fortschritt", "будинок");
        System.out.println(dictionary.getTranslate("Fortschritt"));
    }
}
