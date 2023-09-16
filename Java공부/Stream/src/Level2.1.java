import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Collections;

// 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
// str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
// 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer> list= new ArrayList<>();
        StringTokenizer st= new StringTokenizer(s);
        while(st.hasMoreTokens()){
            Integer TokenToInt=Integer.valueOf(st.nextToken());
            list.add(TokenToInt);
        }
        
        String MinAndMax[]=new String[2];
        MinAndMax[0]=String.valueOf(Collections.min(list));
        MinAndMax[1]=String.valueOf(Collections.max(list));
        
        answer+=MinAndMax[0];
        answer+=" ";
        answer+=MinAndMax[1];
        
        return answer;
    }
}