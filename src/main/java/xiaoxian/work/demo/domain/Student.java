package xiaoxian.work.demo.domain;
import lombok.Data;

/***
 * @Author xiaoxian
 * @Date 2020-06-01
 */
@Data
public class Student {
    private Integer id;
    private Long studentId;
    private String name;
    private Integer age;
    private String gender;
    private String highSchoolName;
    private Integer chineseScore;
    private Integer mathScore;
    private Integer englishScore;
    private Integer historyScore;
    private Integer geographyScore;
    private Integer physicsScore;
    private Integer artScore;
    private Integer sum;
    private String area;

    public String getArea(){
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getSum(){
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public void setHighSchoolName(String highSchoolName) {
        this.highSchoolName = highSchoolName;
    }

    public Integer getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(Integer chineseScore) {
        this.chineseScore = chineseScore;
    }

    public Integer getMathScore() {
        return mathScore;
    }

    public void setMathScore(Integer mathScore) {
        this.mathScore = mathScore;
    }

    public Integer getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(Integer englishScore) {
        this.englishScore = englishScore;
    }

    public Integer getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(Integer historyScore) {
        this.historyScore = historyScore;
    }

    public Integer getGeographyScore() {
        return geographyScore;
    }

    public void setGeographyScore(Integer geographyScore) {
        this.geographyScore = geographyScore;
    }

    public Integer getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(Integer physicsScore) {
        this.physicsScore = physicsScore;
    }

    public Integer getArtScore() {
        return artScore;
    }

    public void setArtScore(Integer artScore) {
        this.artScore = artScore;
    }
}