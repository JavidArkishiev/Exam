package task.five;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you need for loop");
        int value = scanner.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.println("enter words that you need");
            list.add(scanner.nextInt());
        }
        Integer sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
