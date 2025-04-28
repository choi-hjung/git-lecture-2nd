package BasicClass.Cls1.work7;

public class Main {
    public static void main(String[] args) {
        // 객체
        Bigbang gd = new Bigbang("지드래곤", "래퍼", 880818);
        Bigbang sun = new Bigbang("태양", "메인보컬", 880518);
        Bigbang dLight = new Bigbang("대성", "보컬", 890426);

        // 기능 활용
        sun.sing();
        dLight.sing();

        int num = gd.year(29);
        System.out.println(num + "년차 활동 중입니다.");

        gd.stage("홍대", "크레용");
        dLight.stage("인천", "컴백");

        // 세터 활용
        gd.setName("지디");
        gd.setPart("보컬");
        sun.setPart("댄서");
        dLight.setBirth(1994);

        // 게터 활용 + 출력
        String printName = gd.getName();
        String printPart = gd.getPart();
        int printBirth = gd.getBirth();
        System.out.println(printName + " " + printPart + " " + printBirth);

    }
}
