package BasicClass.Cls1;

public class Character {
    // 속성 = 변수로 표현할 수 있다.
    // 이름 : "Steve", "John"
    // int : 정수(숫자)
    // String : 문자열
    // boolean : 논리(true, false)
    private String name;
    private int age;
    private boolean isAdult;

    // 생성자 - 조립설명서
    // 1. 클래스 이름과 동일. (기능과 비슷해서 외우기!)
    // 2. 반환 데이터 타입이 존재하지 않는다! 제일 중요!
    // 3. 여러개 생성할 수 있다. (중복 존재 가능)
    // 기본생성자
    public Character() {}

    public Character(String name, int age, boolean isAdult) {
        this.name = name;
        this.age = age;
        this.isAdult = isAdult;
    }

    // 기능 - method
//  반환자료형 기능이름() {
//      작업내용
//  }
//  public은 생략가능
    public void dance() {
        String name = this.name;
        System.out.println(name + "이 춤을 춥니다.");
    }

    // 사냥
    public String hunt(String target) {
        return target + "을 사냥합니다";
    }

    public int sum(int a, int b) {
        int result = a + b;
        System.out.println("result = " + result);
        return result; // -> 이 기능을 사용한 곳에 알려야함.
    }

    // 세터(setter) 활용 -객체의 속성을 설정하는 것
    // 세터는 public 이여서 접근이 되는 것.
    public void setName(String name) {
        // 왜 세터를 쓰느냐? 세터를 통해서 접근을 하기 때문에
        // 접근제어로직을 넣어줄 수 있다.
        // 제어 로직을 추가할 수 있다.
        if(name.equals("볼드모트")) {
            System.out.println("설정 불가");
        } else {
            this.name = name;
        }

    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIsAdult(boolean isAdult) {
        this.isAdult = isAdult;
    }

    // 게터(getter) - 속성 정보를 조회하는 기능
    // 이름 조회하는 기능
    // private 는 안됨. public 사용 :: 외부에서 사용해야 하기 때문
    // private 를 사용하면 외부에서 정보를 모름.
    // (매개변수) 는 필요 없음.
     public String getName() {
        return this.name;
        // return 은 정보를 반환 할때 씀. -> 게터에 필수
    }
}
