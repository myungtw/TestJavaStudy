package pjtTest;

public class MainClass {
    // ���α׷��� ���� ���� �����ϴ� �޼ҵ�
    public static void main(String[] args) {
        // sysout : Sh+Space
        System.out.println("Hello Java World~~~");
        System.out.println("--------------------------------------------------");

        //����
        char    c = 'c';                //2byte
        int     i = 10;                 //4byte
        double  d = 10.123;             //8byte
        boolean b = false;              //1byte
        String  s = "Hello Java World";
        
        System.out.println("���� char     : " + c);
        System.out.println("���� int      : " + i);
        System.out.println("�Ǽ� double   : " + d);
        System.out.println("�� boolean  : " + b);
        System.out.println("���ڿ� String : " + s);
        System.out.println("--------------------------------------------------");

        //����ȯ
        byte by  = 10;
        int  in1 = 0;
        int  in2 = 100;
        int  in3 = 1000000;

        //�ڵ�����ȯ : ���� �������� -> ū ��������
        in1 = by;
        System.out.println("by : " + by + ", in = byte : " + in1);

        //���������ȯ : �����Ͱ� ���ǵ� �� ����
        by = (byte)in2;
        System.out.println("in : " + in2 + ", by = (byte)in : " + by);
        by = (byte)in3;
        System.out.println("in : " + in3 + ", by = (byte)in : " + by);
        System.out.println("--------------------------------------------------");

        //Ư������
        System.out.println("��   :  Good\tMornig~");
        System.out.println("���� : Good\nMornig~");
        System.out.println("\'   : Good\'Mornig~\'");
        System.out.println("\"   : Good\"Mornig~\"");
        System.out.println("\\   : Good\\Mornig~\\");
        System.out.println("--------------------------------------------------");

        //����(����)
        System.out.printf("num(10����)     : %d\n", 30);
        System.out.printf("num(8 ����)     : %o\n", 30);
        System.out.printf("num(16����)     : %x\n", 30);
        System.out.printf("num(�Ǽ�Float)  : %f\n", 1.12345678f);
        System.out.printf("num(�Ǽ�Double) : %f\n", 1.12345678d);
        System.out.printf("�ҹ��� \'%c\'�� �빮�ڴ� \'%c\'�Դϴ�.\n", 'a', 'A');
        System.out.printf("�ҹ��� \'%s\'�� �빮�ڴ� \'%s\'�Դϴ�.\n", "java", "JAVA");
        System.out.println("--------------------------------------------------");

        //����(����)
        System.out.printf("����   ���� : %d\n����   ���� : %d\n����   ���� : %d\n", 123, 1234,12345);
        System.out.printf("������ ���� : %5d\n������ ���� : %5d\n������ ���� : %5d\n", 123, 1234,12345);
        System.out.printf("float         : %f\n�Ҽ���(0�ڸ�) : %.0f\n�Ҽ���(2�ڸ�) : %.2f\n�Ҽ���(4�ڸ�) : %.4f\n", 1.23, 1.23, 1.23, 1.23);
        System.out.println("--------------------------------------------------");

        //��� ������
        int x, y = 0;
        x = 10; y = 10;
        System.out.printf("x + y = %d + %d = %d\n", x, y, x + y);
        System.out.printf("x - y = %d - %d = %d\n", x, y, x - y);
        System.out.printf("x * y = %d * %d = %d\n", x, y, x * y);
        System.out.printf("x / y = %d / %d = %d\n", x, y, x / y);
        System.out.printf("x %% y = %d %% %d = %d\n", x, y, x % y);
        
        //���� ���� ������
        x = 10;
        System.out.printf("x += 10 : %d += 10 : %d\n", x, x += 10);
        System.out.printf("x -= 10 : %d -= 10 : %d\n", x, x -= 10);
        System.out.printf("x *= 10 : %d *= 10 : %d\n", x, x *= 10);
        System.out.printf("x /= 10 : %d /= 10 : %d\n", x, x /= 10);
        System.out.printf("x %%= 10 : %d %%= 10 : %d\n", x, x %= 10);

        //���� ������
        x = 1;
        System.out.printf("++x = ++%d = %d, x = %d\n", x, ++x, x);
        System.out.printf("x++ = %d++ = %d, x = %d\n", x, x++, x);
        System.out.printf("--x = --%d = %d, x = %d\n", x, --x, x);
        System.out.printf("x-- = %d-- = %d, x = %d\n", x, x--, x);
        
        //���� ������
        x = 10; y = 10;
        System.out.printf("x >  y : %d >  %d : %b\n", x, y, x >  y);
        System.out.printf("x >= y : %d >= %d : %b\n", x, y, x >= y);
        System.out.printf("x <  y : %d <  %d : %b\n", x, y, x <  y);
        System.out.printf("x <= y : %d <= %d : %b\n", x, y, x <= y);
        System.out.printf("x == y : %d == %d : %b\n", x, y, x == y);
        System.out.printf("x != y : %d != %d : %b\n", x, y, x != y);
        
        //�� ������
        boolean b1 = true;
        boolean b2 = false;
        System.out.printf("b1 && b2 : %b && %b : %b\n", b1, b2, b1 && b2);
        System.out.printf("b1 || b2 : %b && %b : %b\n", b1, b2, b1 || b2);
        System.out.printf("!b1      : !%b      : %b\n", b1, !b1);
        
        //���� ������
        x = 10; y = 20;
        System.out.printf("x > y ? 100 : 200 => %d > %d ? 100 : 200 => %d\n", x, y, (x > y) ? 100 : 200);
        System.out.printf("x < y ? 100 : 200 => %d < %d ? 100 : 200 => %d\n", x, y, (x < y) ? 100 : 200);
        
        //��Ʈ ������
        // & : AND, | : OR, ^ : XOR
        System.out.println("--------------------------------------------------");
        
        //�迭
        int[] arr1 = new int[5];
        arr1[0] = 100; arr1[1] = 200; arr1[2] = 300;
        System.out.printf("arr[0] = %d, arr[1] = %d, arr[2] = %d\n", arr1[0], arr1[1], arr1[2]);

        int[] arr2 = {10, 20, 30};
        System.out.printf("arr[0] = %d, arr[1] = %d, arr[2] = %d\n", arr2[0], arr2[1], arr2[2]);


        
        
        
        

        System.out.println("--------------------------------------------------");
    }
}
