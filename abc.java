public class abc {
    public static void main(String[] args) {
        System.out.println("Bài1: giá tri của n là:"+a());
        System.out.println("Gía trị khi thay đổi là:" +b());
        System.out.println( "Bài 2 : giá trị khi đổi độ F sang độ C :"+ Math.floor((78-32)/1.8) );
        double d = 9/5f;
        System.out.println("Bài 3 : "+d);
        System.out.println("Bài4 tổng các số nguyên là: "+bai4());
        int l = 10 ;
        int n = 10 ;
        System.out.println(l==n);
        System.out.println("Bài 6 khối lượng cơ thể là : "+ Math.floor(58/Math.pow(1.68,2)));
        System.out.print( "Bai7 : ");
        System.out.println(System.currentTimeMillis());
        String x = "123456";
        String y = x.substring(0, 1);
        String z = x.substring(1, 2);
        String g = x.substring(2, 3);
        String h = x.substring(3, 4);
        String j = x.substring(4, 5);
        String k = x.substring(5, 6);
        System.out.println("Bài8 :" +y);
        System.out.println(z);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);

    }
    public static int a(){
        int i = 10 ;
        int n = i++%5;
        return n;
    }
    public static int b(){
        int i = 10;
        int n = ++i%5;
        return n;
    }
    public static int bai4(){
        int m = 1234;
        int sum = 0;
        while (m>0){
            sum+=m%10;
            m = m/10;
        }
        return sum;
    }



}

