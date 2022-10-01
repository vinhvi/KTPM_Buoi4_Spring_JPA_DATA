package com.example.data_jpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import com.example.data_jpa.reponsitory.ChungNhanDAOImpl;
import com.example.data_jpa.reponsitory.ChuyenBayDAOImpl;
import com.example.data_jpa.reponsitory.MayBayDAOImpl;
import com.example.data_jpa.reponsitory.NhanVienDAOImpl;

@SpringBootApplication
@Transactional
public class DataJpaApplication {
	@Bean
	public CommandLineRunner run(ChuyenBayDAOImpl chuyenBayDAOImpl, MayBayDAOImpl mayBayDAOImpl,
			NhanVienDAOImpl nhanVienDAOImpl, ChungNhanDAOImpl chungNhanDAOImpl) {
		return (ArgsAnnotationPointcut -> {
			// 1. Cho biết các chuyến bay đi Đà Lạt (DAD).
//			System.out.println(" 1. Cho biet cac chuyến bay di Da Lat (DAD).");
//			System.out.println((chuyenBayDAOImpl.listChuyenBayDAD("DAD")));
			// 2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
//			System.out.println(" 2. Cho biet cac loai may bay co tam bay lon hon 10,000km.");
//			System.out.println((mayBayDAOImpl.listTamBay10000(10000)));
			// 3. Tìm các nhân viên có lương nhỏ hơn 10,000
//			System.out.println("3. Tim cac nhan vien có luong nho hon 10,000");
//			System.out.println((mayBayDAOImpl.listLoaiBoeing("Boeing")));
//			// 4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
//			System.out.println("4. Cho biet cac chuyen bay co đo dai duong bay nho hon 10.000km va lon hơn 8.000km.");
//			System.out.println((chuyenBayDAOImpl.listChuyenBay10To8()));
			// 5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
//			System.out.println("5.	Cho biet cac chuyen bay xuat phat tu Sai Gon (SGN) di Ban Me Thuoc (BMV).");
//			System.out.println((chuyenBayDAOImpl.listChuyenBayDenVaDi("SGN", "BMV")));
////			//6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
//			System.out.println("6.	Co bao nhieu chuyen bay xuat phat tu Sai Gon (SGN).");
//			System.out.println(("Số chuyến bay xuất phát từ SGN: " + chuyenBayDAOImpl.numChuyenBaySGN()));
////			//7. Có bao nhiêu loại máy báy Boeing.
//			System.out.println("7.	Co bao nhieu loai may bay Boeing.");
//			System.out.println(("So loai may bay Boeing: " + mayBayDAOImpl.numMayBayBeoing()));
////			//8.Cho biết tổng số lương phải trả cho các nhân viên.
//			System.out.println(" 8.	Cho biet tong so luong phai tra cho cac nhan vien.");
//			System.out.println(("Tong luong phai tra cho nhan vian NV: " + nhanVienDAOImpl.sumLuongNV()));
//			//9.Cho biết mã số của các phi công lái máy báy Boeing.
//			System.out.println(" 9.	Cho biet ma so cua cac phi cong lai may bay Boeing.");
//			List<Object[]> pr_list = new ArrayList<Object[]>();
//			pr_list.addAll(chungNhanDAOImpl.listChuyenBayDenVaDi());
//			for (Object[] objects : pr_list) {
//			System.out.println("Ma so phi cong: " + objects[0]);
//			}
////						}
////			//10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
//			System.out.println("10.	Cho biet cac nhan vien co the lai may bay co ma so 747.");
//			for (Object[] objects : chungNhanDAOImpl.listNV747()) {
//				System.out.println("Ma nhan vien: " + objects[0] + ", Ma may bay: " + objects[1] + ", Ten: " + objects[2]
//						+ ", Luong: " + objects[3]);
//			}
////			//11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
//			System.out.println("11.	Cho biet ma so cua cac loai may bay ma nhan vien co ho Nguyrn co the lai.");
//			for (Object[] objects : chungNhanDAOImpl.listMaMBOfNguyen("Nguyen")) {
//				System.out.println("Ma may bay la: " + objects[0]);
//			}
//			// 12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
//			System.out.println("12.	Cho biet ma so cua cac phi cong vua lai duoc Boeing vua lai duoc Airbus.");
//			for (Object[] objects : chungNhanDAOImpl.listMaMVOfLoaiMB("Boeing", "Airbus")) {
//				System.out.println("Ma phi cong la: " + objects[0]);
//			}
////			//13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280.
//			System.out.println("13.	Cho biet cac loai may bay co the thuc hien chuyen bay VN280.");
//			for (Object[] objects : chungNhanDAOImpl.listLoaiByMaCB("VN280")) {
//				System.out.println("Loai may bay : " + objects[0]);
//			}
////			//14. Cho biết các chuyến bay có thể được thực hiện bởi máy bay Airbus A320.
//			System.out.println(" 14.Cho biet cac chuyen bay co the duoc thuc hien boi may bay Airbus A320.");
//			for (Object[] objects : chungNhanDAOImpl.listChuyenBayByLoai("Airbus A320")) {
//				System.out.println("Ma chuyen bay: " + objects[0] + ", Ga di: " + objects[1] + ", Ga den: " + objects[2]
//						+ ", Do dai: " + objects[3] + ", Gio di: " + objects[4] + ", Gio den: " + objects[5]
//						+ ", Chi phi: " + objects[6]);
//			}
			
//			//15. Cho biết tên của các phi công lái máy bay Boeing.
//			System.out.println("15.	Cho biet ten cua cac phi cong lai may bay Boeing.");
//			for (Object[] objects : chungNhanDAOImpl.listTenNVByLoai("Boeing")) {
//				System.out.println("Ten phi cong : " + objects[0]);
//			}
//			//16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
//			System.out.println(" 16.Voi moi loai may bay co phi cong lai cho biet ma so, loai may bay va tong so phi cong co the lai loai may bay do.");
//			for (Object[] objects : chungNhanDAOImpl.listMayBayAndCountNV()) {
//				System.out.println("Ma may bay: " + objects[0] + ", Loai: " + objects[1] + ", Tong so phi cong co the lai: " + objects[2]);
//			}
//			// 17.	Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các đường bay nào có thể đáp ứng yêu cầu này.
//			System.out.println("17.Gia su mot hanh khach muon di thang tu ga A den ga B roi quay tro ve ga A. Cho biet cac duong bay nao co the dap ung yeu cau nay.");
//			System.out.println((chuyenBayDAOImpl.listABA()));
//			// 18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga đó.
//			System.out.println("18.Voi moi ga co chuyen bay xuat phat tu do cho biet co bao nhieu chuyen bay khoi hanh tu ga do.");
//			for (Object[] objects : chuyenBayDAOImpl.listGroupGaDi()) {
//				System.out.println("Ga di: " + objects[0] + ", So luong chuyen khoi hanh: " + objects[1]);
//			}
//			//19. Với mỗi ga có chuyến  bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các chuyến bay khởi hành từ ga đó.
//			System.out.println("19.Voi moi ga co chuyen  bay xuat phat tu do cho biet tong chi phi phai tra cho phi cong lai cac chuyen bay khoi hanh tu ga do.");
//			for (Object[] objects : chuyenBayDAOImpl.listSumChiPhi()) {
//				System.out.println("Ga di: " + objects[0] + ", Tong chi phi: " + objects[1]);
//			}
//			// 20.	Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00 ??? 12pm or 12am
			System.out.println(" 20.Cho biet danh sach cac chuyen bay co the khoi hanh truoc 12:00 ??? 12pm or 12am.");
			System.out.println((chuyenBayDAOImpl.list1200()));
			
//			// 21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
			System.out.println(" 21.Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.");
			for (Object[] objects : chuyenBayDAOImpl.list1200GroupGaDi()) {
				System.out.println("Ga đi: " + objects[0] + ", Số lượng chuyến khởi hành " + objects[1]);
			}
//			//22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
			System.out.println(" 22.	Cho biết mã số của các phi công chỉ lái được 3 loại máy bay");
			for (Object[] objects : chungNhanDAOImpl.listNVHavingMaMB3()) {
				System.out.println("Ma phi công: " + objects[0] );
			}
//			//23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.
			System.out.println(" 23.	Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn nhất của các loại máy bay mà phi công đó có thể lái.");
			for (Object[] objects : mayBayDAOImpl.listMaMBMAX3AndTamBay()) {
				System.out.println("Mã phi công: " + objects[0] + ", Tầm bay lớn nhất: " + objects[1]);
			}
//			//24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
			System.out.println("24.	Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.");
			for (Object[] objects : mayBayDAOImpl.listNVOfMayBay()) {
				System.out.println("Mã phi công: " + objects[0] + ", Tổng loại máy bay có thể lái: " + objects[1]);
			}
//			//25. Tìm các nhân viên không phải là phi công.
			System.out.println(" 25.	Tìm các nhân viên không phải là phi công.");
			for (Object[] objects : nhanVienDAOImpl.listNotPhiCong()) {
				System.out.println("Mã nhân viên: " + objects[0] + ", Tên: " + objects[1] + ", Lương: " + objects[2]);
			}
//			//26. Cho biết mã số của các nhân viên có lương cao nhất.
			System.out.println(" 26.	Cho biết mã số của các nhân viên có lương cao nhất.");
			for (Object[] objects : nhanVienDAOImpl.listLuongMax()) {
				System.out.println("Mã NV có lương cao nhất là: " + objects[0]);
			}
//			//27. Cho biết tổng số lương phải trả cho các phi công.
			System.out.println("27.	Cho biết tổng số lương phải trả cho các phi công.");
			System.out.println(("Tổng lương phải trả cho phi công là: " + nhanVienDAOImpl.sumLuongNV()));
//			//28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing.
			System.out.println("28.	Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing.");
			for (Object[] objects : chuyenBayDAOImpl.listMaxTamBayOfBoeing("Boeing")) {
				System.out.println("Mã chuyến bay: " + objects[0] + ", Ga đi: " + objects[1] + ", Ga đến: " + objects[2]+ ", Độ dài: " + objects[3]+ ", Giờ đi: " + objects[4]+ ", Giờ đến: " + objects[5]+ ", Chi phí: " + objects[6]);
			}
			
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
	}

}
