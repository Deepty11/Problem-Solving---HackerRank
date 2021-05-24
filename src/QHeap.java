/*
 * Copyright (c)  2021.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class QHeap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(br.readLine());
        List<Integer> minimumList = new ArrayList<>(q);
        for(int i = 0;i<q; i++){
            String[] qv = br.readLine().split(" ");
            int qType = Integer.parseInt(qv[0]);

            switch (qType){
                case 1:
                    int valueToBeAdded = Integer.parseInt(qv[1]);
                    pq.add(valueToBeAdded);
                    break;
                case 2:
                    int valueToBeRemoved = Integer.parseInt(qv[1]);
                    pq.remove(valueToBeRemoved);
                    break;
                case 3:

                    System.out.println(pq.peek());
                    break;
            }

        }
//        if(!minimumList.isEmpty()){
//            for(Integer elem: minimumList){
//
//                System.out.println(elem);
//            }
//        }
    }
}
