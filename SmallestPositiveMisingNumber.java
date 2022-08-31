// //You are given an array arr[] of N integers including 0. 
// //The task is to find the smallest positive numbers missing from the array.
// //Constraints:
// //1 <= N <= 10^6.
// //-10^6 <= Ai <= 10^6.
// //Input:
// // 0 -9  1 3 -4 5 
// //Output:
// // 2

// import java.util.*;

// public class SmallestPositiveMisingNumber {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         final int N = (int) (1e6 + 2);

//         boolean[] check = new boolean[N];

//         for (int i = 0; i < N; i++) {
//             check[i] = false;
//         }

//         for(int i = 0; i < n; i++) {
//             if(arr[i] >= 0) {
//                 check[arr[i]] = true;
//             }
//         }

//         int ans = -1;

//         for(int i = 1; i < N; i++) {
//             if(check[i] = false) {
//                 ans = i;
//                 break;
//             }
            
//         }
//         System.out.println(ans);
//         sc.close();
//     }
// }