package main;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nanaz on 8/1/2015.
 */
@ManagedBean(name ="studentRegisteration")
@SessionScoped
public class StudentRegisteration implements Serializable {
    private List<StudentSpecification> students;
    private StudentSpecification student;
    private List<String> majors;




    @PostConstruct
    public void init(){
        student=new StudentSpecification();
        students=new ArrayList<StudentSpecification>();
        majors=new ArrayList<String>();
        majors.add("Materials Engineering");
        majors.add("software engineering");
        majors.add("civil engineering");
        majors.add("electrical engineering");
        majors.add("mathematics");
    }

    public void createNew() {
        if(students.contains(student)) {
            FacesMessage msg = new FacesMessage("Duplicated", "This student has already been added");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        else {
            students.add(student);
            student = new StudentSpecification();
        }
    }

    public List<String> getMajors() {
        return majors;
    }

    public StudentSpecification getStudent() {
        return student;
    }

    public List<StudentSpecification> getStudents() {
        return students;
    }

    public void reinit() {

        if(students.contains(student)) {
            FacesMessage msg = new FacesMessage("Duplicated", "This student has already been added");
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
        else {
            students.add(student);
            student = new StudentSpecification();
        }

    }

    public void setStudents(List<StudentSpecification> students) {
        this.students = students;
    }

    public void setStudent(StudentSpecification student) {
        this.student = student;
    }

    public void setMajors(List<String> majors) {
        this.majors = majors;
    }
}
