package pjtTest;

import java.util.Arrays;
import java.util.Scanner;

//�迭�� �̿��� ���� ����
public class ScoreMgmtByArrayClass {
    public static void main(String[] args) {
        //1���� �迭
        /*
        int intCnt = 0;
        Scanner scan = new Scanner(System.in);
        
        String[] arrName  = new String[3];
        int[]    arrScore = new int[3];
        
        System.out.print("�̸��� �Է����ּ��� : ");
        arrName[0]  = scan.next();
        System.out.print("������ �Է����ּ��� : ");
        arrScore[0] = scan.nextInt();
        
        System.out.print("�̸��� �Է����ּ��� : ");
        arrName[1] = scan.next();
        System.out.print("������ �Է����ּ��� : ");
        arrScore[1] = scan.nextInt();
        
        System.out.print("�̸��� �Է����ּ��� : ");
        arrName[2] = scan.next();
        System.out.print("������ �Է����ּ��� : ");
        arrScore[2] = scan.nextInt();

        double dblScoreAvg = (double)((arrScore[0] + arrScore[1] + arrScore[2]) / intCnt); 
        
        System.out.println("--------------------------------------------------");
        System.out.printf("%s \t���� : %.2f\n", arrName[0], (double)arrScore[0]);
        System.out.printf("%s \t���� : %.2f\n", arrName[1], (double)arrScore[1]);
        System.out.printf("%s \t���� : %.2f\n", arrName[2], (double)arrScore[2]);
        System.out.printf("\t���� : %.2f\n", dblScoreAvg);
        */

        //2���� �迭
        Scanner objScan  = new Scanner(System.in);

        System.out.print("�� ���ΰ���? : ");
        int intCnt = objScan.nextInt();

        Object[][] arrScoreMgmt = new Object[intCnt][4];

        for (int i = 0; i < intCnt; i++) {
            String[] arrScore = new String[3];

            System.out.print("�̸��� �Է����ּ��� : ");
            arrScoreMgmt[i][0]  = objScan.next();

            System.out.print("����,����,���� ������ �Է����ּ���.(��: 100,100,100)");
            arrScore = objScan.next().split(",");

            double dblScoreSum = Double.parseDouble(arrScore[0]) + Double.parseDouble(arrScore[1]) + Double.parseDouble(arrScore[2]);

            arrScoreMgmt[i][1]  = arrScore;
            arrScoreMgmt[i][2]  = String.format("%.2f", dblScoreSum);
            arrScoreMgmt[i][3]  = String.format("%.2f", dblScoreSum / 3);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("�̸�\t����\t����\t����\t����\t���");
        System.out.println("--------------------------------------------------");

        int j = 0;
        while (j < intCnt) {
            System.out.println(Arrays.deepToString(arrScoreMgmt[j]).replace(" ", "").replace("[", "").replace("]", "").replace(",", "\t"));
            j++;
        }
        System.out.println("--------------------------------------------------");

    }
    
}
