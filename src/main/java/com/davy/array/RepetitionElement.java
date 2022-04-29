package com.davy.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Davy
 * <p>
 * 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
 * 如果数组中每个元素互不相同，返回 false 。
 */
public class RepetitionElement {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}
