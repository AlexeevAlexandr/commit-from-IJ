import java.util.ArrayList;

public class dividing_string {
    public static void main(String[] args) {
        String s = "Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug  ";
        s = s.replace(","," ");//replace elements
        s = s.replace("?"," ");
        s = s.replace("!"," ");
        s = s.replace("@"," ");
        s = s.replace("."," ");
        s = s.replace("_"," ");
        s = s.replace("'"," ");
        String[] words = s.split("\\s");    //replace space to null
        ArrayList<String> sb = new ArrayList<>(); //insert words is they not null
        for (String word : words) {
            if (!word.equals("")) {
                sb.add(word);
            }
        }
        System.out.println(sb.size());            //print considered quantity of words in array
        for (String output : s.split(" ")) {//print words from array
            if(!output.equals("")){
                System.out.println(output);
            }
        }
    }
}

