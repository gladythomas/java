import java.util.Arrays;
class Solution {
    public static void main(String [] args){
          int singleNumber(int[] nums) {
              
              Arrays.sort(nums);
              
              for(int i=0;i<nums.length;i++){
                  for(int j=i+1;j<nums.length;j++){
                       if(nums[i]!=nums[j]){
                           System.out.println(nums[i]);
                       }
                  }
                 
              }
              
            return singleNumber(nums);  
            
    
    }

    public int[] sortedSquares(int[] nums) 
    {
        int arr;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            arr=nums[i]*nums[i];
        }
        System.out.println(arr);
        
    }
    return int;
    }