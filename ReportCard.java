/**
 * <p>Title: ReportCard</p>
 * <p>
 * <p>Description: A structure creation of a ReportCard Java Class which would allow a school to store a student's grades for a particular year.</p>
 * <p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>
 * <p>Company:For Android Google Nanodegree Programme (Scholarship) in Udacity e-learning platform </p>
 *
 * @author Nikolaidou Dimitra Christina (Ioli)
 * @version 1.0 (7/5/2017)
 */

import java.lang.Math; 
import java.util.Arrays;

// one class needs to have a main() method
public class ReportCard {
    // Int Grades of each lesson from one(1) to ten(10)
    private int mGradeInts[];

    // Lessons the student has taken
    private String mLessons[];

    // Student name
    private String mStudent;

    // School name. A constant that will never change for all students 
    private static final String SCHOOL_NAME = "CS School";

    /*
     * Create a new ReportCard object.
     *
     * @param gradeInts is an one to ten grade for a lesson
     * @param lessonsr is the lesson
     * @param student is the student to which refere the lesson and grade
     * */
    public ReportCard(int[] gradeInts, String[] lessons, String student) {
        this.mGradeInts = gradeInts;
        this.mLessons = lessons;
        this.mStudent = student;
    }

    // Get the grade of the student
    public int[] getGradeInts() {
        return mGradeInts;
    }

    // set this int on the mGradeInts of ReportCard
    public void setGradeInts(int[] gradeInts) {
        this.mGradeInts = gradeInts;
    }

    // Get the lesson of the student
    public String[] getLessons() {
        return mLessons;
    }

    // set this string on the mLessons of ReportCard
    public void setLessons(String[] lessons) {
        this.mLessons = lessons;
    }

    // Get the student
    public String getStudent() {
        return mStudent;
    }

    // set this string on the mStudent of ReportCard
    public void setStudent(String student) {
        this.mStudent = student;
    }

    // As rubric says to use a toString() method
    public String toString() {
        return "School: " + SCHOOL_NAME + "\n"
                + "Student: " + mStudent + "\n"
                + "Lessons: " + Arrays.toString(mLessons) + " " + "Grade: " + Arrays.toString(mGradeInts);
    }
}


