package sut.se.g15.backend;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sut.se.g15.backend.Entity.*;
import sut.se.g15.backend.Repository.*;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class BackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
	@Bean
	ApplicationRunner init(UserRepository userRepository, UsertypeRepository usertypeRepository, GenderRepository genderRepository,
						   ProvinceRepository provinceRepository, AppointmentRepository appointmentRepository,TitleRepository titleRepository, CustomerRepository customerRepository,
							TypeRepository typeRepository, DentistDataRepository dentistDataRepository, HospitalRepository hospitalRepository,
						   ReserveRepository reserveRepository,RoomRepository roomRepository,QueueRepository queueRepository) {
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
			Stream.of("ถอนฟัน","อุดฟัน","ขูดหินปูน","จัดฟัน").forEach(nametype -> {
				Type t = new Type();
				t.setName(nametype);
				typeRepository.save(t);
			});
			//ploy
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
			//ta
			Customer c = new Customer();
			c.setFirstname("สมชาย");
			c.setLastname("สามารถ");
			c.setIdcard("1301500258496");

			Gender gendercus = genderRepository.findBygender("ชาย");
			Gender gender2cus = genderRepository.findBygender("หญิง");
			c.setGender(gendercus);
			c.setGender(gender2cus);

			Province provincecus = provinceRepository.findByname("ชลบุรี");
			c.setProvince(provincecus);

			Type type = typeRepository.findBynameType("อุดฟัน");
			c.setType(type);

			customerRepository.save(c);
			customerRepository.findAll().forEach(System.out::println);
			//new

			Gender gnew = new Gender();
			g.setGender("ชาย");
			Gender gnew2 = new Gender();
			g2.setGender("หญิง");
			genderRepository.save(gnew);
			genderRepository.save(gnew2);

			Hospital hos = new Hospital();
			hos.setName("รัฐบาล");
			Hospital hos1 = new Hospital();
			hos1.setName("เอกชน");

			hospitalRepository.save(hos);
			hospitalRepository.save(hos1);


			DentistData den = new DentistData();
			den.setFirstname("ทวี");
			den.setLastname("ฐินใหม่");
			den.setNumber("122311313131");

			Gender genderden = genderRepository.findBygender("ชาย");
			Gender genderden2 = genderRepository.findBygender("หญิง");
			den.setGender(genderden);
			den.setGender(genderden2);

			Type typeden = typeRepository.findBynameType("อุดฟัน");
			den.setType(typeden);


			Hospital hospital = hospitalRepository.findByhospital("รัฐบาล");
			Hospital hospital1 = hospitalRepository.findByhospital("เอกชน");

			den.setHospital(hospital);
			den.setHospital(hospital1);


			dentistDataRepository.save(den);
			dentistDataRepository.findAll().forEach(System.out::println);

			//toom

			Stream.of("101", "102", "103", "104").forEach(room -> {
				Room a = new Room();
				a.setRoomNumber(room);
				roomRepository.save(a);
			});

			Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10").forEach(queue -> {
				Queue q = new Queue();
				q.setQueueNumber(queue);
				queueRepository.save(q);
			});

			Stream.of("Johnny", "Johnwick", "Porn", "Micky").forEach(customer -> {
				Customer m = new Customer();
				m.setFirstname(customer);
				customerRepository.save(m);
			});

			Reserve r = new Reserve();

			Customer customer = customerRepository.findByfirstname("Porn");
			r.setCustomer(customer);


			Room room = roomRepository.findByroomNumber("101");
			r.setRoom(room);


			Queue queue = queueRepository.findByqueueNumber("4");
			r.setQueue(queue);

			reserveRepository.save(r);

			//mild
			Customer cm = new Customer();
			cm.setFirstname("ธวรรณพร");
			cm.setLastname("สามารถ");
			customerRepository.save(cm);

			Customer cm1 = new Customer();
			cm1.setFirstname("สหราช");
			cm1.setLastname("ดาศรี");
			customerRepository.save(cm1);

			DentistData d = new DentistData();
			d.setFirstname("ปัทมาภรณ์");
			d.setLastname("ทองขวัญ");
			d.setNumber("2-9453-3");
			dentistDataRepository.save(d);

			Appointment ap = new Appointment();
			ap.setDate(new Date());
			ap.setDentistData(d);
			ap.setCustomer(c);
			Type tm = typeRepository.findBynameType("จัดฟัน");
			ap.setType(tm);
			appointmentRepository.save(ap);
		};
	}
}
