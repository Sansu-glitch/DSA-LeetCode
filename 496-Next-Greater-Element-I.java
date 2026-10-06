class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack <Integer> st = new Stack<>();
        HashMap <Integer, Integer> hs = new HashMap<>();

        for(int i = 0; i<nums2.length;i++) {
            int current = nums2[i];
        
        while(!st.isEmpty() && current > st.peek()) {
            hs.put(st.peek(),current);
            st.pop();

             
        }
        st.push(current);

        }
        while(!st.isEmpty()) {
            hs.put(st.pop(),-1);
        }
        int ans[] = new int[nums1.length];
        for(int i = 0; i<nums1.length;i++) {
            ans[i] = hs.get(nums1[i]);
        }
        return ans;
        
    }
}