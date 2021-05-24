import java.util.*;

public class jesse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k  = scanner.nextInt();
        List<Integer> listOfSweetness = new ArrayList<Integer>(n);

        for(int i = 0; i<n ; i++){
            listOfSweetness.add(scanner.nextInt());
        }

        int numberOfIteration = cookies(k, listOfSweetness, 0);
        System.out.println(numberOfIteration);


    }
    public static int cookies(int k, List<Integer> A, int count) {
        Collections.sort(A);
        System.out.println(A);
        if(A.get(0) >= k){
            return count;
        }else{
            if(A.size() >1){
                int temp = A.get(0) + (A.get(1)*2);
                A.remove(0);
                A.remove(0);

                A.add(temp);
                return cookies(k, A, count+1);
            }else{
                return -1;
            }

        }
    }


}
