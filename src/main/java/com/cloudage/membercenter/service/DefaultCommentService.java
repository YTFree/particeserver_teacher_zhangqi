package com.cloudage.membercenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudage.membercenter.entity.Comment;
import com.cloudage.membercenter.repository.ICommentRepository;

@Component
@Service
@Transactional

public class DefaultCommentService implements ICommentService{
	
	
	@Autowired
	ICommentRepository commentRepo;
	public Page<Comment> findCommentsOfArticle(int articleId,int Page){
		Sort sort =new Sort(Direction.DESC,"createDate");
		PageRequest pageRequest =new PageRequest(Page, 10, sort);
		return commentRepo.findAllOfArticleId(articleId, pageRequest);
	}
	
	
	@Override
	public Comment save(Comment comment){
		return commentRepo.save(comment);
	}
}
