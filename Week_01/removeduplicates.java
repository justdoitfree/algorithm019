public class removeduplicates {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(nums ==  null||len == 1){
            return len;
        }

        int k = 0;
        for(int i = 0;i < len;i++){
            if(nums[i]!=nums[k]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
    public void main(String[] args){
        int[] testInt = {1,1,2,2,3,4,5,5,6};
        System.out.println(removeDuplicates(testInt));
    }
}
