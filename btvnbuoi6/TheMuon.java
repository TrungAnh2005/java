package btvnbuoi6;

import java.util.ArrayList;
import java.util.List;

public class TheMuon {
//    private List<The>theList = new ArrayList<The>(5);
//    public void themThe(The the){
//        theList.add(the);
//        System.out.println(the.toString());
//    }
//    public boolean xoaThe(The the){
//        return theList.remove(the);
//    }
//    public boolean xoaThe(String maThe){
//        for (int i = 0; i< theList.size();i++){
//            The the = theList.get(i);
//            if (the.getMaThe().equals(maThe)){
//                theList.remove(the);
//                return true;
//            }
//        }
//        return false;
//    }
//    public void hienThi(){
//        System.out.println(theList);
//    }
    private List<The> theList;
    public TheMuon() {
        this.theList = new ArrayList<>();
    }
    public void themThe(The the){
        this.theList.add(the);
    }
    public boolean xoaThe(String maThe){
        for (int i =0;i<theList.size();i++){
            The the = theList.get(i);
            if (the.getMaThe().equals(maThe)){
                theList.remove(the);
                return true;
            }
        }
        return false;
    }
    public void hienThi(){
        System.out.println(theList);
    }
}
