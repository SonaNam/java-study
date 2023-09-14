package gptExample;

public class User {

   private String name;  // getter와 setter는 private로 선언된 필드에 접근하기 위해서 사용됨
   private int age;
   private String address;

    //문제 1번 사용자 정보(User)를 저장하는 클래스를 작성하세요. 사용자의 이름, 나이, 이메일 주소를 저장
    public User(String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //3. 사용자 정보 클래스(User)에 메서드를 추가하여 이름, 나이, 이메일 주소를 출력하는 기능을 구현하세요.
    public void UserInfoPrint(){
        System.out.println("이름: " + name + "\n" + "나이: " + age + "\n" +"이메일주소: " + address);
    }


    // 4.사용자 정보 클래스(User)에 게터(getter)와 세터(setter) 메서드를 추가하세요.
    //Getter는 객체의 필드 값을 반환하는 메서드로, 필드 값을 외부에서 읽을 수 있도록
    //Setter는 객체의 필드 값을 설정하는 메서드로, 필드 값을 외부에서 변경할 수 있도록
    public String getter(){  //<-- 실행할 수 있게 불리는 것  매개변수
        return name; //실행한 곳에서 반환을 받아서 볼 수 있는 것 = return
    }
    public void setName(String name){ //setter메소드는 = User메인(외부)에서 실행문 안의 값을 바꾸게 하기 위한 메소드
        this.name = name;      // <--- 실행문 변경
    }


   // 5.사용자 정보 클래스(User)에 나이를 증가시키는 메서드를 추가하세요
    public void ageUp(){  //<- 값을 넣어서 계산하는 게 아닌 원래 있던 정보를 사용하는 것이니까 ()안에 매개변수 넣지않는다.
        age ++;
    }

    // 6.사용자 정보 클래스(User)에 이메일 주소를 변경하는 메서드를 추가하세요.
    public void chanAddres(String ch_address){
        this.address = ch_address;
    }


}
