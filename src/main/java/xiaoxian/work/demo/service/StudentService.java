package xiaoxian.work.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaoxian.work.demo.mapper.StudentDao;
import xiaoxian.work.demo.domain.Student;
import java.util.List;

/***
 * @Author xiaoxian
 * @Date 2020-06-01
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> getAllStudents(){
        List<Student> students = studentDao.getAllStudentsInfo();
        for(Student st: students){
            st.setSum(getSum(st));
        }
        return students;
    }

    public List<Student> getGZStudents(){
        List<Student> students = studentDao.getGZStudents();
        for(Student st: students){
            st.setSum(getSum(st));
        }
        return students;
    }

    public List<Student> getSTStudents(){
        List<Student> students = studentDao.getSTStudents();
        for(Student st: students){
            st.setSum(getSum(st));
        }
        return students;
    }

    public List<Student> getSZStudents(){
        List<Student> students = studentDao.getSZStudents();
        for(Student st: students){
            st.setSum(getSum(st));
        }
        return students;
    }

    public Student getStudent(Long studenId){
        Student student = studentDao.getStudentByStudentId(studenId);
        student.setSum(getSum(student));
        return student;
    }

    public Student getStudent(String name){
        Student student = studentDao.getStudent(name);
        return student;
    }

    public void addStudent(Student student){
        student.setSum(getSum(student));
        studentDao.addStudentInfo(student);
    }


    public void updateStudent(Student student){
        student.setSum(getSum(student));
        studentDao.updateStudent(student);
    }

    public void deleteStudent(Long studentId){
        studentDao.deleteStudent(studentId);
    }


    private int getSum(Student student){
        int sum;
        sum = student.getArtScore()+student.getChineseScore()+student.getEnglishScore()+student.getGeographyScore()+
                student.getHistoryScore()+student.getMathScore()+student.getPhysicsScore();
        return sum;
    }

}