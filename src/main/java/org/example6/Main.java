package org.example6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfigure.class);

        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setAuthor("Evgeniy");
        comment.setText("Demo text");

        service.publishComment(comment);
        service.deleteComment(comment);

    }
}
