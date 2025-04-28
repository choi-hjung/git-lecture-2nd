package BasicClass.Cls1.work3;

public class Main {
    public static void main(String[] args) {
        // 객체만들기
        Dodam dodam = new Dodam("황구", 9, false);

        // 기능 활용
        dodam.look();

        String where = dodam.walk("철도길");
        System.out.println("도담이는 " + where);

        String action = dodam.coward("난리칩니다.");
        System.out.println(action);

        // 세터 활용
        dodam.setAge(10);
//        dodam.printAge();

        // 게터 활용 + 출력
        int print = dodam.getAge();
        System.out.println("도담이는 " + print + "살 입니다.");
        boolean bark = dodam.getBark();
        System.out.println("도담이는 짖어요 = " + bark);
    }
}
