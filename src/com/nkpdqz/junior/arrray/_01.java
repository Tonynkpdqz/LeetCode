package com.nkpdqz.junior.arrray;

public class _01 {

    public static void main(String[] args) {
        int[] nums = {1,2};
        int length = removeDuplicates(nums);
        System.out.println(length);
        for (int i:nums) {
            System.out.println(i);
        }
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (nums.length==1){
            return 1;
        }
        for (int i = 0; i < len && i<nums.length-1; i++) {
            //System.out.println(len+"woca");
            if (nums[i] == nums[i+1]){
                for (int j = i; j < len; j++) {
                    if (j<nums.length-1)
                        nums[j] = nums[j+1];
                    else
                        nums[j] = -1;
                }
                i--;
                len--;
            }
        }
        return len;
    }

    public int removeDuplicatesNicer(int[] nums) {
        if (nums.length == 0)
            return 0;
        //判断无输入
        int number = 0;//标记计数
        for (int i=0; i < nums.length ; i++) {
            if ( nums[i] != nums[number] ) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1; //标记+1即为数字个数
        return number;
    }

}
