package task_1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"new", "new", "hello"};
        System.out.println(returnStringWithoutRepetitions(arr));
    }

    public static Set<String> returnStringWithoutRepetitions(String[] arr){
        return new HashSet<>(List.of(arr));
    }
}


