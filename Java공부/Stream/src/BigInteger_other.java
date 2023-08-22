import java.math.BigInteger;


public class BigInteger_other {
        static String my_solution(String a, String b) {
        String answer="";
        if(a.length()>18||b.length()>18){
            BigInteger A=new BigInteger(a);
            BigInteger B=new BigInteger(b);
            BigInteger answer_int=A.add(B);
            answer=answer_int.toString();
        }
        else if(a.length()>9||b.length()>9){
            long answer_int=Long.parseLong(a)+Long.parseLong(b);
            answer=Long.toString(answer_int);
        }
        else{
            int answer_int=Integer.parseInt(a)+Integer.parseInt(b);
            answer=Integer.toString(answer_int);
        }
        return answer;
    }
    
    static String other_solution(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) throws Exception {
        String a="18446744073709551615";
        String b="287346502836570928366";

        System.out.println(my_solution(a,b));        
        System.out.println(other_solution(a,b));


    }
}
