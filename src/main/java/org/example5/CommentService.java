package org.example5;

import org.example4.CommentServiceSecond;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentServiceSecond.class.getName());

    public String publishComment(Comment comment){
        logger.info("Publishing comment = " + comment.getText());
        return "SUCCESS";
    }

}
