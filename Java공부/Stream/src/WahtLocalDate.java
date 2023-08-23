import java.time.LocalDate;


public class WahtLocalDate {
        static int solution(int[] date1, int[] date2) {

            LocalDate dateA = LocalDate.of(date1[0], date1[1], date1[2]);
            LocalDate dateB = LocalDate.of(date2[0], date2[1], date2[2]);
    
            if (dateA.isBefore(dateB)) {
                return 1;
            } 
            else {
                return 0;
            }
        }

    public static void main(String[] args) throws Exception {
        int[] date1={2021, 12, 28};
        int[] date2={2021, 12, 29};

        System.out.println(solution(date1, date2));

    }
}


// 자바 LocalDate는 날짜만 저장하는 클래스입니다. 시간은 저장하지 않습니다.
// of(int year, int month, int dayOfMonth): 지정된 연도, 월, 일로 LocalDate를 생성합니다.
// now(): 현재 날짜로 LocalDate를 생성합니다.
// atStartOfDay(): LocalDate의 시작 시각으로 LocalTime을 생성합니다.
// atTime(int hour, int minute, int second): 지정된 시각으로 LocalTime을 생성합니다.
// plusDays(int days): 지정된 일수만큼 날짜를 더합니다.
// minusDays(int days): 지정된 일수만큼 날짜를 뺍니다.
// isBefore(LocalDate other): 지정된 날짜보다 빠른지 여부를 확인합니다.
// isAfter(LocalDate other): 지정된 날짜보다 느린지 여부를 확인합니다.
// isEqual(LocalDate other): 지정된 날짜와 같은지 여부를 확인합니다.