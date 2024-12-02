package com.edu.chmnu.ki_123.c3;

import java.util.ArrayList;
import java.util.List;

public class SearchStrings {
    public static void main(String[] args) {
        String[] strings = {
                "Hello, how are you?",
                "We are search for strings",
                "This is an example of a search",
                "Search successful",
                "Some test"
        };

        String searchTerm = "search";

        List<String> foundStrings = search(strings, searchTerm);

        System.out.println("Found strings:");
        for (String str : foundStrings) {
            System.out.println(str);
        }
    }

    public static List<String> search(String[] strings, String searchTerm) {
        List<String> result = new ArrayList<>();

        for (String str : strings) {
            if (str.toLowerCase().contains(searchTerm.toLowerCase())) {
                result.add(str);
            }
        }

        return result;
    }
}