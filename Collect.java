// Collection API - concept
// Collection - interface
// Collections - class

import java.util.*;


public class Collect {
    public static void main(String[] args){
        Set<Integer> nums = new HashSet<Integer>( );
        nums.add(6);
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(2);

//        System.out.println(nums.get(1));

        for (int n: nums){

        System.out.println(n);
        }
    }
}
