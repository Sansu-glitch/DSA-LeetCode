class Solution {
    public int calPoints(String[] op) {
        Stack <Integer> s = new Stack<>();

        for(int i =0; i<op.length;i++) {
            String b = op[i];

            if(b.equals("C")) {
                s.pop();
            } else if (b.equals("D")) {
                s.push(s.peek()*2);
            } else if (b.equals("+")) {
                int top = s.pop();
                int secele = s.peek();
                s.push(top);
                s.push(top + secele);
            } else {
                s.push(Integer.parseInt(b));
            }

           

            }
            int sum = 0;
             for(int j= 0; j<s.size();j++) {
                sum = sum + s.get(j);


        }
        return sum;

        
    }
}