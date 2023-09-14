package gptExample;

public class UserMain {
    public static void main(String[] args) {

    //2.문제 사용자 정보 클래스(User)를 작성한 후, 객체를 생성하고 이름, 나이, 이메일 주소를 설정하세요.
    User user = new User("john",26,"awef33@naver.com");

    //메서드를 사용하려면 위에 생성한 user객체를 통하여 호출하여야 됨
    user.UserInfoPrint();


    System.out.println("--------------setter로 바뀌는 user name 출력--------------");

    //setter 사용으로 사용자 이름 바꾸기
    user.setName("이름이 바꼈습니다");
    user.UserInfoPrint();


    System.out.println("--------------------나이증가 메소드 활용--------------------------");
    //나이 증가하는 메서드 활용
        user.ageUp();
        user.UserInfoPrint();

        System.out.println("------------------------------------------------------------");
       
        
    }
}
