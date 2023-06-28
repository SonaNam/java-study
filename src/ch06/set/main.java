package ch06.set;

import com.myuniversity.student.Student;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student("남소나");
        Student s2 = new Student("남소나");
        Student s3 = s1;

        //set은 중복이 없다
        //hashcode 같은참조면 같은 값
        System.out.println("s1"+ s1.hashCode());
        System.out.println("s2"+ s2.hashCode());
        System.out.println("s3"+ s3.hashCode());


        //equals, 기본적으로 같은 참조면 true이나, 바꿀 수 있다.
        System.out.println( s1.equals(s3));


        // 객체 추가 add
        Set<String> sets = new HashSet<>();
        sets.add("apple");
        sets.add("banana");
        sets.add("cherry");
        sets.add("durian");
        sets.add("elderberry");

        // 객체 탐색/조회
        for(String s : sets) {
            System.out.println(s);
        }
        //contains
        // 해당 값이 있냐 없냐
        System.out.println(sets.contains("cherry"));


        // 삭제
        sets.remove("cherry");

        List<String> lst = new ArrayList<>();
        sets.add("apple");
        sets.add("banana");
        sets.add("cherry");
        sets.add("durian");
        sets.add("elderberry");
        sets.add("durian");

//        for (String s : lst ){
//            System.out.println(s);
//        }

        System.out.println("====================");

//컬렉션(리스트) -> set으로 초기화 생성
        //중복제거, treeSet으로하면 중복제거에 정렬까지
        for (String s : new TreeSet<>(lst)) {
            System.out.println(s);
        }//컬렉션(리스트) -> set으로 초기화 생성
        //중복제거, treeSet으로하면 중복제거에 정렬까지


    }
}
