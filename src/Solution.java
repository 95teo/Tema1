import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<Integer>();
        int a11[]= new int[5];
        boolean isNull= Arrays.stream(a11).allMatch(Objects::isNull);
        if(isNull)
            System.out.println("The array is empty");
        else
            System.out.println("The array is not empty");
        System.out.println("Array list is empty? "+a1.isEmpty());
    }
}