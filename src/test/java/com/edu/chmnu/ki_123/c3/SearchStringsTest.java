package com.edu.chmnu.ki_123.c3;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SearchStringsTest {
    // Тест для перевірки коректного пошуку підрядка
    @Test
    void testSearchString() {
        String[] strings = {
                "Hello, how are you?",
                "We are search for strings",
                "This is an example of a search",
                "Search successful",
                "Some test"
        };

        String searchTerm = "search";

        List<String> result = SearchStrings.search(strings, searchTerm);

        assertEquals(3, result.size());
        assertTrue(result.contains("We are search for strings"));
        assertTrue(result.contains("This is an example of a search"));
        assertTrue(result.contains("Search successful"));
    }

    // Тест для перевірки пошуку з нечутливістю до регістру
    @Test
    void testSearchStringCaseInsensitive() {
        String[] strings = {
                "Search",
                "search",
                "SeaRCh"
        };

        String searchTerm = "search";

        List<String> result = SearchStrings.search(strings, searchTerm);

        assertEquals(3, result.size());
        assertTrue(result.contains("Search"));
        assertTrue(result.contains("search"));
        assertTrue(result.contains("SeaRCh"));
    }

    // Тест для перевірки, коли підрядок не знайдений
    @Test
    void testSearchNoResults() {
        String[] strings = {
                "Hello, how are you?",
                "We are search for strings",
                "This is an example of a search",
                "Search successful",
                "Some test"
        };

        String searchTerm = "nothing";

        List<String> result = SearchStrings.search(strings, searchTerm);

        assertTrue(result.isEmpty());
    }

    // Тест для перевірки пошуку з пустим підрядком
    @Test
    void testSearchEmptySubstring() {
        String[] strings = {
                "Hello, how are you?",
                "We are search for strings",
                "This is an example of a search",
                "Search successful",
                "Some test"
        };

        String searchTerm = "";

        List<String> result = SearchStrings.search(strings, searchTerm);

        assertEquals(strings.length, result.size());
    }
}