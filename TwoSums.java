public class TwoSums {

    public static int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i; indices[1] = j;
                }
            }
        }

        return indices;
        
    }

    public static void main(String[] args) {

        int[] intArray = {3,3};
        int aim = 6;
        int[] result = new int[2];

        result = twoSum(intArray, aim);

        for (int index: result) {
            System.out.print(index + " ");
        }

    }
    
}
