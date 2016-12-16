package com.cloudage.membercenter.service;

import org.springframework.data.domain.Page;

import com.cloudage.membercenter.entity.Comment;

public interface ICommentService {

	Comment save(Comment comment);

	Page<Comment> findCommentsOfArticle(int article_id, int i);

}
