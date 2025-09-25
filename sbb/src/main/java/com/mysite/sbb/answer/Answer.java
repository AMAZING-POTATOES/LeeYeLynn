package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import com.mysite.sbb.question.Question;

@Getter
@Setter
@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "TEXT")
	private String content;

	private LocalDateTime createDate;

	@OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
	private List<Answer> answerList;
}
