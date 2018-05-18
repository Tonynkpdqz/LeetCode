package com.nkpdqz.junior.arrray;

import java.util.Arrays;

public class _08 {

    public static void main(String[] args) {
        int[] a = {0,0,1};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }

    private static void moveZeroes(int[] nums) {
        int k = 0;
        for (int num : nums) {
            if (num == 0) {
                k++;
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0){
                if (nums[i+1] == 0){
                    for (int j = i+1; j < nums.length; j++) {
                        int t = nums[j-1];
                        nums[j-1] = nums[j];
                        nums[j] = t;
                    }
                    i--;
                    for (int j = nums.length-k; j < nums.length; j++) {
                        if (nums[j] != 0){
                            break;
                        }
                        if (nums[nums.length-1] == 0){
                            i++;
                        }
                    }
                }else{
                    for (int j = i+1; j < nums.length; j++) {
                        int t = nums[j-1];
                        nums[j-1] = nums[j];
                        nums[j] = t;
                    }
                }
            }
        }
    }

    //nicer
    /*
    * 此算法的精髓在于：在循环遍历中将0元素全部集中起来，整体向后移位，
    * 但是由于连续的0元素都是相等的，因此就算往前移位，
    * 也只需要将最前面的0元素和连续0元素的结束位置的后一位元素进行调换，
    * 相当于整个0元素块都向后移动了一位。
        由于数组中可能有多个0，因此，第一次循环的时候，就将第一个0元素找出，
        并且记录当前0元素的游标(此时0元素开始的游标和结束的游标相等)，第二次循环的时候，
        直接从0元素结束的游标的后一位开始循环遍历，如果循环遍历过程中，遇到了0元素，
        则将0元素的结束游标+1；如果没有遇到0元素，则将0元素开始位置和当前位置的数进行置换，
        并且将0元素的开始游标和结束游标都+1。
     */
    public void moveZeroes2(int[] nums) {
        int size = nums.length;
        int startIndex = 0;
        // 0元素开始的位置
        int endIndex = 0;
        // 0元素结束的位置
        int currentNum;
        int i= 0;
        // 第一步：找到第一个0元素开始的位置
        // 并将第一个0元素的游标赋值给startIndex&endIndex
        while(i < size){
            currentNum = nums[i];
            if (currentNum == 0) {
                startIndex = i;
                endIndex = i;
                break;
            }
            ++i;
        }
        // 如果当前数组中没有找到0元素，则推出
        if (nums[endIndex] != 0)
            return;

        // 将当前i的值加1；直接从刚才0元素位置的后一位置开始循环
        ++i;
        while (i < size) {
            currentNum = nums[i];
            if (currentNum == 0){//如果当前元素等于0，则将i值赋值给endIndex
                endIndex = i;
            } else {
                // 如果不为0
                //则将当前元素赋值给nums[startIndex]
                // 并将当前位置的元素赋值为0
                // startIndex和endIndex都加1；
                nums[startIndex] = currentNum;
                nums[i] = 0;
                ++startIndex;
                ++endIndex;
            }
            ++i;
        }
    }


}
