package BasicClass.Cls1.work4;

public class Main {
    public static void main(String[] args) {
        // 객체
        Hjung hjung = new Hjung("최희정", 30, false);

        // 기능활용
        hjung.hobby();

        String boyName = hjung.boyFriend("김진명");
        System.out.println(boyName + "은 남자친구 입니다.");

        int plusAge = hjung.older(30, 1);
        System.out.println("내년에는 " + plusAge + "살 입니다.");

        // 세터활용
        hjung.setAge(20);

        // 게터활용 + 출력
        int printAge = hjung.getAge();
        System.out.println("나이는 " + printAge + "살");
        boolean printSmart = hjung.getIsSmart();
        System.out.println("최희정은 똑똑하다? " + printSmart);
    }
}
