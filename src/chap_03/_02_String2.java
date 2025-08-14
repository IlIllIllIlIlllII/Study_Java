package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replaceAll(" and", ",")); // "and"를 ","로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작 (이전 내용 삭제)
    }
}
