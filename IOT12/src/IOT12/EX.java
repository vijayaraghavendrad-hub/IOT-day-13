package IOT12;
public class EX {
	    public static void main(String[] args) {
	        int[] nums = {1, 1,2,2,3,4,5,6,6,7,7,4,3,2,};
	        int count = 0;
	        for (int i = 0; i < nums.length; i++) {
	            int frequency = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[i] == nums[j]) {
	                    frequency++;
	                }
	            }
	            if (frequency == 1) {
	                System.out.println("Unique number: " + nums[i]);
	                count++;
	            }
	        }
	        System.out.println("Number of unique elements: " + count);
	    }
	}