package pjtTest;

public class MainClass {
    // 프로그램을 가장 먼저 실행하는 메소드
    public static void main(String[] args) {
        // sysout : Sh+Space
        System.out.println("Hello Java World~~~");

        //변수
        char c = 'c';       //2byte
        System.out.println("문자 char     : " + c);
        
        int i = 10;         //4byte
        System.out.println("숫자 int      : " + i);
        
        double d = 10.123;  //8byte
        System.out.println("실수 double   : " + d);
        
        boolean b = false;  //1byte
        System.out.println("논리 boolean  : " + b);
        
        String s = "Hello Java World";
        System.out.println("문자열 String : " + s);

        //형변환
        //자동형변환 : 작은 데이터형 -> 큰 데이터형
        byte by = 10;
        int  in = by;
        System.out.println("in = " + in + ", by = " + by);
        //명시적형변환 : 데이터가 누실될 수 있음
        in = 100;
        by = (byte)in;
        System.out.println("by = " + in + ", in = " + by);
        in = 123456;
        by = (byte)in;
        System.out.println("by = " + in + ", in = " + by);

        //특수문자
        System.out.println("탭     :  Good\t\t\tMornig~");
        System.out.println("줄바꿈 : Good\nMornig~");
        System.out.println("\'     : Good\'Mornig~\'");
        System.out.println("\"     : Good\"Mornig~\"");
        System.out.println("\\     : Good\\Mornig~\\");
        
        //서식(포멧)
        System.out.printf("num(10진수)     : %d\n", 30);
        System.out.printf("num(8 진수)     : %o\n", 30);
        System.out.printf("num(16진수)     : %x\n", 30);
        System.out.printf("num(실수Float)  : %f\n", 1.12345678f);
        System.out.printf("num(실수Double) : %f\n", 1.12345678d);
        System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'A');
        System.out.printf("소문자 \'%s\'의 대문자는 \'%s\'입니다.\n", "java", "JAVA");
        //서식(정렬)
        System.out.printf("%d\n%d\n%d\n", 123, 1234,12345);
        System.out.printf("%5d\n%5d\n%5d\n", 123, 1234,12345);
        System.out.printf("%f\n%.0f\n%.2f\n%.3f\n", 1.23, 1.23, 1.23, 1.23);
        
        System.out.printf("%c%7c\n", '*', '*');
        System.out.printf("%s%6s\n", "**", "**");
        System.out.printf("%d%5d\n", 123, 321);

        // = : 왼쪽에 오른쪽을 대입
        //== : 왼쪽과 오른쪽이 같음
        int x = 10;
        int y = 20;
        System.out.printf("x = %d, y = %d\n", x, y);
        
        x = y;
        System.out.printf("x = %d, y = %d\n", x, y);
        
        //산술 연산자
        x = 10; y = 10;
        System.out.printf("x + y = %d\n", x + y);
        System.out.printf("x - y = %d\n", x - y);
        System.out.printf("x * y = %d\n", x * y);
        System.out.printf("x / y = %d\n", x / y);
        System.out.printf("x %% y = %d\n", x % y);
        
        //복합 대입 연산자
        x = 10; y = 10;
        System.out.printf("x += 10 : %d\n", x += 10);
        System.out.printf("x -= 10 : %d\n", x -= 10);
        System.out.printf("x *= 10 : %d\n", x *= 10);
        System.out.printf("x /= 10 : %d\n", x /= 10);
        System.out.printf("x %%= 10 : %d\n", x %= 10);

        //증감 연산자
        x = 1;
        System.out.printf("++x : %d, x : %d\n", ++x, x);
        System.out.printf("x++ : %d, x : %d\n", x++, x);
        System.out.printf("--x : %d, x : %d\n", --x, x);
        System.out.printf("x-- : %d, x : %d\n", x--, x);
        
        //관계 연산자
        x = 10; y = 10;
        System.out.printf("x > y  : %b\n", x > y);
        System.out.printf("x >= y : %b\n", x >= y);
        System.out.printf("x < y  : %b\n", x <= y);
        System.out.printf("x <= y : %b\n", x > y);
        System.out.printf("x == y : %b\n", x == y);
        System.out.printf("x != y : %b\n", x != y);
        
        //논리 연산자
        boolean b1 = true;
        boolean b2 = false;
        System.out.printf("b1 && b2 : %b\n", b1 && b2);
        System.out.printf("b1 || b2 : %b\n", b1 || b2);
        System.out.printf("!b1 : %b\n", !b1);
        
        //삼항 연산자
        x = 10; y = 20;
        System.out.printf("x > y ? 100 : 200 => %d\n", (x > y) ? 100 : 200);
        System.out.printf("x < y ? 100 : 200 => %d\n", (x < y) ? 100 : 200);
        
        //비트 연산자
        // & : AND, | : OR, ^ : XOR
        
        
        
        
    }
}
