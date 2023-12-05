package org.example4;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.beans.BeanDescriptor;

@Configuration
@ComponentScan(basePackages = "org.example4")
public class ProjectConfigure {

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public CommentServiceSecond commentServiceSecond(){
        return new CommentServiceSecond();
    }
}
