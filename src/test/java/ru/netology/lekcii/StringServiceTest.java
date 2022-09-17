package ru.netology.lekcii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringServiceTest {

    @Test
    public void shouldFindLongestIfFirst(){
        StringsService service = new StringsService();

        // создаем две строки
        String s1 = "Hello";
        String s2 = "Wow";

        String expected = s1;
        String actual = service.LongestString(s1, s2);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldWorkIfEqualsLength(){
        StringsService service = new StringsService();

        String s1 = "Hello";
        String s2 = "World";

        String expected = s2; // нужно уточнять, какую строку в таких случаях нужно возвращать
        String actual = service.LongestString(s1, s2);

        Assertions.assertEquals(expected, actual);






    }
}
