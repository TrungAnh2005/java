package btvnbuoi6;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheMuon theMuon = new TheMuon();
        while (true) {
            System.out.println("Ung dung quan ly the muon sach");
            System.out.println("Enter 1: Them the moi: ");
            System.out.println("Enter 2: Xoa the: ");
            System.out.println("Enter 3: Hien thi danh sach the: ");
            System.out.println("Enter 5: Thoat: ");
            System.out.println("``````````````````````````````````");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Enter ten sinh vien: ");
                    String ten = scanner.nextLine();
                    System.out.print("Enter tuoi: ");
                    int tuoi = scanner.nextInt();
                    System.out.print("Enter lop hoc: ");
                    String lopHoc = scanner.next();
                    SinhVien sinhVien = new SinhVien(ten, tuoi, lopHoc);

                    System.out.print("Enter ma the: ");
                    scanner.nextLine();
                    String maThe = scanner.nextLine();
                    System.out.print("Enter ngay muon sach: ");
                    int ngayMuon = scanner.nextInt();
                    System.out.print("Enter ngay tra sach: ");
                    int ngayTra = scanner.nextInt();
                    System.out.print("Enter so hieu sach: ");
                    int soHieuSach = scanner.nextInt();

                    The the = new The(sinhVien, maThe, ngayMuon, ngayTra, soHieuSach );
                    theMuon.themThe(the);
                    System.out.println(the.toString());
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.println("Enter ma the can xoa: ");
                    String maThe = scanner.nextLine();
                    theMuon.xoaThe(maThe);
                    break;
                }
                case "3": {
                    theMuon.hienThi();
                    break;
                }

                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}

