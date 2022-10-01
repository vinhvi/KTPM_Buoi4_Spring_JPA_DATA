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
			System.out.println(" 1. Cho biet cac chuyến bay di Da Lat (DAD).");
			System.out.println((chuyenBayDAOImpl.listChuyenBayDAD("DAD")));
			// 2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km
			System.out.println(" 2. Cho biet cac loai may bay co tam bay lon hon 10,000km.");
			System.out.println((mayBayDAOImpl.listTamBay10000(10000)));
		});
	}

	public static void main(String[] args) {
		SpringApplication.run(DataJpaApplication.class, args);
	}

}
