

/*
 * Copyright 2013, Rehnuma Reza, All rights reserved.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {
    static long largestRectangle(int[] h) {
        Stack<Integer> stack = new Stack<>();
        long largest = 0;
        for(int i=0;i<h.length;i++){
            int count = 1;
            if(!stack.isEmpty()){
                int index = stack.size() -1;
                while(index>=0){
                    if(stack.get(index)>=h[i]){
                        count++;
                    }else{
                        break;
                    }
                    index--;
                }
            }
            stack.push(h[i]);
            for(int j=i+1;j<h.length;j++){
                if(h[i]<=h[j]){
                    count++;
                }else{
                    break;
                }
            }
            long temp = (long)count * h[i];
            //System.out.println("h[i]:"+ h[i] +"  "+ count);
            largest = Math.max(temp, largest);
        }
        return largest;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] inputs = new int[n];
        Scanner scan = new Scanner(System.in);
        for (int i =0;i<n;i++){
            inputs[i] = scan.nextInt();
        }
        long result = largestRectangle(inputs);
        System.out.println(result);


    }
}
