package ontaponha;

public class Baitap3 {
    public static void main(String[] args) {
//        Bài 1
        String str1 = "welcome";
        int l =str1.length();
        String newstring ="";
        for (int i = 0 ; i < l; i++){
            newstring+= str1.charAt(i);
            newstring+= str1.charAt(i);
        }
        System.out.println("Chuỗi đã cho :"+str1);
        System.out.println("Chuỗi mới:"+newstring);
//        Bài 2
        String str2 = "techmaster";
        System.out.println("Chuỗi đã cho: "+str2);
        System.out.println("Chuỗi mới :"+removeDuplicateChars(str2));
//        Bài 3
        String st3 = "gibblegabbler";
        System.out.println(st3);
        for (int i = 0; i< st3.length();i++){
            boolean unique = true;
            for ( int j = 0 ;j< st3.length();j++){
                if (i != j && st3.charAt(i) == st3.charAt(j)){
                    unique = false ;
                    break;
                }
            }
            if (unique){
                System.out.println(st3.charAt(i));
                break;
            }
        }
        String str4 = "test string";
        int N = 256;
        int ctr[] = new int[N];
        int k = str4.length();
        for (int i = 0; i < k; i++)
            ctr[str4.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < k; i++) {
            if (max < ctr[str4.charAt(i)]) {
                max = ctr[str4.charAt(i)];
                result = str4.charAt(i);
            }
        }
        System.out.println("Chuỗi đã cho : " + str4);
        System.out.println("Chuỗi mới : " + result);
    }
    private static String removeDuplicateChars(String sourceStr){
        char[] arr1 = sourceStr.toCharArray();
        String targetStr = "";
        for (char value: arr1){
            if (targetStr.indexOf(value) == -1){
                targetStr+= value;
            }
        }
        return targetStr;
    }


}
