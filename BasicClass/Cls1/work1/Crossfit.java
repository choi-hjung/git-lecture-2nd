package BasicClass.Cls1.work1;

public class Crossfit {
    // 1. 속성
    private String type;
    private int weight;
    private boolean isClear;

    // 2. 생성자
    public Crossfit (String type, int weight, boolean isClear) {
        this.type = type;
        this.weight = weight;
        this.isClear = isClear;
    }

    // 3. 기능
    public void hard() {
        String type = this.type;
        System.out.println(type + "이 힘듭니다.");
    }
    public String snatch(String name) {
        return name + "를 동작합니다.";
    }
    public String toesTobar(String name) {
        return name + "를 동작합니다.";
    }
    public int pr(int a, int b) {
        int result = a + b;
        System.out.println("1rm 측정 무게 : " + result);
        return result;
    }

    // 세터 만들기
    public void setType(String type) {
        if (type.equals("헬스")) {
            System.out.println("크로스핏이 아닙니다.");
        } else {
            this.type = type;
        }
    }

    // 게터 만들기
    public String getType() {
        return this.type;
    }
}
