package BasicClass.Cls1.work2;

public class Main {
    public static void main(String[] args) {
        // 객체 만들기
        Crossfit weightlifting = new Crossfit("스내치", 55, true);
        Crossfit gymnastic = new Crossfit("토투바", 10, true);

        // 기능 활용
        weightlifting.work();
        gymnastic.work();

        int max = weightlifting.pr(75);
        System.out.println("1rm " + max + "파운드 성공");

        weightlifting.wod("amrap");
        gymnastic.wod("emom");

        // 세터 활용
        weightlifting.setName("스쿼트 클린");
        weightlifting.setReps(15);
        weightlifting.workToday();
        gymnastic.setName("머슬업");
        gymnastic.setReps(5);
        gymnastic.workToday();

        // 게터 활용
        boolean clear = weightlifting.getIsClear();
        System.out.println("clear = " + clear);
        int num = gymnastic.getNum();
        System.out.println("num = " + num);
    }
}
