package xiaoxian.work.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xiaoxian.work.demo.domain.Student;
import xiaoxian.work.demo.service.StudentService;
import java.util.List;

/**
 * @author xiaoxian
 * @create by 2020-06-01
 */
@Controller
public class StudentController {


    @Autowired
    private StudentService studentService;

    /***
     * 插入学生页面
     * @return
     */
    @RequestMapping("/insertPage")
    public String index(){
        return "insertPage";
    }


    /***
     * 学生列表信息
     * @param model
     * @return
     */
    @RequestMapping("/userList")
    public String userList(Model model){
        List<Student> students = studentService.getAllStudents();
        List<Student> szStudent = studentService.getSZStudents();
        List<Student> gzStudent = studentService.getGZStudents();
        List<Student> stStudent = studentService.getSTStudents();
        model.addAttribute("sz_students", szStudent);
        model.addAttribute("gz_students", gzStudent);
        model.addAttribute("st_students", stStudent);
        return "userList";
    }

    /***
     * 插入学生信息
     * @param student
     * @return
     */
    @RequestMapping("/insert")
    public String save(Student student){
        studentService.addStudent(student);
        return "redirect:/userList";
    }

    /***
     * 删除学生信息
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        studentService.deleteStudent(id);
        return "redirect:/userList";
    }

    /***
     * 更新学生信息页面
     * @param model
     * @param studentId
     * @return
     */
    @GetMapping("/updatePage/{studentId}")
    public String updatePage(Model model,@PathVariable Long studentId){
        Student student = studentService.getStudent(studentId);
        model.addAttribute("student",student);
        return "updatePage";
    }

    /***
     * 更新学生信息
     * @param student
     * @return
     */
    @PostMapping("/update")
    public String updateUser(Student student){
        studentService.updateStudent(student);
        System.out.println("修改的用户为 ： " + student.getName());
        return "redirect:/userList";
    }

    /****
     * 查询学生信息页面
     * @param search
     * @return
     */
    @PostMapping("/studentList")
    public String searchStudent(String search){
        studentService.getStudent(search);
        return "redirect:/studentList";
    }
}
