import java.time.LocalDate;
import java.util.Scanner;

public class BaiMot {
    static String[] monHoc = { "T", "V", "L", "H", "S", "D", "Sinh", "T.A", "GDCD" };
    static float diemTb = 0;

    public static Student inputInfo() {
        Student st = new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap Ma Hoc Sinh");
        st.setMaHS(input.next());
        System.out.println("Nhap Ho");
        st.setHo(input.next());
        System.out.println("Nhap Ten");
        st.setTen(input.next());
        System.out.println("Nhap Ngay Sinh");
        st.setNgaySinh(LocalDate.parse(input.next()));
        System.out.println("Nhap Gioi Tinh");
        st.setGioiTinh(input.next());

        float[] diemMon = new float[9];

        for (int i = 0; i < monHoc.length; i++) {
            System.out.println("Nhap Diem " + monHoc[i]);
            diemMon[i] = input.nextFloat();
        }

        st.setDiem(diemMon);
        input.close();
        return st;
    }

    public static void tinhDiemTB(Student st) {
        for (int i = 0; i < monHoc.length; i++) {
            diemTb += (i == 0 || i == 1 ? st.diemMon[i] * 2 : st.diemMon[i]);
        }

        diemTb = diemTb / 11;
        System.out.println("Diem tb :");
        System.out.printf("%.2f", diemTb);
    }

    public static void display(Student st) {
        System.out.println("Ma HS :" + st.maHS);
        System.out.println("Ho :" + st.ho);
        System.out.println("Ten :" + st.ten);
        System.out.println("Ngay sinh :" + st.ngaySinh);
        System.out.println("Gioi Tinh :" + st.gioiTinh);

        for (int i = 0; i < monHoc.length; i++) {
            System.out.println("Diem " + monHoc[i] + ": " + st.diemMon[i]);
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s = inputInfo();
        display(s);
        tinhDiemTB(s);
    }
}

class Student {
    String maHS;
    String ho;
    String ten;
    LocalDate ngaySinh;
    String gioiTinh;
    float dtb;
    float[] diemMon;

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }

    public float[] getDiem() {
        return diemMon;
    }

    public void setDiem(float diem[]) {
        this.diemMon = diem;
    }
}
