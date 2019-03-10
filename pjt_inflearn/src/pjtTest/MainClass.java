package pjtTest;

public class MainClass {
    // 프로그램을 가장 먼저 실행하는 메소드
    public static void main(String[] args) {
        // sysout : Sh+Space
        System.out.println("Hello Java World~~~");

        /*
        int i = 10;
        int j;
        j = 100;
        System.out.println("i + j = " + (i + j));

        i = 200;
        System.out.println("i + j = " + (i + j));

        int num = 10;
        System.out.println("i = " + num);

        num = 100;
        System.out.println("i = " + num);

        num = 300;
        System.out.println("i = " + num);

        num = 0;
        System.out.println("i = " + num);
        */

        char c = 'c';       //2byte
        System.out.println("c = " + c);
        
        int i = 10;         //4byte
        System.out.println("i = " + i);
        
        double d = 10.123;  //8byte
        System.out.println("d = " + d);
        
        boolean b = false;  //1byte
        System.out.println("b = " + b);
        
        String s = "Hello Java World";
        System.out.println("s = " + s);


        byte by = 10;
        int in = by;
        System.out.println("in = " + in);

        int iVar = 100;
        byte bVar = (byte)iVar;
        System.out.println("bVar = " + bVar);

        iVar = 123456;
        bVar = (byte)iVar;
        System.out.println("bVar = " + bVar);
        
    }
}
