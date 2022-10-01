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
			//5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
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
			//9.Cho biết mã số của các phi công lái máy báy Boeing.
			System.out.println(" 9.	Cho biet ma so cua cac phi cong lai may bay Boeing.");
			List<Object[]> pr_list = new ArrayList<Object[]>();
			pr_list.addAll(chungNhanDAOImpl.listChuyenBayDenVaDi());
			for (Object[] objects : pr_list) {
			System.out.println("Ma so phi cong: " + objects[0]);
			}
//						}
//			//10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
			System.out.println("10.	Cho biet cac nhan vien co the lai may bay co ma so 747.");
			for (Object[] objects : chungNhanDAOImpl.listNV747()) {
				System.out.println("Ma nhan vien: " + objects[0] + ", Ma may bay: " + objects[1] + ", Ten: " + objects[2]
						+ ", Luong: " + objects[3]);
			}
//			//11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
			System.out.println("11.	Cho biet ma so cua cac loai may bay ma nhan vien co ho Nguyrn co the lai.");
			for (Object[] objects : chungNhanDAOImpl.listMaMBOfNguyen("Nguyen")) {
				System.out.println("Ma may bay la: " + objects[0]);
			}
//			
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
	}

}
