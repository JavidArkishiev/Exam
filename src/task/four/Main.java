package generics.task3;

import com.sun.source.doctree.SeeTree;

import java.util.*;
// Write a generic method that takes in a list of any
//        type and returns a new list that contains only unique elements.

public class Main {

    public static <T> List getUniqeElement(List<T> list) {
        Set<T> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (!set.contains(list.get(i))) {
                set.add(list.get(i));

            }
        }
        List<T> result = new ArrayList<>();
        for (T t : result) {
            result.add(t);

        }
        return result;

    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that you need for loop");
        int value = scanner.nextInt();
        for (int i = 0; i < value; i++) {
            System.out.println("enter numbers that you need");
            list.add(scanner.nextInt());
        }

        for (Object i : getUniqeElement(list)) {
            System.out.println(i);
        }
    }

}
