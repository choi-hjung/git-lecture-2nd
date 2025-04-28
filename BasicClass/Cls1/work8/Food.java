package BasicClass.Cls1.work8;

public class Food {
    // 속성
    private String name;
    private int cost;
    private boolean isCold;

    // 생성자
    public Food(String name, int cost, boolean isCold) {
        this.name = name;
        this.cost = cost;
        this.isCold = isCold;
    }

    // 기능
    public void eat() {
        this.name = name;
        System.out.println(name + "을 먹습니다.");
    }
    public String drink(String type) {
        return type;
    }
    public int total(int a, int b) {
        return a + b;
    }

    // 세터
    public void setName(String name) {
        if (name.equals("소주")) {
            System.out.println("소주는 음식이 아닙니다.");
        } else {
            this.name = name;
        }
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setIsCold(boolean isCold) {
        this.isCold = isCold;
    }

    // 게터
    String getName() {
        return this.name;
    }

    int getCost() {
        return this.cost;
    }

    boolean getIsCold() {
        return this.isCold;
    }


}
