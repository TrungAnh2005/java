package b2;
public class baitap2 {
    public static void main(String[] args) {
        for ( int i = 1 ; i<=5 ; i++ ){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
//        bai : 1
        int k = 1;
        for ( int i = 1 ; i <= 4 ; i++){
            for( int j= 1 ; j<=i ; j++){
                System.out.print(k++);
            }
            System.out.println();
        }
//        bai :2
        for ( int i = 1 ; i <=4 ; i++){
            for ( int j = 1 ; j <=i ; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
//        bai :3
        int a = 1 ;
        for ( int i = 1 ; i <=5 ; i++){
            for ( int j = 1 ; j <= i ; j ++){
                System.out.print(a++);
            }
            System.out.println("");
        }
//        bai: 4
        for( int i = 0 ; i<=4 ; i++){
            for( int j =0 ; j<4-i; j++){
                System.out.print(" ");
            }
            int number = 1;
            for ( int b = 0 ; b<=i; b++){
                System.out.print(number+" ");
                number = number * (i-b)/(b+1);
            }
            System.out.println();
        }
//        bai: 6

        int c = 7 ;
        for ( int i = 1 ; i<= c ; i++){
            for (int j = 1; j<=c-i; j++ ){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = c - 1 ;i>0; i-- ){
            for ( int j =1 ; j<=c-i; j++){
                System.out.print(" ");
            }
            for (int j =1 ; j<=i*2-1; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
//        bai : 5
        for ( int i =6 ;i>0; i--){
            for ( int j=6; j>i;j--){
                System.out.print(" ");
            }
            for( int d =1 ; d<=i ; d++){
                System.out.print("*");
            }
            System.out.println();
        }
//        bai : 7
        for ( int i = 0 ; i<6;i++ ){
            for (int j =1 ;j <6-i; j++){
                System.out.print(" ");
            }
            for ( int e = 0 ; e<=i;e++){
                System.out.print("@");
            }
            System.out.println();
        }
//        bai : 8
        int count = 1;
        int number = 0;
        int spacer =1 ;
        for (int i =1 ; i<(7*2); i++){
            for ( int f = 7 - spacer ; f>0;f-- ){
                System.out.print(" ");
            }
            if(i<7){
                number = i;
                spacer++ ;
            }else {
                number = 7*2 -i;
                spacer--;
            }
            for ( int j =0 ; j<count; j++){
                System.out.print(number);
                if (j<count/2){
                    number--;
                }else {
                    number++;
                }
            }
            if (i<7){
                count=count + 2;
            }else {
                count=count - 2;
            }
            System.out.println();
        }
//        bai : 9a


    }

}





