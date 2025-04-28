package BasicClass.Cls1.work5;

public class Main {
    public static void main(String[] args) {
        // 객체
        Date dateA = new Date("방탈출", 50000, true);
        Date dateB = new Date("자전거타기", 15000, true);

        // 기능 활용
        dateA.dating();
        dateB.dating();

        String food = dateA.eat("떡볶이");
        System.out.println(food + "를 먹습니다.");
        food = dateB.eat("도시락");
        System.out.println(food + "을 먹습니다.");

        dateA.goActivity("공포테마");
        dateB.waiting(30);

        dateA.goOnDate("홍대", "실내캠핑장", 45000);
        dateB.goOnDate("대부도 카페", "야경 구경", 30000);

        // 세터 활용
        dateA.setType("지옥");
        dateB.setCost(50000);
        dateB.setSatisfying(false);

        // 게터 활용 + 출력
        String printType = dateA.getType();
        System.out.println("A 데이트는 " + printType);
        int printCost = dateB.getCost();
        System.out.println("B 데이트 비용은 " + printCost);
        boolean printSatis = dateB.getSatistying();
        System.out.println("B데이트 만족! " + printSatis);


    }
}
