//Given an integer array nums, rotate the array to the right by k steps,
//  where k is non-negative.
class Solution {
    public void rotate(int[] nums, int k) {
        Scanner sc = new Scanner(System.in);
        k=k % nums.length;
        int[] arr = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
           arr[(k + i) % nums.length] = nums[i] ;
        }
        for(int i=0; i<nums.length; i++)
        {
           nums[i] = arr[i];
        }
        System.out.println(arr);
    }
}