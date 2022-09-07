import java.util.Arrays;
public class Solution1 {
    public int  sortedSquares(int[] nums) {
       Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }    
       
       return 1;
    }
        
   public static void main(String[] args) {
    Solution1 s=new Solution1();
    int arr[] = {1,9,3};
   int a =  s.sortedSquares(arr);
//    System.out.println(a);
   } 
}

