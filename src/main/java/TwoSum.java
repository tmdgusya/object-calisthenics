public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
            answer = fixedSecondIndex(nums, target, firstIndex, answer);
        }
        return answer;
    }

    public int[] fixedSecondIndex(int[] nums, int target, int firstIndex, int[] answer) {
        for (int secondIndex = 0; secondIndex < nums.length; secondIndex++) {
            answer = getIndexOfSumOfTarget(nums, target, firstIndex, secondIndex, answer);
        }
        return answer;
    }

    public int[] getIndexOfSumOfTarget(int[] nums, int target, int firstIndex, int secondIndex, int[] answer) {
        if (firstIndex != secondIndex && (nums[firstIndex] + nums[secondIndex]) == target) {
            answer[0] = firstIndex;
            answer[1] = secondIndex;
            return answer;
        }
        return answer;
    }

}
