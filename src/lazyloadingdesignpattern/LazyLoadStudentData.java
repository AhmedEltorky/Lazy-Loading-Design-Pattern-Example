/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lazyloadingdesignpattern;

/**
 *
 * @author eng-torky
 */
public class LazyLoadStudentData {

    private StudentData studentData = null;

    public StudentData getStudentData() {
        if (studentData == null) {
            studentData = new StudentData();
            return studentData;
        } else {
            return studentData;
        }
    }

}
