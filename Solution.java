import java.util.*;
class Solution {
    public int[] moveZeroes(int[] nums) { 
        int i = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            } 
        } 
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
    }
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Solution sol = new Solution();
	System.out.println("Enter the size: ");
	int size = sc.nextInt();
	int[] nums = new int[] nums;
	for(int i=0; i<size; i++){
	nums[i] = sc.nextInt();
	}
	sc.moveZeroes(nums);
	sc.close();
	
	
	
