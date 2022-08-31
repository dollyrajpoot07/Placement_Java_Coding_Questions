// Binary Array => 1 1 0 1 1 1
// Output: 3 consecutive ones exits!.

import java.util.*;

public class maxConsecutiveNumbers {

    public static int maxConsecutiveOnes(int[] array, int size) {
        int max = 0;
        int current = 0;
        for(int i = 0; i < size; i++) {
            if(array[i] == 1) {
                current++;
                if(max < current) {
                    max = current;
                }
            } else {
                current = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int result = maxConsecutiveOnes(array, size);
        System.out.println("Result: " + result);
        sc.close();
    }
}
