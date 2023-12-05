package org.example4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfigure.class);

        var cs1 = context.getBean("commentServiceSecond", CommentServiceSecond.class);
        var cs2 = context.getBean("commentServiceSecond", CommentServiceSecond.class);

        boolean b1 = cs1 == cs2;
        System.out.println(b1); // False


        var cs3 = context.getBean(CommentService.class); // Lazy loading output
        var cs4 = context.getBean(CommentService.class);

        boolean b2 = cs3 == cs4;
        System.out.println(b2); // True




    }
}
