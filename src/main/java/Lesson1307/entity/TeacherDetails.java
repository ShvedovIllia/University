package Lesson1307.entity;

import javax.persistence.*;

import lombok.*;

@Getter 
@Setter
@NoArgsConstructor

@Entity
@Table(name="teacher_details")

public class TeacherDetails extends BaseEntity{
	private String hobby;
	@Column(length=120)
	private String experience;
	
}
