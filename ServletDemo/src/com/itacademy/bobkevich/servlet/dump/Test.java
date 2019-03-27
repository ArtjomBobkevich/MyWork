//package com.itacademy.bobkevich.servlet.dump;
//
//import com.itacademy.bobkevich.servlet.entity.Resource;
//
//import java.util.Optional;
//
//public class BookDaoTest {
//
//    public static void main(String[] args) {
//    }
//
//    private static void testUpdate() {
//        Optional<Resource> resource = resourceDao.findAllCommentsAboutThisResource(2);
//        if (maybeBook.isPresent()) {
//            Book book = maybeBook.get();
//            book.setPages(999);
//            BookDao.getInstance().update(book);
//        }
//
//
//
//        BookDao.getInstance().findOne(5)
//                .map(it -> it.setPages(777))
//                .ifPresent(BookDao.getInstance()::update);
//    }
