package com.cloudage.membercenter.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cloudage.membercenter.entity.Likes;


public interface ILikeRepository extends PagingAndSortingRepository<Likes, Likes.Key>{

	@Query("select count(*) from Likes likes where likes.id.article.id = ?1")
	int likeCountsOfArticle(int articleId);
	
	
	@Query("select count(*) from Likes likes where likes.id.user.id=?1 and likes.id.article.id = ?2")
	int checkLikesExsists(int authorId,int articleId);
	

}
