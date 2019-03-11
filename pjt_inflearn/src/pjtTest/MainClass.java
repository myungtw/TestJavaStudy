package pjtTest;

public class MainClass {
    // ���α׷��� ���� ���� �����ϴ� �޼ҵ�
    public static void main(String[] args) {
        // sysout : Sh+Space
        System.out.println("Hello Java World~~~");

        //����
        char c = 'c';       //2byte
        System.out.println("���� char     : " + c);
        
        int i = 10;         //4byte
        System.out.println("���� int      : " + i);
        
        double d = 10.123;  //8byte
        System.out.println("�Ǽ� double   : " + d);
        
        boolean b = false;  //1byte
        System.out.println("�� boolean  : " + b);
        
        String s = "Hello Java World";
        System.out.println("���ڿ� String : " + s);

        //����ȯ
        //�ڵ�����ȯ : ���� �������� -> ū ��������
        byte by = 10;
        int  in = by;
        System.out.println("in = " + in + ", by = " + by);
        //���������ȯ : �����Ͱ� ���ǵ� �� ����
        in = 100;
        by = (byte)in;
        System.out.println("by = " + in + ", in = " + by);
        in = 123456;
        by = (byte)in;
        System.out.println("by = " + in + ", in = " + by);

        //Ư������
        System.out.println("��     :  Good\t\t\tMornig~");
        System.out.println("�ٹٲ� : Good\nMornig~");
        System.out.println("\'     : Good\'Mornig~\'");
        System.out.println("\"     : Good\"Mornig~\"");
        System.out.println("\\     : Good\\Mornig~\\");
        
        //����(����)
        System.out.printf("num(10����)     : %d\n", 30);
        System.out.printf("num(8 ����)     : %o\n", 30);
        System.out.printf("num(16����)     : %x\n", 30);
        System.out.printf("num(�Ǽ�Float)  : %f\n", 1.12345678f);
        System.out.printf("num(�Ǽ�Double) : %f\n", 1.12345678d);
        System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", 'a', 'A');
        System.out.printf("�ҹ��� \'%s\'�� �빮�ڴ� \'%s\'�Դϴ�.\n", "java", "JAVA");
        //����(����)
        System.out.printf("%d\n%d\n%d\n", 123, 1234,12345);
        System.out.printf("%5d\n%5d\n%5d\n", 123, 1234,12345);
        System.out.printf("%f\n%.0f\n%.2f\n%.3f\n", 1.23, 1.23, 1.23, 1.23);
        
        System.out.printf("%c%7c\n", '*', '*');
        System.out.printf("%s%6s\n", "**", "**");
        System.out.printf("%d%5d\n", 123, 321);

        // = : ���ʿ� �������� ����
        //== : ���ʰ� �������� ����
        int x = 10;
        int y = 20;
        System.out.printf("x = %d, y = %d\n", x, y);
        
        x = y;
        System.out.printf("x = %d, y = %d\n", x, y);
        
        //��� ������
        x = 10; y = 10;
        System.out.printf("x + y = %d\n", x + y);
        System.out.printf("x - y = %d\n", x - y);
        System.out.printf("x * y = %d\n", x * y);
        System.out.printf("x / y = %d\n", x / y);
        System.out.printf("x %% y = %d\n", x % y);
        
        //���� ���� ������
        x = 10; y = 10;
        System.out.printf("x += 10 : %d\n", x += 10);
        System.out.printf("x -= 10 : %d\n", x -= 10);
        System.out.printf("x *= 10 : %d\n", x *= 10);
        System.out.printf("x /= 10 : %d\n", x /= 10);
        System.out.printf("x %%= 10 : %d\n", x %= 10);

        //���� ������
        x = 1;
        System.out.printf("++x : %d, x : %d\n", ++x, x);
        System.out.printf("x++ : %d, x : %d\n", x++, x);
        System.out.printf("--x : %d, x : %d\n", --x, x);
        System.out.printf("x-- : %d, x : %d\n", x--, x);
        
        //���� ������
        x = 10; y = 10;
        System.out.printf("x > y  : %b\n", x > y);
        System.out.printf("x >= y : %b\n", x >= y);
        System.out.printf("x < y  : %b\n", x <= y);
        System.out.printf("x <= y : %b\n", x > y);
        System.out.printf("x == y : %b\n", x == y);
        System.out.printf("x != y : %b\n", x != y);
        
        //�� ������
        boolean b1 = true;
        boolean b2 = false;
        System.out.printf("b1 && b2 : %b\n", b1 && b2);
        System.out.printf("b1 || b2 : %b\n", b1 || b2);
        System.out.printf("!b1 : %b\n", !b1);
        
        //���� ������
        x = 10; y = 20;
        System.out.printf("x > y ? 100 : 200 => %d\n", (x > y) ? 100 : 200);
        System.out.printf("x < y ? 100 : 200 => %d\n", (x < y) ? 100 : 200);
        
        //��Ʈ ������
        // & : AND, | : OR, ^ : XOR
        
        
        
        
    }
}
