package BasicClass.Cls1.work10;

public class Favorite {
    // 속성
    private String name;
    private int times;
    private boolean isGood;

    // 생성자
    public Favorite(String name, int times, boolean isGood) {
        this.name = name;
        this.times = times;
        this.isGood = isGood;
    }

    // 기능
    public void like() {
        String name = this.name;
        System.out.println(name + " 하는 것을 좋아합니다.");
    }
    public String doIt(String place) {
        return place;
    }
    public void travel(String where, int days) {
        System.out.println(where + "여행을 " + days + "일 떠나요~");
    }

    // 세터
    public void setName(String name) {
        this.name = name;
    }
    public void setTimes(int times) {
        this.times = times;
    }
    public void setGood(boolean isGood) {
        this.isGood = isGood;
    }

    // 게터
    String getName() {
        return this.name;
    }
    int getTimes() {
        return this.times;
    }
    boolean getGood() {
        return this.isGood;
    }
}
