package org.programs.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyElements {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 30, 30, 40, 40};
        //Using Hashmap
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i ,0) + 1);
        }

        map.entrySet().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));

        //Using Streams
        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x-> x , Collectors.counting()))
                .entrySet().forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));
    }
}
