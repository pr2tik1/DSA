package Arrays1D;

public class largestNum {
    public int dominantIndex(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = -1;
        int temp = -1;
        for(int i=0; i<nums.length; i++){
            if(maxNum<nums[i]){
                temp = maxNum; //second maximum
                maxNum = nums[i]; //first maximum
                maxIndex = i;
            }else if(temp < nums[i]){
                temp = nums[i];
            }
        }
        // System.out.println(maxNum);
        // System.out.println(maxIndex);
        if(maxNum >= 2*temp){
            return maxIndex;
        }
        return -1;
    }
}
