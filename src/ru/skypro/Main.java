package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    private static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(e -> e % 2 == 0);
        System.out.println(nums);
    }

    private static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        nums.removeIf(e -> e % 2 == 1);
        Set<Integer> integerSet = new HashSet<>(nums);
        System.out.println(integerSet);
    }

    private static void task3() {
        String text = """
                Dashing through the snowIn a one-horse open sleigh
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
                Dashing through the snowIn a one-horse open sleigh
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
}