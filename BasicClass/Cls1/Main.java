package BasicClass.Cls1;

public class Main {
    public static void main(String[] args) {
        // 클래스 -> 객체(인스턴스) : 객체화(인스턴스화)
        // 객체 생성
        Character characterA = new Character();
        Character characterB = new Character("nameA", 1, true);

        // 기능 활용
        characterA.dance();
        characterB.dance();

        String target = characterA.hunt("사슴");
        System.out.println("target = " + target);

        int ret = characterB.sum(1,2);
        System.out.println("ret = " + ret);


        // 세터 활용
        characterA.setName("둘리");
        characterA.setAge(30);
        characterA.setIsAdult(true);
//      characterA.name = "볼드모트"; -> 사용못함 private String name;
        characterA.setName("볼드모트");


        // 게터 활용
        // characterA.getName();
        // -> 가져오기 실패! 값을 가져오려면 상자에 담아줘야함
        String box = characterA.getName();
        System.out.println("box = " + box); // -> 출력

        // 숙제 :
        // 1. 클래스 생성(속생기)
        // 2. 클래스의 속성 만들기
        // 3. Main 에서 객체화 X개 만들기
        // 4. JVM 메모리 영역 상상해보기
        // 5. 생성자 만들기 X 개 (생성자 3가지 특징)
        // 6. X 개의 생성자를 통해서 객체 만들어 보기
        // 7. JVM 메모리 영역 상상해보기
        // 8. 어울리는 기능 만들기(void, 반환데이터 존재하는 것 - return, 매개변수 활용)
        // 9. 세터 만들기
        // 10. 세터 활용 -> JVM 메모리 영역 상상해보기, 접근 제어 로직 넣어보기!
        // 11. 게터 만들기
        // 12. 게터 활용해보기
        // 13. 게터 활용해서 데이터 조회한것 출력해보기




    }
}
