package com.jiangren.javaee.repositories;

import com.jiangren.javaee.models.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by seabookchen on 3/09/2017.
 */
interface InstructorRepository extends JpaRepository<Instructor, Long> {

}
