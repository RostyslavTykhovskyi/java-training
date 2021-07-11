package Exceptions;

import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedUnchacked {
    public static void main(String[] args) {
//        f5();
        f7();
    }

//    public static void f1() {
//        throw new Exception(); // тут ошибка компиляции
//    }

//    public static void f2() throws IOException {
//        throw new Exception(); // тут ошибка компиляции
//    }

    public static void f3() throws Exception {
        throw new Exception(); // и кидаем Exception
    }

    public static void f4() throws Throwable {
        throw new Exception(); // а кидаем только Exception
    }

    public static void f5() throws Exception {

    }

    public static void f6() throws Throwable {
        f5();
    }

    public static void f7() throws RuntimeException {

    }

    public static void f8() throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }

    public static void f9() throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }

    public static void f10() {
        try {
            throw new Exception();
        } catch (Exception e) {
            // ...
        }
    }

//    public static void f11() {
//        try {
//            throw new Throwable();
//        } catch (Exception e) {
//            // ...
//        }
//    }

//    public static void f12() {
//        try {
//            throw new Exception();
//        } catch (Error e) {
//            // ...
//        }
//    }

    public static void f13() throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException e) {
            // ...
        }
    }

//    public static void f14() throws Exception {
//        Throwable t = new Exception(); // и лететь будет Exception
//        throw t; // но тут ошибка компиляции
//    }

//    public static void f15() throws Exception {
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }

    public static void f16() throws Throwable {
        try {
            Throwable t = new Exception(); // а лететь будет Exception
            throw t;
        } catch (Exception e) { // и мы перехватим Exception
            System.out.println("Перехвачено!");
        }
    }

    class Parent {
        // предок пугает IOException и InterruptedException
        public void f() throws IOException, InterruptedException {}
    }

    class ChildA extends Parent {
        // а потомок пугает только потомком IOException
        @Override
        public void f() throws FileNotFoundException {
        }
    }

//    class ChildB extends Parent {
//        @Override
//        public void f() throws Exception {}
//    }
}

