import java.util.*;

public class JesseAndCookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k  = scanner.nextInt();
        PriorityQueue<Integer> listOfSweetness = new PriorityQueue<>();

        for(int i = 0; i<n ; i++){
            listOfSweetness.add(scanner.nextInt());
        }


        int numberOfIteration = cookies(k, listOfSweetness);
        System.out.println(numberOfIteration);


    }
    public static int cookies(int k, PriorityQueue<Integer> A) {
        int count = 0;
        System.out.println(A);
        while(A.peek()<k && A.size()>1){
            int temp = A.poll() + 2* A.poll();
            A.add(temp);
            count++;
        }
        if(A.peek()>=k){
            return count;
        }else{
            return -1;
        }

    }



}
