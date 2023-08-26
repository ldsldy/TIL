import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class What_is_good_code {
        static String[] my_solution(String[] picture, int k) {      //3중 for문으로 알아보기 힘들다
        String[] answer = new String[picture.length*k];
        int index=0;
        for(int i=0;i<picture.length;i++){
            String[] st=picture[i].split("");
            StringBuilder sb=new StringBuilder();
            
            for(int j=0;j<st.length;j++){
                for(int q=0;q<k;q++){
                    sb.append(st[j]);
                }
            }
            for(int q=0;q<k;q++)
                answer[index++]=sb.toString();
        }
        
        return answer;
    }

    static String[] other_solution(String[] picture, int k) {   //2중 for문으로 해결하였다. => .과 x의 스트링버퍼를 따로 만들어 k만큼 늘린 문자열을 원래 문자열 자리에 대체시키는 아이디어 
        String x = "";
        String y = "";          
        for (int i=0; i<k;i++) {
            x += ".";
            y += "x";
        }
        List<String> list = new ArrayList<>();
        for (int i=0; i<picture.length;i++) {
            for (int j=0;j<k;j++){              
                list.add(picture[i].replaceAll("[.]", x).replaceAll("[x]", y));
            }
        }
        return list.stream().toArray(String[]::new);
    }
    public static void main(String[] args) throws Exception {
        String[] picture={".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        int k=2;

        System.out.println(my_solution(picture, k));        
        System.out.println(other_solution(picture, k));


    }
}
