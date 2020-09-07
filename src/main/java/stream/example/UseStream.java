package stream.example;

import java.util.Arrays;
import java.util.List;

public class UseStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango", "Banana", "Barries", "Lichi", "Watermelon");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("iterate using for each loops");
        for (String fruits : list) {
            if (fruits.startsWith("B"))
            System.out.println(fruits);
        }

        System.out.println("iterate using stream each loops");
        //list.stream().forEach(fruit -> System.out.println(fruit));
        list.stream()
              .filter(st->st.startsWith("B"))
              .forEach(fruit-> System.out.println(fruit));
    }
}
