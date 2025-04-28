package BasicClass.Cls1.work7;

public class Bigbang {
    // 속성
    private String name;
    private String part;
    private int birth;

    // 생성자
    public Bigbang (String name, String part, int birth) {
        this.name = name;
        this.part = part;
        this.birth = birth;
    }

    // 기능
    public void sing() {
        System.out.println("노래를 부릅니다.");
    }
    public int year(int num) {
        return num;
    }
    public void stage(String place, String song) {
        String name = this.name;
        System.out.println(name + "이 " + place + "에서 " + song + " 무대를 합니다.");
    }

    // 세터
    public void setName(String name) {
        if (name.equals("탑")){
            System.out.println("탈퇴한 멤버입니다.");
        } else if (name.equals("승리")) {
            System.out.println("범죄자 입니다.");
        } else {
            this.name = name;
        }
    }
    public void setPart(String part) {
        this.part = part;
    }
    public void setBirth(int birth) {
        this.birth = birth;
    }
    // 게터
    public String getName() {
        return this.name;
    }
    public String getPart() {
        return this.part;
    }
    public int getBirth() {
        return this.birth;
    }
}
