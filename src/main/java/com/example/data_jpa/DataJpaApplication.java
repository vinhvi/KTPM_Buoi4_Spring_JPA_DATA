package com.example.data_jpa;

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
			System.out.println("3. Tim cac nhan vien có luong nho hon 10,000");
			System.out.println((mayBayDAOImpl.listLoaiBoeing("Boeing")));
//			// 4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
			System.out.println("4. Cho biet cac chuyen bay co đo dai duong bay nho hon 10.000km va lon hơn 8.000km.");
			System.out.println((chuyenBayDAOImpl.listChuyenBay10To8()));
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
	}

}
