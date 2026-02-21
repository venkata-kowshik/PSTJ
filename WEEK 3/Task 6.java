class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer[] idx = new Integer[n];
        
        // Create array of indices
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        
        // Sort indices by height descending
        Arrays.sort(idx, (a, b) -> heights[b] - heights[a]);
        
        // Build result
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = names[idx[i]];
        }
        return answer;
    }
}