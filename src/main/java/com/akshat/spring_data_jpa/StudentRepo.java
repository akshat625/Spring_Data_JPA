package com.akshat.spring_data_jpa;

import com.akshat.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    //JpaRepository is an interface that extends the PagingAndSortingRepository interface.
    // It provides all the methods to perform basic operations like save, update, delete, etc.

    //jpql query
    //JPQL is a query language that is used to perform database operations in JPA.
    //It is similar to SQL, but it uses the entity classes and their fields instead of the tables and columns.
    //It is used to perform database operations on the entities.



//    @Query("select s from Student s where s.name = ?1")
    //?1 is a positional parameter. It is used to pass the value of the first parameter to the query.

    //Why it is working without @Query?
    //Spring Data JPA provides a set of query methods that can be used to perform database operations.
    //These query methods are derived from the method name and the parameters of the method.
    //Spring Data JPA uses the method name to create a query based on the entity class and the field names.
    //It automatically generates the query based on the method name and the parameters of the method.
    List<Student> findByName(String name);

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThanEqual(int marks);
}
