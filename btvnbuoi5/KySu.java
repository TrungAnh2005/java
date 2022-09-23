package btvnbuoi5;

public class KySu extends CanBo{
    private String chuyenNganh;

    public KySu(String ten, int tuoi, String gioiTinh, String diaChi, String chuyenNganh) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
