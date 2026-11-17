class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int m = temperatures.length;
        int[] result = new int[m];

        int[] stack  = new int[m];

        int  top = -1;

        for(int i=0;i<m;i++){

            while(top !=-1 && temperatures[i] > temperatures[stack[top]]) {

                int prevIndex = stack[top--];

                result[prevIndex] = i - prevIndex;
            }

            stack[++top] = i;
        } 
        return result;
    }
}
