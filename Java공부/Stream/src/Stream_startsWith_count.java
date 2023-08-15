import java.util.stream.IntStream;

public class Stream_startsWith_count {

    static int StreamCase(String myString, String pat) {
        int answer=(int)IntStream.range(0,myString.length())
                        .filter(i->myString.substring(i).startsWith(pat)).count();
        return answer;
    }

    // 프로그래머스 카피
    static int ArrayCase(String myString, String pat) {
        int answer=0;
        for(int i=0;i<myString.length()-pat.length()+1;i++){
            String it_pat=myString.substring(i,i+pat.length());
            if(it_pat.equals(pat))
                answer++;
        }
        return answer;
    }
    public static void main(String[] args) throws Exception {
        String myString="banana";        
        String pat="ana";

        System.out.println(ArrayCase(myString, pat));
        System.out.println(StreamCase(myString, pat));
    }
}
