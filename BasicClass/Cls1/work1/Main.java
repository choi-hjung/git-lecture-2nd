package BasicClass.Cls1.work1;

public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Crossfit crossfitA = new Crossfit("weightlifting", 55, true);
        Crossfit crossfitB = new Crossfit("gymnastic", 0, true);

        // 기능 활용
        crossfitA.hard();
        String name = crossfitA.snatch("스내치");
        System.out.println(name);
        int pr = crossfitA.pr(55, 10);

        crossfitB.hard();
        name = crossfitB.toesTobar("토투바");
        System.out.println(name);

        // 세터 활용
        crossfitA.setType("짐내스틱");
        crossfitA.setType("헬스");

        // 게터 활용
        String get = crossfitA.getType();
        System.out.println("crossfitA의 setType = " + get);
    }
}
