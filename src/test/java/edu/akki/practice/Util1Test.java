package edu.akki.practice;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Util1Test {

    Util1 object = new Util1();

    @Test
    public void testGetMiddleThreeFromString() {
        final String input = "mentoring";
        assertEquals(object.getMiddleThreeFromString(input), "tor");
    }


    /**
     * * <b>EXPECTATIONS:</b><br>
     * speedingFine(60, false)  <b>---></b> 0 <br>
     * speedingFine (65, false)   <b>---></b> 100 <br>
     * *   /
     */
    @Test
    public void testSpeedingFine() {
        Integer expected = 0;
        assertEquals(expected, object.speedingFine(60, false));

        Integer expectedCase2 = 100;
        assertEquals(expectedCase2, object.speedingFine(65, false));

        Integer expectedCase3 = 0;
        assertEquals(expectedCase3, object.speedingFine(65, true));
    }


    /**
     * * <b>EXPECTATIONS:</b><br>
     * twoSumOne(1, 2, 3)   <b>---></b> true <br>
     * twoSumOne(3, 1, 2)    <b>---></b> true <br>
     * twoSumOne(3, 2, 2) <b>---></b> false <br>
     */
    @Test
    public void testTwoSumOne() {
        Boolean expected1 = true;
        assertEquals(expected1, object.twoSumOne(1, 2, 3));

        Boolean expected2 = true;
        assertEquals(expected1, object.twoSumOne(3, 1, 2));

        Boolean expected3 = false;
        assertEquals(expected3, object.twoSumOne(3, 2, 2));
    }

    /**
     * * <b>EXPECTATIONS:</b><br>
     * insideBrackets("xyz[abc]123") <b>---></b> [abc]<br>
     * insideBrackets("x[hello]") <b>---></b> [hello] <br>
     * insideBrackets("[xy]1") <b>---></b> [xy] <br>
     */
    @Test
    public void testInsideBrackets() {
        String expected1 = "[abc]";
        assertEquals(expected1, object.insideBrackets("xyz[abc]123"));


        String expected2 = "[hello]";
        assertEquals(expected2, object.insideBrackets("x[hello]"));


        String expected3 = "[xy]";
        assertEquals(expected3, object.insideBrackets("[xy]1"));
    }

    /**
     * <b>EXPECTATIONS:</b><br>
     * repeatHyphen("hello") <b>---></b> hel-lo<br>
     * repeatHyphen("xxyy") <b>---></b> x-xy-y <br>
     * repeatHyphen("aaaa") <b>---></b> a-a-a-a <br>
     */
    @Test
    public void testRepeatHyphen() {
        String expected1 = "hel-lo";
        assertEquals(expected1, object.repeatHyphen("hello"));


        String expected2 = "x-xy-y";
        assertEquals(expected2, object.repeatHyphen("xxyy"));


        String expected3 = "a-a-a-a";
        assertEquals(expected3, object.repeatHyphen("aaaa"));
    }

    /*
    * <b>EXPECTATIONS:</b><br>
            endoo("oore") <b>---></b> reoo<br>
            endoo("oohoi") <b>---></b> hiooo <br>
            endoo("oanotgo") <b>---></b> antgooo <br>

     */
    @Test
    public void testEndoo() {
        String expected1 = "reoo";
        assertEquals(expected1, object.endoo("oore"));


        String expected2 = "hiooo";
        assertEquals(expected2, object.endoo("oohoi"));


        String expected3 = "antgooo";
        assertEquals(expected3, object.endoo("oanotgo"));
    }

    /*
    * <b>EXPECTATIONS:</b><br>
            yoYo("") <b>---></b> 1<br>
            yoYo("nyonnyon")<b>---></b> 2 <br>
            yoYo("yo")  <b>---></b> 1 <br>

     */
    @Test
    public void testCountOccurence() {
        int expected1 = 1;
        assertEquals(expected1, object.countOccurence("xhyoxx", "yo"));
        int expected2 = 2;
        assertEquals(expected2, object.countOccurence("nyonnyon", "yo"));
        int expected3 = 1;
        assertEquals(expected3, object.countOccurence("yo", "yo"));
    }


}