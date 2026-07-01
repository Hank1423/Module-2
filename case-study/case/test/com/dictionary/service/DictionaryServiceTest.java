package com.dictionary.service;

import static org.junit.jupiter.api.Assertions.*;

import com.dictionary.entity.Word;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DictionaryServiceTest {
    private DictionaryService service;

    @BeforeEach
    public void setUp(){
        service = DictionaryService.getInstance();
    }

    @Test
    public void testCreateOrGet(){
        Word word = service.createOrGetWord("hello");
        assertNotNull(word);
        assertEquals("hello", word.getKeyword());
    }

    @Test
    public void testLookup_ShouldReturnCorrectWord() {
        service.createOrGetWord("apple");
        Word found = service.lookup("apple");
        assertNotNull(found);
        assertEquals("apple", found.getKeyword());
    }

    @Test
    public void testDrop_ShouldRemoveWordSuccessfully() {
        service.createOrGetWord("banana");
        boolean dropped = service.drop("banana");
        assertTrue(dropped);

        Word found = service.lookup("banana");
        assertNull(found);
    }
}