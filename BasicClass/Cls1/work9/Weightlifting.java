package BasicClass.Cls1.work9;

public class Weightlifting {
    // 속성
    private String name;
    private int weight;
    private boolean isClear;

    // 생성자
    public Weightlifting (String name, int weight, boolean isClear) {
        this.name = name;
        this.weight = weight;
        this.isClear = isClear;
    }

    // 기능
    public void doIt() {
        String name = this.name;
        System.out.println(name + " 동작을 수행합니다.");
    }
    public int reps(int num) {
        return num;
    }
    public int pr(int a, int b) {
        int result = a + b;
        return result;
    }

    // 세터
    public void setName(String name){
        if (name.equals("토투바")) {
            System.out.println("역도 동작이 아닙니다.");
        } else {
            this.name = name;
        }
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setClear(boolean isClear) {
        this.isClear = isClear;
    }

    // 게터
    String getName() {
        return this.name;
    }
    int getWeight() {
        return this.weight;
    }
    boolean getClear() {
        return this.isClear;
    }


}
