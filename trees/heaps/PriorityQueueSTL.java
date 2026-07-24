package heaps;

import java.util.*;
public class PriorityQueueSTL{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(3);
        pq.add(-30); pq.add(-18);
        pq.add(5);
        System.out.println(pq);
        System.out.println(pq.remove());
        
    }
}