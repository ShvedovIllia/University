package Lesson1307.entity;

import javax.persistence.*;

import lombok.*;

@Getter 
@Setter
@NoArgsConstructor

@Entity
@Table(name = "student")
public class Student extends BaseEntity{

	@Column(name = "full_name", nullable = false, length = 127)
	private String fullname;

	@Column(name = "email", unique = true, nullable = false, length = 127)
	private String email;

	@Column(name = "age", nullable = false, length = 3)
	private int age;

}
