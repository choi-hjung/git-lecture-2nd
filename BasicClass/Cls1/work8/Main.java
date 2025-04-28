package BasicClass.Cls1.work8;

public class Main {
    public static void main(String[] args) {
        // 객체
        Food FoodA = new Food("돌짜장", 25000, false);
        Food FoodB = new Food("브런치", 20000, true);

        // 기능 활용
        FoodA.eat();
        FoodB.eat();

        String type = FoodB.drink("망고아이스티");
        System.out.println(type + "를 마십니다.");

        int result = FoodB.total(20000, 5000);
        System.out.println("FoodB의 총 합계는 " + result + "원 입니다.");

        // 세터 활용
        FoodB.setName("소주");
        FoodA.setName("닭강정");
        FoodA.setCost(8000);
        FoodA.setIsCold(true);

        // 게터 활용
        String printName = FoodA.getName();
        int printCost = FoodA.getCost();
        boolean printIsCold = FoodA.getIsCold();
        System.out.println(printName + "의 가격은 " + printCost + "원 입니다.");
        System.out.println(printName + "은 차가운 음식인가요? " + printIsCold);

    }
}
