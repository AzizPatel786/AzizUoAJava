package Lecture17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Course {
    private static final int MAX_TEACHERS_POSSIBLE = 3;
    private List<Teacher> _teachers;
    private String _name;
    private String _id;
    //- initializes the fields using parameter arguments
    //- constructor is expected to invoke Teacher's assign() method for
    //assigning this course to the teachers in the teachers array.
    //- carefully implement the association type and multiplicity constraints
    public Course(String name, String id, Teacher[] teachers) {
        _teachers = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (this._teachers.size() < MAX_TEACHERS_POSSIBLE) {
                this._teachers.add(teacher);
                teacher.assign(this);
            } else {
                break;
            }
        }
        this._name = name;
        this._id = id;
    }
    //- method to assign this course to a teacher
    //- method is expected to be invoked only by the test code
    //- this method must not alter the state of Teacher objects
    //- carefully implement the association type and multiplicity constraints
    public boolean assignTo(Teacher teacher) {
        if (_teachers.size() < MAX_TEACHERS_POSSIBLE && _teachers.size() >= 2 && _teachers.contains(teacher)){
            _teachers.add(teacher);
            return true;
        }
        return false;
    }
    public String getName() {
        return _name;
    }
    public String getID() {
        return _id;
    }
    public List<Teacher> getTeachers(){
        return _teachers;
    }
}
class Teacher {
    private static final int MAX_COURSES_POSSIBLE = 2;
    private List<Course> _courses;
    String _name;
    //- initializes the fields using parameter arguments
    //- constructor may alter the state of Course objects if required
    //- carefully implement the association type and multiplicity constraints
    public Teacher(String name) {
        this._name = name;
        _courses = new ArrayList<Course>();
        //ADD CODE
    }
    //- assigns a course to this teacher
    //- method is expected to be invoked both by the test code and Course constructor
    //- this method must not alter the state of Course objects
    //- carefully implement the association type and multiplicity constraints
    public boolean assign(Course course) {
        if (_courses.size() < MAX_COURSES_POSSIBLE) {
            _courses.add(course);
//            course.assignTo(this);
            return true;
        }
        return false;
    }

    public String getName() {
        return _name;
    }

    public List<Course> getCourses(){
        return _courses;
    }
}



public class UniversityManagementSoftware {
    public static void main(String[] args) {
        Teacher t[] = {new Teacher("Paramvir Singh"),new Teacher("Angela Chang"), new Teacher("Paul Denny"),new Teacher("Ewan Tempero")};
        Course s1 = new Course("Object-Oriented Software Development", "COMPSCI230", t);
        Course s2 = new Course("Introduction to Software Fundamentals", "COMPSCI130", t);
        Course s3= new Course("Principles of Programming", "COMPSCI101", t);
        Course s4= new Course("Software Development Methodologies", "COMPSCI235", t);
        for(Teacher teacher:t) {
            System.out.println(teacher.getName()+ " teaches... "+ teacher.getCourses().size()+" courses");
            for(Course course:teacher.getCourses()){
                System.out.println(course.getID()+ " " +course.getName());
            }
        }
    }
}
