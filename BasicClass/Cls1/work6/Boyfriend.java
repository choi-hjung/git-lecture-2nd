package BasicClass.Cls1.work6;

public class Boyfriend {
    // 1. 속성
    private String name;
    private int age;
    private int date;

    // 2. 생성자
    public Boyfriend(String name, int age, int date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    // 3. 기능
    public void cute() {
        String name = this.name;
        System.out.println(name + "은 귀엽다");
    }
    public String dating(String place) {
        return place;
    }
    public void doWith(String hobby, int time) {
        System.out.println("우리는 매일 " + time + "시간에 " + hobby + "을 즐겨요!");
    }

    // 세터
    public void setAge(int age) {
        if (age <= 18) {
            System.out.println("미성년자는 안됩니다.");
        } else {
            this.age = age;
        }
    }
    public void setDate(int date) {
        this.date = date;
    }

    // 게터
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getDate() {
        return this.date;
    }

}
