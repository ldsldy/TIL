import java.util.Arrays;
import java.util.stream.IntStream;

public class Array_Copy_Equal {

    static public String[] ArrayCase(String[] str_list) {
        String[] answer = {};
        
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")){
                answer=Arrays.copyOfRange(str_list,0,i);
                break;
            }
            else if(str_list[i].equals("r")){
                answer=Arrays.copyOfRange(str_list,i+1,str_list.length);
                break;
            }
        }
        return answer;
    }

    // 프로그래머스 카피
    static String[] StreamCase(String[] str_list) {
        return IntStream.range(0, str_list.length)
                .boxed()
                .filter(i -> str_list[i].equals("l") || str_list[i].equals("r"))
                .findFirst()
                .map(i -> {
                    if (str_list[i].equals("l")) {
                        return Arrays.copyOfRange(str_list, 0, i);
                    }
                    return Arrays.copyOfRange(str_list, i + 1, str_list.length);
                })
                .orElseGet(() -> new String[]{});
    }

    public static void main(String[] args) throws Exception {
        String[] str_list={"u","u","l","r"};

        System.out.println(ArrayCase(str_list));
        System.out.println(StreamCase(str_list));
    }
}
