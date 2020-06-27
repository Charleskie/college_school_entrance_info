package xiaoxian.work.demo.mapper;
import org.apache.ibatis.annotations.*;
import xiaoxian.work.demo.domain.Student;

import java.util.List;

/***
 * @Author xiaoxian
 * @Date 2020-06-01
 */
@Mapper
public interface StudentDao {
    String TABLE = "student";
    String SELECT_FIELDS = "id, student_id as studentId, name as name, age as age, gender as gender, " +
            "high_school_name as highSchoolName, chinese_score as chineseScore, " +
            "math_score as mathScore, english_score as englishScore, history_score as historyScore, " +
            "geography_score as geographyScore, physics_score as physicsScore, art_score as artScore, sum, area";
    String INSERT_FIELDS = "(student_id, name, age, gender, high_school_name, chinese_score, " +
            "math_score, english_score, history_score, geography_score, physics_score, art_score, area, sum)";

    /***
     * 查询所有学生信息
     * @return
     */
    @Select("select " + SELECT_FIELDS + " from " + TABLE +" order by sum desc")
    List<Student> getAllStudentsInfo();

    /***
     * 查询所有学生信息
     * @return
     */
    @Select("select " + SELECT_FIELDS + " from " + TABLE +" where name=#{name} order by sum desc")
    Student getStudent(String name);

    /***
     * 通过学号更新学生信息
     * @param student
     */
    @Update("update " + TABLE + " set  age=#{age}, high_school_name=#{highSchoolName}," +
            "chinese_score=#{chineseScore}, math_score=#{mathScore}, english_score=#{englishScore}, history_score=#{historyScore}, " +
            "geography_score=#{geographyScore}, physics_score=#{physicsScore}, art_score=#{artScore}, area=#{area}, sum=#{sum} where student_id=#{studentId}")
    void updateStudent(Student student);

    /***
     * 查询所有学生信息
     * @return
     */
    @Select("select " + SELECT_FIELDS + " from " + TABLE + " where area='深圳' order by sum desc")
    List<Student> getSZStudents();

    /***
     * 查询所有学生信息
     * @return
     */
    @Select("select " + SELECT_FIELDS + " from " + TABLE+ " where area='广州' order by sum desc")
    List<Student> getGZStudents();

    /***
     * 查询所有学生信息
     * @return
     */
    @Select("select " + SELECT_FIELDS + " from " + TABLE+ " where area='汕头' order by sum desc")
    List<Student> getSTStudents();

    /***
     * 插入学生信息
     * @param student
     * @return
     */
    @Insert("insert into " + TABLE + INSERT_FIELDS + " value(#{studentId}, #{name}, #{age}, #{gender}, #{highSchoolName}," +
            "#{chineseScore}, #{mathScore}, #{englishScore}, #{historyScore}, #{geographyScore}, #{physicsScore}, #{artScore}, #{area}, #{sum}) ")
    int addStudentInfo(Student student);

    /***
     * 通过id查询学生信息
     * @param StudentId
     * @return
     */
    @Select("select " + SELECT_FIELDS + " from " + TABLE +" where student_id=#{StudentId}")
    Student getStudentByStudentId(Long StudentId);


    /***
     * 通过学号删除学生信息
     * @param studentId
     */
    @Delete("delete from " + TABLE + " where student_id=#{studentId}")
    void deleteStudent(Long studentId);





}