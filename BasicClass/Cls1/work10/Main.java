package BasicClass.Cls1.work10;

public class Main {
    public static void main(String[] args) {
        // 객체
        Favorite favoriteA = new Favorite("데이트", 1, true);
        Favorite favoriteB = new Favorite("크로스핏", 6, true);

        // 기능 활용
        favoriteA.like();
        favoriteB.like();

        String place = favoriteA.doIt("세종호수공원");
        System.out.println(place + "에서 놀자아~");

        favoriteA.travel("울산", 3);

        // 세터 활용
        favoriteA.setTimes(2);

        // 게터 활용
        String printName = favoriteA.getName();
        int printTimes = favoriteA.getTimes();
        boolean printGood = favoriteA.getGood();
        System.out.print(printName + "를 ");
        System.out.print("주에 " + printTimes + "회 합니다.");
        System.out.println("재미있나요?" + printGood);
    }
}
