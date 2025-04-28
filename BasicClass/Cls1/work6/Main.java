package BasicClass.Cls1.work6;

public class Main {
    public static void main(String[] args) {
        // 객체
        Boyfriend boyfriend = new Boyfriend("김진명", 30, 23);

        // 기능 활용
        boyfriend.cute();

        String place = boyfriend.dating("홍대");
        System.out.println("데이트 장소는 " + place);

        boyfriend.doWith("크로스핏", 930);

        // 세터 활용
        boyfriend.setAge(18);
        boyfriend.setDate(100);

        // 게터 활용 + 출력
        String printName = boyfriend.getName();
        System.out.println("이름은 " + printName + "입니다.");
        int printAge = boyfriend.getAge();
        System.out.println("나이는 " + printAge + "살 입니다.");
        int printDate = boyfriend.getDate();
        System.out.println("우리는 " +printDate + "일 입니다.");
    }
}
