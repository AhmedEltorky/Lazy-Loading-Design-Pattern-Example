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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LazyLoadStudentData student01 = new LazyLoadStudentData();
        LazyLoadStudentData student02 = new LazyLoadStudentData();
        LazyLoadStudentData student03 = new LazyLoadStudentData();
        LazyLoadStudentData student04 = new LazyLoadStudentData();
        
        student03.getStudentData().setStudentId("03"); //creation
        student03.getStudentData().setStudentName("Ali");
        student03.getStudentData().setAddress("Cairo,Egypt");
    }
    
}
