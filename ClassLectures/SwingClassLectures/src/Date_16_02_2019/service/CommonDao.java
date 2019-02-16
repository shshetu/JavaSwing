/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date_16_02_2019.service;

import Date_16_02_2019.pojo.Student;
import java.util.List;

/**
 *
 * @author User
 */
public interface CommonDao {
    void save(Student obj);
    void update(Student obj);
    void delete(Student obj);
    void deleteById(int id);
    Student getById(int id);
    List<Student> findAll();
}
