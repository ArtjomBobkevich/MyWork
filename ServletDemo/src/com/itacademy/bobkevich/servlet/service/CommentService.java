package com.itacademy.bobkevich.servlet.service;

import com.itacademy.bobkevich.servlet.dao.CommentDao;
import com.itacademy.bobkevich.servlet.entity.Comment;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Optional;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommentService {

    private static final CommentService COMMENT_SERVICE=new CommentService();

    public Comment commentSave(Comment comment) {
        return CommentDao.getCommentDao().commentSave(comment);
    }

    public Comment commentUpdate(Comment comment) {
        return CommentDao.getCommentDao().commentUpdate(comment);
    }

    public Optional<Comment> commentFindOne(Integer id) {
        return CommentDao.getCommentDao().commentFindOne(id);
    }

    public boolean commentDelite(Integer id) {
        return CommentDao.getCommentDao().commentDelite(id);
    }

    public static CommentService getCommentService() {
        return COMMENT_SERVICE;
    }
}
