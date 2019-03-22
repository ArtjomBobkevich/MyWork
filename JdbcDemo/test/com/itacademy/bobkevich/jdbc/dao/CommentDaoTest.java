package com.itacademy.bobkevich.jdbc.dao;

import com.itacademy.bobkevich.jdbc.entity.Category;
import com.itacademy.bobkevich.jdbc.entity.Comment;
import com.itacademy.bobkevich.jdbc.entity.Person;
import com.itacademy.bobkevich.jdbc.entity.Resource;
import com.itacademy.bobkevich.jdbc.entity.TypeFile;
import com.itacademy.bobkevich.jdbc.util.ResourceCategory;
import com.itacademy.bobkevich.jdbc.util.ResourceType;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class CommentDaoTest {

    private CommentDao commentDao=CommentDao.getCommentDao();

    @Test
    public void checkSave () {
        Comment comment=CommentDao.getCommentDao().commentSave(Comment.builder()
                .resource_id(Resource.builder()
                        .id(2)
                        .resourceName("Avatar")
                        .typeFile(TypeFile.builder()
                                .id(ResourceType.FILM)
                                .build())
                        .category(Category.builder()
                                .id(ResourceCategory.ENTERTAINMENT)
                                .build())
                        .person(Person.builder()
                                .login("beast")
                                .build())
                        .url("wwww.kinogo.net")
                        .size(1400)
                        .build())
                .text("Как я заманался писать этот метод++")
                .build());
        assertNotNull(comment.getId());
    }

    @Test
    public void checkFindOne () {
        Optional<Comment>comment=commentDao.commentFindOne(1);
        assertTrue(comment.isPresent());
    }

    @Test
    public void checkUpdate (){
        Comment updateComment =CommentDao.getCommentDao().commentUpdate(Comment.builder()
                .id(1)
                .resource_id(Resource.builder()
                        .resourceName("Рэмбо 22")
                        .typeFile(TypeFile.builder()
                                .id(ResourceType.FILM)
                                .build())
                        .category(Category.builder()
                                .id(ResourceCategory.ENTERTAINMENT)
                                .build())
                        .person(Person.builder()
                                .login("beast")
                                .build())
                        .url("www.habr.ru")
                        .size(222)
                        .build())
                .text("Как я заманался писать этот метод, update")
                .build());
        assertNotNull(updateComment.getId());
    }

    @Test
    public void checkDelite () {
        boolean delite = CommentDao.getCommentDao().commentDelite(1);
        assertTrue(delite);
    }
}