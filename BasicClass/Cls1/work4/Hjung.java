package BasicClass.Cls1.work4;

public class Hjung {
    // 1. 속성
    private String name;
    private int age;
    private boolean isSmart;

    // 2. 생성자
    public Hjung(String name, int age, boolean isSmart) {
        this.name = name;
        this.age = age;
        this.isSmart = isSmart;
    }

    // 3. 기능
    public void hobby() {
        String name = this.name;
        System.out.println(name + "의 취미는 크로스핏입니다.");
    }
    public String boyFriend(String boyName) {
        return boyName;
    }
    public int older(int a, int b) {
        return a + b;
    }

    // 세터
    public void setAge(int age) {
        if (age < 30) {
            System.out.println("현재 나이보다 적습니다.");
        } else {
            this.age = age;
        }
    }

    // 게터
    public int getAge() {
        return this.age;
    }
    public boolean getIsSmart() {
        return this.isSmart;
    }
}
