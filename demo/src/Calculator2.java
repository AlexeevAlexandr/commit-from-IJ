import java.util.Iterator;
import java.util.TreeMap;

class Solution {
    private TreeMap<Integer,Object> all = new TreeMap<>();

    private int solution(int[] A) {
        for(int i=0; i<A.length; i++)
            all.put(i+1,new Object());

        for (int aA : A)
            all.remove(aA);

        Iterator notOccur = all.keySet().iterator();
        if(notOccur.hasNext())
            return (int)notOccur.next();

        return 1;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        Solution sol = new Solution();
        System.out.println(sol.solution(a));
    }
}