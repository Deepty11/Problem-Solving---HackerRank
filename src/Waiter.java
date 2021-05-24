import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Waiter {
    static final Scanner scanner = new Scanner(System.in);
    static int[] waiter(int[] number, int q) {
        int[] primeNumbers = new int[q];
        int temp = 2;
        int count = 1;
        while(count < q){
            for(int i=2; i<=temp/2;i++){
                if(temp%i ==0){
                    break;
                }
            }

            count++;

        }

        return primeNumbers;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArray = br.readLine().split(" ");
        int n = Integer.parseInt(inputArray[0].trim());
        int q = Integer.parseInt(inputArray[1].trim());
        int[] numbers = new int[n];
        String[] plateNumber = br.readLine().split(" ");
        for(int i =  0 ;i < n;i++){
            numbers[i] = Integer.parseInt(plateNumber[i].trim());
        }
        int[] result = waiter(numbers, q);
        for(int i=0;i<q;i++){
            System.out.println(result[i]);
        }
    }



}
