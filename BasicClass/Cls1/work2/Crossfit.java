package BasicClass.Cls1.work2;

public class Crossfit {
    // 1. 속성
    private String name;
    private int num;
    private boolean isClear;

    // 2. 생성자
    // 2-1 클래스명과 같다
    // 2-2 반환 데이터 타입 없음
    // 2-3 중복생성가능
    public Crossfit(String name, int num, boolean isClear) {
        this.name = name;
        this.num = num;
        this.isClear = isClear;
    }

    // 3. 기능
    // 반환자료형 기능이름() { 작업내용 }
    public void work() {
        String name = this.name;
        System.out.println(name + "동작을 수행합니다.");
    }
    public int pr(int max) {
        return max;
    }
    public void wod(String wodType) {
        if (wodType.equals("amrap")) {
            System.out.println("🔥 AMRAP (As Many Rounds As Possible):\n정해진 시간 동안 가능한 한 많은 라운드를 반복하는 방식입니다.");
        } else if (wodType.equals("emom")) {
            System.out.println("⏱️ EMOM (Every Minute On the Minute):\n매 1분마다 정해진 동작을 수행하고, 남은 시간은 휴식하는 방식입니다.");
        } else if (wodType.equals("for time")) {
            System.out.println("⚡ For Time:\n정해진 운동을 최대한 빠르게 완료하는 방식입니다. 시간과의 싸움!");
        } else {
            System.out.println("❓ '" + wodType + "' 는 알 수 없는 WOD 타입입니다.");
        }
    }

    // 세터 만들기
    private String workName;
    private int reps;

    public void setName(String workName) {
        this.workName = workName;
    }
    public void setReps(int reps) {
        this.reps = reps;
    }
    public void workToday() {
        if (workName == null || reps <= 0) {
            System.out.println("운동 이름 또는 반복 횟수가 올바르지 않습니다.");
        } else {
            System.out.println("오늘의 운동 : " + workName + " - " + reps + "회");
        }
    }

    // 게터 만들기
    public boolean getIsClear() {
        return this.isClear;
    }

    public int getNum() {
        return num;
    }
}
