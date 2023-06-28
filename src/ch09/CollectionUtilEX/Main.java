package ch09.CollectionUtilEX;

import account.Account;
import ch06.list.list_Class_pratice.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("apple");
        strList.add("banana");
        strList.add("apple");
        strList.add("cherry");
        strList.add("durian");
        strList.add("melon");

        String target = "apple";   // 몇개가 있는지 찾을 특정 요소

        CollectionUtil<String> util = new CollectionUtil<>();
        int occurrenceCount = util.CollectionUtil(strList, target);

        System.out.println("Number of occurrences of " + target + ": " + occurrenceCount);
        Cache<Student> c = new Cache<>();
       // c.setData(new Student("남소나"));
        Student s = c.getData();

        Cache<Account> a = new Cache<>();
        a.setData(new Account("000001",10));
        Account acc = a.getData();

    }
}
