public class format_of_string {
    public static void main (String args []){
        double q = 12.5;
        int w = 1;
        System.out.printf("|%2.2f| %n",q);
        System.out.printf("|%6.2f| %n",q);
        System.out.printf("|%06.2f| %n",q);
        System.out.printf("|%04d| %n",w);
        System.out.printf("|%-4d| %n",w);
    }
}
