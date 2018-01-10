package Educatioin;


import Educatioin.Education_for_GIT.CObjectsInk;
import Educatioin.Education_for_GIT.CRandomString;

public class Main {



    public static void main(String[] args) {
        CObjectsInk test1 = new CObjectsInk();
        CObjectsInk test2 = new CObjectsInk();
        CObjectsInk test3 = new CObjectsInk();
        test3.getObjectsSumm();


CRandomString a = new CRandomString(10);
System.out.println(a.getStringResult());

CRandomString b = new CRandomString(10, "abc");
        System.out.println(b.getStringResult());
    }
}
