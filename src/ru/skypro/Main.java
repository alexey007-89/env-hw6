package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
        task6("ab","abccb");
        task7("cat","act");

    }

    private static void task1() {
        List<Integer> nums = new LinkedList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(e -> e % 2 == 0);
        System.out.println(nums);
    }

    private static void task2() {
        List<Integer> nums = new LinkedList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(e -> e % 2 == 1);
        Collections.sort(nums);
        Set<Integer> integerSet = new HashSet<>(nums);
        System.out.println(integerSet);
    }

    private static void task3() {
        String text = """
                Dashing through the snow
                In a one-horse open sleigh
                O'er the fields we go
                Laughing all the way
                Bells on bobtails ring
                Making spirits bright
                What fun it is to ride and sing
                A sleighing song tonight
                Jingle bells, jingle bells
                Jingle all the way
                Oh, what fun it is to ride
                In a one-horse open sleigh, hey
                Jingle bells, jingle bells
                Jingle all the way
                Oh, what fun it is to ride
                In a one-horse open sleigh
                A day or two ago
                I thought I'd take a ride
                And soon, Miss Fanny Bright
                Was seated by my side
                The horse was lean and lank
                Misfortune seemed his lot
                He got into a drifted bank
                And then we got upsot""";
        text = text.toLowerCase().replace('\n', ' ').replaceAll("[,]", "");
        String[] words = text.split(" ");
        HashSet<String> stringSet = new HashSet<>(List.of(words));
        System.out.println(stringSet);
    }

    private static void task4() {
        String text = """
                Dashing through the snow
                In a one-horse open sleigh
                O'er the fields we go
                Laughing all the way
                Bells on bobtails ring
                Making spirits bright
                What fun it is to ride and sing
                A sleighing song tonight
                Jingle bells, jingle bells
                Jingle all the way
                Oh, what fun it is to ride
                In a one-horse open sleigh, hey
                Jingle bells, jingle bells
                Jingle all the way
                Oh, what fun it is to ride
                In a one-horse open sleigh
                A day or two ago
                I thought I'd take a ride
                And soon, Miss Fanny Bright
                Was seated by my side
                The horse was lean and lank
                Misfortune seemed his lot
                He got into a drifted bank
                And then we got upsot""";
        text = text.toLowerCase().replace('\n', ' ').replaceAll("[,]", "");
        String[] words = text.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(List.of(words));
        HashSet<String> set = new HashSet<>(arrayList);
        for (String s : set) {
            if (Collections.frequency(arrayList, s) > 1) {
                System.out.println("Слово " + s + " повторяется " + Collections.frequency(arrayList, s) + " раз.");
            }
        }
    }

    private static void task5() {
        List<Integer> nums = new ArrayList<>(List.of(
                2, 2, 2, 2,
                3, 3, 3,
                4,
                5,
                6,
                7, 7,
                8, 8, 8,
                9,
                10, 10));
        nums.sort(Comparator.naturalOrder());
        System.out.println(nums);
        HashSet<Integer> numsSet = new HashSet<>(nums);
        // далее последует решение, если дословно выполнять условия задания
//        numsSet.removeIf(s -> Collections.frequency(nums, s) == 1);
//        System.out.println(numsSet);
//        for (int i = 0; i < nums.size(); i++) {
//            if (numsSet.contains(nums.get(i))) {
//                nums.set(i, 0);
//            } else {
//                nums.set(i, 1);
//            }
//        }
//        System.out.println(nums);
//        int sum = 0;
//        for (Integer num : nums) {
//            sum += num;
//        }
//        System.out.println("Сумма = " + sum);
        // к этому же итогу можно прийти гораздо проще
        numsSet.removeIf(s -> Collections.frequency(nums, s) > 1);
        System.out.println("Сумма = " + numsSet.size());
    }

    private static void task6(String word1, String word2) {
        ArrayList<Character> list1 = getCharacterArrayList(word1);
        ArrayList<Character> list2 = getCharacterArrayList(word2);
        HashSet<Character> set1 = new HashSet<>(list1);
        HashSet<Character> set2 = new HashSet<>(list2);
        if (set1.equals(set2)) {
            System.out.println(word1 + ", " + word2 + "-> " + true);
        } else {
            System.out.println(word1 + ", " + word2 + "-> " + false);
        }
    }

    private static ArrayList<Character> getCharacterArrayList(String word1) {
        Character[] arr1 = word1.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
        ArrayList<Character> list1 = new ArrayList<>(List.of(arr1));
        return list1;
    }

    private static void task7(String word1, String word2) {
        ArrayList<Character> list1 = getCharacterArrayList(word1);
        ArrayList<Character> list2 = getCharacterArrayList(word2);
        HashSet<Character> set1 = new HashSet<>(list1);
        HashSet<Character> set2 = new HashSet<>(list2);
        if (set1.equals(set2) && list1.size() == list2.size()) {
            System.out.println(word1 + ", " + word2 + "-> " + true);
        } else {
            System.out.println(word1 + ", " + word2 + "-> " + false);
        }
    }
}