package ch08;

public class Test {
    static void testArea(Shape s){
        //TDD 스타일로 개발 예시


        // 1. 기능 : 너비 구하기 테스트
        int expectedResult = 100;        // 예상 결과
        double actualResult = s.calculateArea();        // 실제 결과
        if (actualResult == expectedResult) {
            System.out.println("1. 너비 구하기 테스트 성공(success)");
        } else {
            System.out.println("2. 너비 구하기 테스트 오류(fail)");

        }
        }

        // 2. 기능 : 둘레 구하기 테스트
       static void testPerimeter(Shape s){
        // 2 기능 : 두레 구하기 테스트
           int expectedResult = 40;        // 예상 결과
           double actualResult = s.calculatePerimeter();        // 실제 결과
           if (actualResult == expectedResult) {
               System.out.println("1. 둘레 구하기 테스트 성공(success)");
           } else {
               System.out.println("2. 둘레 구하기 테스트 오류(fail)");

    }


}
public static void main(String[] args) {
        Shape s = new Square(10.0);
        testArea(s);
        testPerimeter(s);
}

}

