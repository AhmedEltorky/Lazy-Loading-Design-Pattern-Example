package lazyloadingdesignpattern;

/**
 *
 * @author Ahmed El-Torky
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
