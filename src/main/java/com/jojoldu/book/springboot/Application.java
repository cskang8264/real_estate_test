package com.jojoldu.book.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링 부트의 자동설정, 스프링 Bean 읽기,생성 자동설정, @SpringBootApplication이 있는 위치부터 설정을 읽어감, 프로젝트 최상단위치
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); //내장 tomcat 실행
    }
}
