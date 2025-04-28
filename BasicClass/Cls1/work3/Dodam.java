package BasicClass.Cls1.work3;

public class Dodam {
    // 1. 속성
    private String type;
    private int age;
    private boolean isBark;

    // 2. 생성자
    // 클래스명 같다 + 반환 데이터타입 없다 + 중복 생성 가능
    public Dodam(String type, int age, boolean isBark) {
        this.type = type;
        this.age = age;
        this.isBark = isBark;
    }

    // 3. 기능
    public void look() {
        String type = this.type;
        System.out.println(type + " 도담이는 사랑스러워");
    }
    public String walk(String where) {
        return where + "에서 산책합니다.";
    }
    public String coward(String action) {
        return "도담이가 겁먹으면 " + action;
    }

    // 세터 만들기
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("나이는 0살 이상이어야 합니다.");
        }
    }
//    public void printAge() {
//        System.out.println("도담이는 " + age + "살 입니다.");
//    }

    // 게터 만들기
    public int getAge() {
        return this.age;
    }

    public boolean getBark() {
        return this.isBark;
    }

}
