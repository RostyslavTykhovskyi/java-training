package Exceptions;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println("### 1 ############################################\n");
        //systemOut();
        //systemErr();

        System.out.println("\n### 2 ############################################\n");
        double d = sqr(10.0);
        System.out.println(d);

        System.out.println("\n### 3 ############################################\n");
        int i = area(10, 2);
        System.out.println(i);

        System.out.println("\n### 4 ############################################\n");
        System.err.println("#1.in");
        a1(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println("#1.out"); // вернулись

//        System.err.println("#1.in");
//        a1(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись

        System.err.println("#1.in");
        try {
            a2(); // создаем фрейм, помещаем в стек, передаем в него управление
        } catch (Error e) { // "перехватили" "летящее" исключение
            System.err.println(".   .   #1.CATCH");  // и работаем
        }
        System.err.println("#1.out"); // вернулись

        System.err.println("#1.in");
        a3(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println("#1.out"); // вернулись

        System.err.println("#1.in");
        a4(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println("#1.out"); // вернулись

        System.err.println("\n### 5 ############################################\n");
        catch1();

        System.err.println("\n### 6 ############################################\n");
        finally1();

        System.err.println("\n### 7 ############################################\n");
        catchFinally1();
    }

    public void f1() throws Throwable {}
//    public void f1() throws String {}

    public void f2() {
        try {
        } catch (Throwable t) {}
    }
//    public void f2() {
//        try {
//        } catch (String s) {}
//    }

    public void f3() {
        throw new Error();
    }
//    public void f3() {
//        throw new String("Hello!");
//    }

    public void f4() {
        Error ref = new Error();
        throw ref;
    }
//    public void f4() {
//        throw null;
//    }

    public static void systemOut() {
        System.out.println("sout");
        throw new Error();
    }
    public static void systemErr() {
        System.err.println("serr");
        throw new Error();
    }

    public static double sqr(double arg) {
        return arg * arg;
    }
//    public static double sqr(double arg) {
//        int k = 1;
//        return k;
//    }
//    public static double sqr(double arg) {
//        int k = 1;
//        return (double) k;
//    }
//    public static double sqr(double arg) {
//        return "hello!";
//    }
//    public static double sqr(double arg) {
//    }
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg;
//        }
//    }
//    public static double sqr(double arg) {
//        while (true);
//    }
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg;
//        } else {
//            while (true);
//        }
//    }
//    public static double sqr(double arg) {
//        throw new RuntimeException();
//    }
//    public static double sqr(double arg) {
//        long time = System.currentTimeMillis();
//        if (time % 2 == 0) {
//            return arg * arg;
//        } else if (time % 2 == 1) {
//            while (true);
//        } else {
//            throw new RuntimeException();
//        }
//    }

    public static int area(int width, int height) {
        return width * height;
    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//
//        } else {
//            return width * height;
//        }
//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.out.println("Bad ...");
//        }
//        return width * height;
//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            return -1;
//        }
//        return width * height;
//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.exit(0);
//        }
//        return width * height;
//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//        }
//        return width * height;
//    }

    public static void a1() {
        System.err.println(".   #2.in");
        b1(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");  //вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void b1() {
        System.err.println(".   .   #3.in");
        c1(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out"); // вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void c1() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.RETURN");
            return; // выходим из текущего фрейма по 'return'
        }
        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
    }

    public static void a2() {
        System.err.println(".   #2.in");
        b2(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");  //вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void b2() {
        System.err.println(".   .   #3.in");
        c2(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out"); // вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void c2() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
        }
        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
    }

    public static void a3() {
        System.err.println(".   #2.in");
        try {
            b3(); // создаем фрейм, помещаем в стек, передаем в него управление
        } catch (Error e) { // "перехватили" "летящее" исключение
            System.err.println(".   #2.CATCH");  // и работаем
        }
        System.err.println(".   #2.out");  //вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void b3() {
        System.err.println(".   .   #3.in");
        c3(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   .   #3.out"); // вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void c3() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
        }
        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
    }

    public static void a4() {
        System.err.println(".   #2.in");
        b4(); // создаем фрейм, помещаем в стек, передаем в него управление
        System.err.println(".   #2.out");  //вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void b4() {
        System.err.println(".   .   #3.in");
        try {
            c4(); // создаем фрейм, помещаем в стек, передаем в него управление
        } catch (Error e) { // "перехватили" "летящее" исключение
            System.err.println(".   .   #3.CATCH");  // и работаем
        }
        System.err.println(".   .   #3.out"); // вернулись
    } // выходим из текущего фрейма, кончились инструкции
    public static void c4() {
        System.err.println(".   .   .   #4.in");
        if (true) {
            System.err.println(".   .   .   #4.THROW");
            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
        }
        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
    }

    public static void catch1() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
            System.err.print(" 2");
        }
        System.err.println(" 3");
    }
    public static void catch2() {
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            if (e instanceof RuntimeException) {
                RuntimeException re = (RuntimeException) e;
                System.err.print("Это RuntimeException на самом деле!!!");
            } else {
                System.err.print("В каком смысле не RuntimeException???");
            }
        }
    }
//    public static void catch3() {
//        try {
//            System.err.print(" 0");
//            if (true) {throw new Exception();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");
//    }
    public static void catch4() {
        try {
            System.err.print(" 0");
            if (true) {throw new Error();}
            System.err.print(" 1");
        } catch (Exception e) {
            System.err.print(" 2");
        }
        System.err.print(" 3");
    }
    public static void catch5() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {     // перехватили RuntimeException
            System.err.print(" 2");
            if (true) {throw new Error();} // но бросили Error
        }
        System.err.println(" 3");          // пропускаем - уже летит Error
    }
    public static void catch6() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) { // перехватили RuntimeException
            System.err.print(" 2");
            if (true) {throw e;}       // и бросили ВТОРОЙ раз ЕГО ЖЕ
        }
        System.err.println(" 3");      // пропускаем - опять летит RuntimeException
    }
    public static void catch7() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) {     // перехватили RuntimeException
            System.err.print(" 2");
            if (true) {throw new Error();} // и бросили новый Error
        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
    public static void catch8() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch (RuntimeException e) { // перехватили RuntimeException
            System.err.print(" 2.1");
            try {
                System.err.print(" 2.2");
                if (true) {throw new Error();} // и бросили новый Error
                System.err.print(" 2.3");
            } catch (Throwable t) {            // перехватили Error
                System.err.print(" 2.4");
            }
            System.err.print(" 2.5");
        } catch (Error e) { // хотя есть cath по Error "ниже", но мы в него не попадаем
            System.err.print(" 3");
        }
        System.err.println(" 4");
    }
//    public static void catch9() {
//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }
//    }
    public static void catch10() {
        try {
        } catch (Error e) {
        } catch (RuntimeException e) {
        }
    }
    public static void catch11() {
        try {
            throw new Exception();
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }
    public static void catch12() {
        try {
            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
            throw t;
        } catch (RuntimeException e) {
            System.err.println("catch RuntimeException");
        } catch (Exception e) {
            System.err.println("catch Exception");
        } catch (Throwable e) {
            System.err.println("catch Throwable");
        }
        System.err.println("next statement");
    }

    public static void finally1() {
        try {
            System.err.println("try");
        } finally {
            System.err.println("finally");
        }
    }
    public static void finally2() {
        try {
            throw new RuntimeException();
        } finally {
            System.err.println("finally");
        }
    }
    public static void finally3() {
        try {
            return;
        } finally {
            System.err.println("finally");
        }
    }
    public static void finally4() {
        try {
            System.exit(42);
        } finally {
            System.err.println("finally");
        }
    }
    public static void finally5() {
        try {
            Runtime.getRuntime().exit(42);
        } finally {
            System.err.println("finally");
        }
    }
    public static void finally6() {
        try {
            Runtime.getRuntime().halt(42);
        } finally {
            System.err.println("finally");
        }
    }
    public static void finally7() {
        try {
            System.err.println("try");
            if (true) {throw new RuntimeException();}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
//    public static void finally8() {
//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");
//    }
    public static void finally9() {
        try {
            System.err.println("try");
            if (true) {return;}
        } finally {
            System.err.println("finally");
        }
        System.err.println("more");
    }
    public static int finally10() {
        try {
            return 0;
        } finally {
            return 1;
        }
    }
    public static int finally11() {
        try {
            throw new RuntimeException();
        } finally {
            return 1;
        }
    }
    public static int finally12() {
        try {
            return 0;
        } finally {
            throw new RuntimeException();
        }
    }
    public static int finally13() {
        try {
            throw new Error();
        } finally {
            throw new RuntimeException();
        }
    }

    public static void catchFinally1() {
        try {
            System.err.print(" 0");
            // nothing
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
    public static void catchFinally2() {
        try {
            System.err.print(" 0");
            if (true) {throw new Error();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
    public static void catchFinally3() {
        try {
            System.err.print(" 0");
            if (true) {throw new RuntimeException();}
            System.err.print(" 1");
        } catch(Error e) {
            System.err.print(" 2");
        } finally {
            System.err.print(" 3");
        }
        System.err.print(" 4");
    }
    public static void catchFinally4() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                // НИЧЕГО
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - нет исключения
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // заходим - выполнение в норме
        } catch (Exception e) {
            System.err.print(" 6");     // НЕ заходим - нет исключения
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение в норме
    }
    public static void catchFinally5() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new RuntimeException();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // ЗАХОДИМ - есть исключение
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // заходим - выполнение УЖЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // не заходим - нет исключения, УЖЕ перехвачено
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
    }
    public static void catchFinally6() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Exception();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме
    }
    public static void catchFinally7() {
        try {
            System.err.print(" 0");
            try {
                System.err.print(" 1");
                if (true) {throw new Error();}
                System.err.print(" 2");
            } catch (RuntimeException e) {
                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
            } finally {
                System.err.print(" 4"); // заходим всегда
            }
            System.err.print(" 5");     // НЕ заходим - выполнение НЕ в норме
        } catch (Exception e) {
            System.err.print(" 6");     // не заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
        } finally {
            System.err.print(" 7");     // заходим всегда
        }
        System.err.print(" 8");         // не заходим - выполнение НЕ в норме
    }
}
