import java.util.Arrays;

public class Demo {

    public String[] sortArray(String[] input) {
        boolean redo = true;

        while (redo) {
            redo = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i+1] != null) {
                    if (needsToSwap(input[i], input[i+1])) {
                        swap(input, i, i + 1);
                        redo = true;
                    }
                }
            }
        }

        return input;
    }

    public String[] swap(String[] array, int firstIndex, int secondIndex) {
        String temp;
        temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        return array;
    }

    public Boolean needsToSwap(String string1, String string2) {
        if (string1 == null && string2 == null) return false;
        else if (string1 == null) return true;
        else if (string1.length() > string2.length()) return true;
        else if (string1.compareTo(string2) > 0 && string1.length() == string2.length()) return true;
        return false;
    }
}
