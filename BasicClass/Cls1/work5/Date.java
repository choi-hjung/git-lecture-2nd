package BasicClass.Cls1.work5;

public class Date {
    // 1. 속성
    private String type;
    private int cost;
    private boolean satisfying;

    // 2. 생성자
    public Date(String type, int cost, boolean satisfying) {
        this.type = type;
        this.cost = cost;
        this.satisfying = satisfying;
    }

    // 3. 기능
    public void dating() {
        String type = this.type;
        System.out.println(type + " 데이트를 합니다.");
    }
    public String eat(String food) {
        return food;
    }
    public void goActivity(String activity) {
        System.out.println("재밌게 " + activity + " 즐기러 가자!");
    }
    public void waiting(int time) {
        System.out.println("예상 웨이팅 : " + time + "분");
    }
    public void goOnDate(String place, String activity, int cost) {
        System.out.print(place + "에서 ");
        System.out.print(activity + "하고 놀자! ");
        System.out.println("데이트 비용은 " + cost + "원");
    }

    // 세터
    public void setType(String type) {
        if (type.equals("지옥")) {
            System.out.println("여기에서 데이트를 할 수 없습니다.");
        } else {
            this.type = type;
        }
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setSatisfying(boolean satisfying) {
        this.satisfying = satisfying;
    }

    // 게터
    public String getType() {
        return this.type;
    }
    public int getCost() {
        return this.cost;
    }
    public boolean getSatistying() {
        return this.satisfying;
    }
}
