package btvnbuoi5;

public class QuanLyCanBo {
    private CanBo[] officersArr;
    private int coutCanBo = 0;
    public QuanLyCanBo(){
        this.officersArr = new CanBo[100];
    }
    public void themCanBo(CanBo canBo){
        for (int i = 0 ; i<=coutCanBo;i++){
            if (officersArr[i] == null){
                officersArr[i] = canBo;
                coutCanBo++;
                break;
            }
        }
    }
    public String timKiemCanBoTheoTen(String ten) {
        for (CanBo canBo : officersArr) {
            if (ten.contains(canBo.getTen())) return canBo.toString();
        }
        return "Khong tim thay";
    }
    public void hienThiDanhSachCacBo(){
        for (CanBo canBo : officersArr){
            if (canBo != null){
                System.out.println(canBo.toString());
            }
        }
    }
}
