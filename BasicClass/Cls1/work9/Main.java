package BasicClass.Cls1.work9;

public class Main {
    public static void main(String[] args) {
        // 객체
        Weightlifting liftingA = new Weightlifting("스내치", 65, true);
        Weightlifting liftingB = new Weightlifting("클린", 105, false);

        // 기능 활용
        liftingA.doIt();
        liftingB.doIt();

        int num = liftingA.reps(10);
        System.out.println(num + "회 수행합니다.");

        int result = liftingB.pr(95, 10);
        System.out.println("1rm 무게는 " + result + "입니다.");

        // 세터
        liftingA.setName("토투바");
        liftingB.setWeight(95);
        liftingB.setClear(true);

        // 게터 + 출력
        String printName = liftingB.getName();
        int printWeight = liftingB.getWeight();
        boolean printClear = liftingB.getClear();
        System.out.print(printName + " 동작을 ");
        System.out.print(printWeight + "무게로 ");
        System.out.println("성공했습니까? " + printClear);
    }
}
