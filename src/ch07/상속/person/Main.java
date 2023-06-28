package ch07.상속.person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("남소나",33);
        p.introduce();
        System.out.println();
        Sutdent s = new Sutdent("남소나",33,"000001");
        s.introduce();

        // 업 캐스팅
        // Student 객체를 Person 타입으로 변환( 부모타입으로변환) 자식을 부모 타입 에 대입
        // 자식 객체를 부모 객체에 대입
        Person p2 = s;
        // 부모 객체의 자식 객체에서 재정의된 메서드 호출
        // 자식 객체의 메서드가 호출
        p2.introduce(); //Student 의 introduce가 호출되있음
        // 자식 객체의 추가한 메서드/필드는 접근불가
//        p2.study()      // 호출 불가

        Person p3 = new Lecturer("남소나",31,11);


        //부모 객체를 자식 객체에 대입,
        // 명시적 형변환으로
        // 그냥 형변환 하면 에러발생 가능성이 존재함.
        // 부모객체변수 instanceof() 자식클래스타입
        // Student -> Person, Person, Lecturer -> Person
        if (p2 instanceof Sutdent) {
            Sutdent s2 = (Sutdent) p2;
            s2.study();
        }


}}
