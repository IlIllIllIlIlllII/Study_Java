package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        //변수 이름 짓는법
        //1. 저장할 값의 어울리는 이름
        //2. 밑줄(_), 문자(abc), 숫자(123), 사용가능 (공백 사용 불가)
        //3. 밑줄 또는 문자로 시작 가능
        //4. 한 단어 또는 2개 이상 단어의 연속
        //5. 소문자소 시작, 각 단어의 시작 글자는 대문자 (첫 단자는 제외)
        //6. 예약어는 사용 불가

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String dataOdBirth = "2001-12-31"; // 생년원일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOdVisit = "관광"; // 입국목적
        String flighNo = "KE657"; // 항공 편명
        String _flighNo = "KE657"; // 밑줄 시작
        String fligh_no_2 = "KE657";
        //String -flighNo = "KE657";

        int accompany = 2; // 동반 가족 수
        int lengthOfstay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
        //String 3item = "전자제품";

    }
}
