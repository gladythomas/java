//import java.util.Arrays;
public class Solution1 {
    public void sortedSquares(int[] nums) {
        int[]  arr=nums;
        
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }    
       // Arrays.sort(arr); 
    }
        
   public static void main(String[] args) {
    Solution1 s=new Solution1();
    s.sortedSquares(1,9,3);
   } 
}

