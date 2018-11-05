public class AAA {
    private static int gradingStudents(int[] h, String word) {
        int temp = 0;

        for(int i = 0; i<word.length(); i++){
            int ascii =(int)word.charAt(i);
            int height = h[ascii- 97];
            if(height>temp){
                temp = height;
            }
        }
        return temp*word.length();
    }
    public static void main(String[] args) {
        int a[] = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";
        System.out.println(AAA.gradingStudents(a, word));
    }
}
