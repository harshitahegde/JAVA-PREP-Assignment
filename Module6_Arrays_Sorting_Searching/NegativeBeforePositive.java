public class NegativeBeforePositive {

    public static void main(String[] args) {

        int nums[] = {1,-2,3,-4,5,-6};

        int left=0;
        int right=nums.length-1;

        while(left<=right){

            if(nums[left]<0)
                left++;

            else if(nums[right]>0)
                right--;

            else{

                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }

        for(int x:nums)
            System.out.print(x+" ");
    }
}