package edu.akki.practice;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class QuestionsTest {

    public Questions obj=new Questions();


    @Test
    public void testCheckForAnagrams(){
        boolean expected=true;
        assertEquals(expected, obj.checkForAnagrams("amma"));
        assertNotEquals(false, obj.checkForAnagrams("abcd"));
    }


    @Test
    public void testReplacement(){
        String expected="my%20name%20is";
        assertEquals(expected, obj.replacement("my name is","%20"));
    }

    @Test
    public void testFindUniqueness(){
        assertEquals(false, obj.findUniqueness("abcdab"));
        assertEquals(true, obj.findUniqueness("aknsh"));
    }

    @Test
    public void testFindUniquenessWithLesscomplexitys(){
        assertEquals(false, obj.findUniqueness("abcdab"));
        assertEquals(true, obj.findUniqueness("aknsh"));
    }


}
