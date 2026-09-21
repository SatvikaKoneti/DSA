class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        solve(0, nums, current, result);

        return result;
    }

    public void solve(int index, int[] nums, List<Integer> current,
                      List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // TAKE
        current.add(nums[index]);
        solve(index + 1, nums, current, result);

        // BACKTRACK
        current.remove(current.size() - 1);

        // DON'T TAKE
        solve(index + 1, nums, current, result);
    }
}