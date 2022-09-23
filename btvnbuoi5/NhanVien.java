package btvnbuoi5;

public class NhanVien extends CanBo {
    private String task;

    public NhanVien(String ten, int tuoi, String gioiTinh, String diaChi, String task) {
        super(ten, tuoi, gioiTinh, diaChi);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }
    @Override
    public String toString() {
        return "NhanVien{" +
                "task='" + task + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
