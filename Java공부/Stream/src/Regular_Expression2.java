import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


public class Regular_Expression2 {
    static String[] List_Case(String myStr) {
        String[] words = myStr.split("[abc]");
        List<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.length() > 0) {
                list.add(word);
            }
        }
        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        return list.toArray(new String[list.size()]);
    }

    static String[] Stream_Case(String myStr) {
        String[] arr = Arrays.stream(myStr.split("[abc]+")).filter(str -> !str.isEmpty()).toArray(String            []::new);
        return arr.length == 0 ? new String[] { "EMPTY" } : arr;
    }

    public static void main(String[] args) throws Exception {
        String myStr="baconlettucetomato";

        System.out.println(List_Case(myStr));        
        System.out.println(Stream_Case(myStr));


    }
}
