// Write a java program to check if any number given as input is the sum of 2 prime numbers.
// Example :

// Input - 18

// Output - 

// 18 = 13 + 5
// 18 = 11 + 7

public class SumOfTwoPrimeNumbers {

    private static int check_prime(int num){
        int flag = 0;
        for(int i = 2; i<=num/2; i++){
            if(num%i == 0){
                flag = 1;
                return 1;
            }
        }
        if(flag == 0)
            return 0;
        return 1;
    }
    // Method to get print the prime sum
    private static void find(int num){
        for(int i = 2; i <= num/2; i++){
            if(check_prime(i) == 0){
                if(check_prime(num-i) == 0)
                    System.out.println(num + " = "+ (num-i) + " "+ i);
            }
        }
    }
	public static void main(String[] args) {
		find(18);
	}
}
