import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class DemoTest {

    Demo demo = new Demo();



    @Test
    public void test() {
        //Arrange
        String[] stringArray = new String[] {"1", "5", "15", "9", "4"};
        String[] expected = new String[] {"1", "4", "5", "9", "15"};

        //Act
        String[] actual = demo.sortArray(stringArray);


        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        //Arrange
        String[] stringArray = new String[] {"1", "5", "15", "932", "4"};
        String[] expected = new String[] {"1", "4", "5", "15", "932"};

        //Act
        String[] actual = demo.sortArray(stringArray);


        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWithLetters() {
        //Arrange
        String[] stringArray = new String[] {"T", "e", "S", "932", "test"};
        String[] expected = new String[] {"S", "T", "e", "932", "test"};

        //Act
        String[] actual = demo.sortArray(stringArray);


        //Assert
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testWithNull() {
        //Arrange
        String[] stringArray = new String[] {"80", "1", "5", null, "607"};
        String[] expected = new String[] {"1", "5", "80", "607", null};

        //Act
        String[] actual = demo.sortArray(stringArray);


        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    //SUBMETHOD TESTS

    @Test
    public void swapMethodTest() {
        //Arrange
        String[] testArray = new String[] {"first", "second"};
        String[] expected = new String[] {"second", "first"};
        //Act
        String[] actual = demo.swap(testArray, 0, 1);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void swapMethodTestWithMoreStrings() {
        //Arrange
        String[] testArray = new String[] {"first", "second", "third", "fourth"};
        String[] expected = new String[] {"third", "second", "first", "fourth"};
        //Act
        String[] actual = demo.swap(testArray, 0, 2);

        //Assert
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void needsToSwapTest() {
        //Arrange
        String first = "first";
        String second = "second";

        //Act
        boolean actual = demo.needsToSwap(second, first);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void needsToSwapTest2() {
        //Arrange
        String a = "1";
        String b = "15";

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void needsToSwapTest3() {
        //Arrange
        String a = "5";
        String b = "9";

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void needsToSwapTest4() {
        //Arrange
        String a = "15";
        String b = "5";

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void needsToSwapTest5() {
        //Arrange
        String a = "25";
        String b = "15";

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void needsToSwapTest6() {
        //Arrange
        String a = "t";
        String b = "z";

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }

    @Test
    public void needsToSwapTest7() {
        //Arrange
        String a = "longer";
        String b = "sho";

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void needsToSwapTest8() {
        //Arrange
        String a = null;
        String b = "sho";

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertTrue(actual);
    }

    @Test
    public void needsToSwapTest2Nulls() {
        //Arrange
        String a = null;
        String b = null;

        //Act
        boolean actual = demo.needsToSwap(a, b);

        //Assert
        Assert.assertFalse(actual);
    }


//Will fix later with regex
//    @Test
//    public void testWithNegatives() {
//        //Arrange
//        String[] stringArray = new String[] {"80", "1", "-5", "15", "607"};
//        String[] expected = new String[] {"-5", "1", "15", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortArray(stringArray);
//
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testWithDecimals() {
//        //Arrange
//        String[] stringArray = new String[] {"80", "1", "5", "15.35", "607"};
//        String[] expected = new String[] {"1", "5", "15.35", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortArray(stringArray);
//
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testWithEmptyString() {
//        //Arrange
//        String[] stringArray = new String[] {"80", "1", "5", "", "607"};
//        String[] expected = new String[] {"", "1", "5", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortArray(stringArray);
//
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//
//    @Test
//    public void testWithSpace() {
//        //Arrange
//        String[] stringArray = new String[] {"80", "0", "5", " ", "607"};
//        String[] expected = new String[] {" ", "0", "5", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortArray(stringArray);
//
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testWithSpaces() {
//        //Arrange
//        String[] stringArray = new String[] {"80", "0", "5", "  ", "607"};
//        String[] expected = new String[] {"  ", "0", "5", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortArray(stringArray);
//
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
//
//    @Test
//    public void testWithLeadingZeroes() {
//        //Arrange
//        String[] stringArray = new String[] {"80", "0", "5", "0001", "607"};
//        String[] expected = new String[] {"0", "0001", "5", "80", "607"};
//
//        //Act
//        String[] actual = demo.sortArray(stringArray);
//
//
//        //Assert
//        Assert.assertArrayEquals(expected, actual);
//    }
}
