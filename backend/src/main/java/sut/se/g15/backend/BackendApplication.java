package sut.se.g15.backend;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sut.se.g15.backend.Entity.*;
import sut.se.g15.backend.Repository.*;

import java.util.stream.Stream;

@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	ApplicationRunner init(UserRepository userRepository, UsertypeRepository usertypeRepository, GenderRepository genderRepository,
						   ProvinceRepository provinceRepository, TitleRepository titleRepository) {
		return args -> {
			Stream.of("กรุงเทพมหานคร","กระบี่","กาญจนบุรี","กาฬสินธุ์","กำแพงเพชร","ขอนแก่น","จันทบุรี","ฉะเชิงเทรา","ชลบุรี","ชัยนาท"
					,"ชัยภูมิ","ชุมพร","เชียงราย","เชียงใหม่","ตรัง","ตราด","ตาก","นครนายก","นครปฐม","นครพนม","นครราชสีมา","นครศรีธรรมราช"
					,"นครสวรรค์","นนทบุรี","นราธิวาส","น่าน","บึงกาฬ","บุรีรัมย์","ปทุมธานี","ประจวบคีรีขันธ์","ปราจีนบุรี","ปัตตานี","พระนครศรีอยุธยา"
					,"พังงา","พัทลุง","พิจิตร","พิษณุโลก","เพชรบุรี","เพชรบูรณ์","แพร่","พะเยา","ภูเก็ต","มหาสารคาม","มุกดาหาร","แม่ฮ่องสอน"
					,"ยะลา","ยโสธร","ร้อยเอ็ด","ระนอง","ระยอง","ราชบุรี","ลพบุรี","ลำปาง","ลำพูน","เลย","ศรีสะเกษ","สกลนคร","สงขลา","สตูล"
					,"สมุทรปราการ","สมุทรสงคราม","สมุทรสาคร","สระแก้ว","สระบุรี","สิงห์บุรี","สุโขทัย","สุพรรณบุรี","สุราษฎร์ธานี","สุรินทร์","หนองคาย"
					,"หนองบัวลำภู","อ่างทอง","อุดรธานี","อุทัยธานี","อุตรดิตถ์","อุบลราชธานี","อำนาจเจริญ").forEach(provinces -> {
				Province p = new Province();
				p.setName(provinces);
				provinceRepository.save(p);
			});

			Usertype usertype = new Usertype();
			usertype.setType("admin");
			usertypeRepository.save(usertype);

			Usertype usertype2 = new Usertype();
			usertype2.setType("employee");
			usertypeRepository.save(usertype2);

			Gender g = new Gender();
			g.setGender("ชาย");
			Gender g2 = new Gender();
			g2.setGender("หญิง");
			genderRepository.save(g);
			genderRepository.save(g2);

			Title t = new Title();
			t.setName("นาย");
			Title t1 = new Title();
			t1.setName("นาง");
			Title t2 = new Title();
			t2.setName("นางสาว");
			titleRepository.save(t);
			titleRepository.save(t1);
			titleRepository.save(t2);

			User em = new User();
			em.setFirstname("ธวรรณพร");
			em.setLastname("สามารถ");
			em.setAge(21);
			em.setPhone("0917239098");
			em.setIdcard("1200100657729");
			em.setEmail("ploythwp@gmail.com");
			em.setPassword("1234");
			Usertype ut = usertypeRepository.findBytype("admin");
			em.setType(ut);


			Gender gender = genderRepository.findBygender("ชาย");
			Gender gender2 = genderRepository.findBygender("หญิง");
			em.setGender(gender);
			em.setGender(gender2);

			Title title = titleRepository.findByname("นาย");
			Title title1 = titleRepository.findByname("นาง");
			Title title2 = titleRepository.findByname("นางสาว");
			em.setTitle(title);
			em.setTitle(title1);
			em.setTitle(title2);

			Province province = provinceRepository.findByname("ชลบุรี");
			em.setProvince(province);

			userRepository.save(em);
			userRepository.findAll().forEach(System.out::println);

		};
	}
}
