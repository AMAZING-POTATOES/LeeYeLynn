package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.sbb.answer.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);
}