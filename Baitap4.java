package ontaponha;
import java.util.Scanner;
import java.util.Arrays;

public class Baitap4 {
    public static void main(String[] args) {
        Bai_1 ();
        Bai_2 ();
        Bai_3 ();
        Bai_4 ();
    }
    public static void Bai_1 (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i<n ; i++)
            a[i] = sc.nextInt();
        System.out.println("Mảng in ra màng hình là ");
        for ( int i =0 ; i<n ; i++){
            System.out.println(a[i]);
        }
        System.out.println("Phần tử chẵn tăng thêm một đơn vị ");
        for (int i = 0 ; i<n; i++ ){
            if (a[i]%2==0){
                a[i]++;
            }
        }
        for (int i = 0 ; i < n ; i++){
            System.out.println(a[i]);
        }
    }
    public static void Bai_2(){
        int[] number = new int[]{20, 30, 25, 35, -16, 60, -100};
        System.out.println("Trung bình của cac phần tử mảng ");
        int tb = 0;
        for (int i = 0 ; i< number.length;i++){
            tb+= number[i];
        }
        System.out.println((double) tb/ number.length);

    }
    public static void Bai_3(){
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int a = 2;
        int b = 5 ;
        System.out.println("Chèn phần tử 5 vào ví trí 3 ");
        for (int i = my_array.length - 1; i>a ;i-- ){
            my_array[i]=my_array[i-1];
        }
        my_array[a] = b;
        System.out.println(Arrays.toString(my_array));

    }
    public static void Bai_4(){
        String[] array1 = {"Python", "JAVA","PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        System.out.println("Các phần tử mảng 1 suất hiện ở mảng 2");
        for (int i = 0 ; i < array1.length ; i++){
            for (int j = 0 ;j<array2.length ; j++ ){
                if (array1[i]==array2[j]){
                    System.out.print(" " + array1[i]);
                }
            }
        }
    }
}