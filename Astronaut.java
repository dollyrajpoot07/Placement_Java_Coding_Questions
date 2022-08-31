// The member states of the UN are planning to send  people to the moon. 
// They want them to be from different countries. You will be given a list of pairs of astronaut ID's. 
// Each pair is made of astronauts from the same country. Determine how many pairs of astronauts from different countries they can choose from.
// Sample Input 1
// 5 3
// 0 1
// 2 3
// 0 4
// Sample Output 1
// 6
// Sample Input 2
// 4 1
// 0 2
// Sample Output 2
// 5
// import java.io.*;
// import java.util.*;

// public class Astronaut {
//     static void numSeclection(LinkedList<Integer>[] links){
//         int n = links.length;
//         int[] group = new int[n];
//         long[] count = new long[n+1];
//         LinkedList<Integer> q = new LinkedList();
//         q.add(0);
//         group[0] = 1; count[1] = 1;
//         int curGroup = 1;
//         int unassignedNode = 1;
//         while (!q.isEmpty()){
//             int cur = q.removeFirst();
//             for (int next:links[cur])
//                 if (group[next]==0){
//                 group[next] = curGroup;
//                 q.add(next);
//                 count[curGroup]++;
//             }
//             if (q.isEmpty()){
//                 while(unassignedNode<n && group[unassignedNode]!=0) unassignedNode++;
//                 if (unassignedNode<n){
//                     curGroup++;
//                     group[unassignedNode] = curGroup;
//                     q.add(unassignedNode);
//                     count[curGroup]++;
//                     unassignedNode++;
//                 }
//             }
//         }
//         long result = 0;
//         long total = 0;
//         for (int i=0; i<=curGroup; i++)
//             total += count[i];
//         for (int i=0; i<=curGroup; i++){
//             total -= count[i];
//             result += total*count[i];
//         }
//         System.out.print(result);
//     }

//     public static void main(String[] args) {
//         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         LinkedList<Integer>[] links = new LinkedList[n];
//         for (int i=0; i<n; i++)
//             links[i] = new LinkedList();
//         for (int i=0; i<m; i++){
//             int x = sc.nextInt();
//             int y = sc.nextInt();
//             links[x].add(y);
//             links[y].add(x);
//         }
//         numSeclection(links);
//     }
// }