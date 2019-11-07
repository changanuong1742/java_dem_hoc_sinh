import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CountSV {

    public static void main(String[] args) {

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhap do dai mang");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Khong duoc nhap qua 30");
            }
        } while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap diem cua tung hoc sinh");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("Danh sach diem");
        for (int j=0;j<array.length;j++){
            System.out.println(array[j]);
            if(array[j]>=5 &&array[j]<10){
                count++;
            }
        }

        System.out.println("Co " + count + " Dat");
    }


}
