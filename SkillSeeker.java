package org.example.demo4;
import java.util.ArrayList;
import java.util.List;
class SkillSeeker extends User {
    private List<String> coursesApplied;

    public SkillSeeker(String username, String password) {
        super(username, password);
        this.coursesApplied = new ArrayList<>();
    }

    public SkillSeeker(String username, String password, List<String> coursesApplied) {
        super(username, password);
        this.coursesApplied = coursesApplied;
    }
    public List<String> getCoursesApplied() {
        return coursesApplied;
    }
    public void applyForCourse(String courseName) {
        if (!coursesApplied.contains(courseName)) {
            coursesApplied.add(courseName);
        }
    }
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(username).append("|").append(password).append("|");
        sb.append(String.join(",", coursesApplied));
        return sb.toString();
    }
    public String getUsername() {
        return null;
    }
}
