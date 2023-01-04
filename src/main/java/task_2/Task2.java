package task_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] arr = {"new", "new", "hello"};
        getCountOfWord(arr);
    }

    static void getCountOfWord(String[] arr){
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(arr)
                .forEach(e ->{
                    map.merge(e, 1, (i1,i2) -> i1 + i2);
                    if(map.values().stream().reduce((a,b) -> a + b).get() == arr.length){
                        map.forEach((key, value)->{
                            System.out.printf("%-10s %-5d%n", key,value);
                        });
                    }
                });
    }
}
