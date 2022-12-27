//import java.util.Scanner;

public class substring {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i <= s.length() - k; i++) {
            String temp = s.substring(i, i + k);
            if (temp.compareTo(smallest) < 0)
                smallest = temp;
            else if (temp.compareTo(largest) > 0)
                largest = temp;
        }

        return smallest + "\n" + largest;
    }
}
