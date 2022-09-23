package btvnbuoi5;

import java.util.Scanner;

public class QuanlyCbApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        try {
            while (true) {
                System.out.println("Ung dung quan ly can bo");
                System.out.println("Nhap so 1: Them can bo moi");
                System.out.println("Nhap so 2: Tim kiem can bo theo ten: ");
                System.out.println("Nhap so 3: Hien thi thong tin ve danh sach can bo");
                System.out.println("Nhap so 4: Thoat ung dung:");
                String line = scanner.nextLine();
                switch (line) {
                    case "1": {
                        System.out.println("Nhap a: Them ky su moi");
                        System.out.println("Nhap b: Them cong nhan moi");
                        System.out.println("Nhap c: Them nhan vien moi");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                System.out.print("Nhap ho ten: ");
                                String ten = scanner.nextLine();
                                System.out.print("Nhap tuoi:");
                                int tuoi = scanner.nextInt();
                                System.out.print("Nhap gioi tinh: ");
                                scanner.nextLine();
                                String gioiTinh = scanner.nextLine();
                                System.out.print("Nhap dia chi: ");
                                String diaChi = scanner.nextLine();
                                System.out.print("Nhap nganh nghe: ");
                                String nganhNghe = scanner.nextLine();
                                CanBo canBo = new KySu(ten, tuoi, gioiTinh, diaChi, nganhNghe);
                                quanLyCanBo.themCanBo(canBo);
                                System.out.println(canBo.toString());
                                break;
                            }
                            case "b": {
                                System.out.print("Nhap ho va ten: ");
                                String ten = scanner.nextLine();
                                System.out.print("Nhap tuoi:");
                                int tuoi = scanner.nextInt();
                                System.out.print("Nhap gioi tinh: ");
                                scanner.nextLine();
                                String gioiTinh = scanner.nextLine();
                                System.out.print("Nhap dia Chi: ");
                                String diaChi = scanner.nextLine();
                                System.out.print("Nhap cap bac: ");
                                int capBac = scanner.nextInt();
                                CanBo canBo = new CongNhan(ten, tuoi, gioiTinh, diaChi, capBac);
                                quanLyCanBo.themCanBo(canBo);
                                System.out.println(canBo.toString());
                                scanner.nextLine();
                                break;
                            }
                            case "c": {
                                System.out.print("Nhap ten: ");
                                String ten = scanner.nextLine();
                                System.out.print("Nhap tuoi: ");
                                int tuoi = scanner.nextInt();
                                System.out.print("Nhap gioi tinh: ");
                                scanner.nextLine();
                                String gioiTinh = scanner.nextLine();
                                System.out.print("Nhap dia chi: ");
                                String diaChi = scanner.nextLine();
                                System.out.print("Nhap cong viec: ");
                                String congViec = scanner.nextLine();
                                CanBo canBo = new NhanVien(ten, tuoi, gioiTinh, diaChi, congViec);
                                quanLyCanBo.themCanBo(canBo);
                                System.out.println(canBo.toString());
                                break;
                            }
                            default:
                                System.out.println("Invalid");
                                break;
                        }
                        break;
                    }

                    case "2": {
                        System.out.print("Nhap ten de tim kiem theo ten: ");
                        String ten = scanner.nextLine();
                        System.out.println(quanLyCanBo.timKiemCanBoTheoTen(ten));
                        break;
                    }
                    case "3": {
                        quanLyCanBo.hienThiDanhSachCacBo();
                        break;
                    }
                    case "4": {
                        return;
                    }
                    default:
                        System.out.println("Invalid");
                        continue;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}
