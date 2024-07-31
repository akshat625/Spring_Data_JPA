package com.akshat.spring_data_jpa;

import com.akshat.spring_data_jpa.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        StudentRepo repo = context.getBean(StudentRepo.class);

//        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
//        Student s3 = context.getBean(Student.class);
//        s1.setId(1);
//        s1.setName("Akshat");
//        s1.setMarks(96);
//
        s2.setId(2);
        s2.setName("Aman");
        s2.setMarks(95);
//
//        s3.setId(3);
//        s3.setName("Ankit");
//        s3.setMarks(92);
//



//        repo.save(s1);
//        repo.save(s2);
//        repo.save(s3);

        //why it is returning Optional?
        //findById() method returns an Optional object. It is used to avoid NullPointerException.
        // It is a container object that may or may not contain a non-null value.
        // It is used to represent the value that is either present or absent.

//        Optional<Student> student = repo.findById(71);
//        System.out.println(student);
//
//
//        System.out.println(student.orElse(new Student()));
        System.out.println(repo.findByName("Akshat"));

        System.out.println(repo.findByMarks(92));

        System.out.println(repo.findByMarksGreaterThanEqual(95));

        //For updating the data in the database, we can use the save() method of the JpaRepository interface.
        //If the entity object already exists in the database, then it updates the data.

        //For deleting the data from the database, we can use the delete() method of the JpaRepository interface.

        repo.delete(s2);

        System.out.println(repo.findAll());



    }

}
