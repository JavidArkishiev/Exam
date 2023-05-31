package task.one;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you need for loop");
        int value = scanner.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.println("enter words that you need");
            String s = scanner.next();
            list.add(s);
        }
        list.stream()
                .filter(m -> m.length() <= 3)
                .forEach(System.out::println);
    }
}
