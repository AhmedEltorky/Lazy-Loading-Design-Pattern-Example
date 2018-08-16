package lazyloadingdesignpattern;

/**
 *
 * @author Ahmed El-Torky
 */
public class Test {

    public static void main(String[] args) {
        LazyLoadStudentData student01 = new LazyLoadStudentData();
        LazyLoadStudentData student02 = new LazyLoadStudentData();
        LazyLoadStudentData student03 = new LazyLoadStudentData();
        LazyLoadStudentData student04 = new LazyLoadStudentData();

        student03.getStudentData().setStudentId("03"); //creation
        student03.getStudentData().setStudentName("Ali");
        student03.getStudentData().setAddress("Cairo,Egypt");
        student03.getStudentData().setAge(12);
        
        System.out.println("- the student:" + student03.getStudentData().getStudentName() + " has " + student03.getStudentData().getAge() + " years old.");
    }

}
