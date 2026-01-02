package org.example.demo4;

import java.util.ArrayList;
import java.util.List;

class SkillProvider extends User {
    private List<String> coursesOffered;

    public SkillProvider(String username, String password) {
        super(username, password);
        this.coursesOffered = new ArrayList<>();
    }
    public SkillProvider(String username, String password, List<String> courses) {
        super(username, password);
        this.coursesOffered = courses;
    }

    public List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void offerCourse(String courseName) {
        if (!coursesOffered.contains(courseName)) {
            coursesOffered.add(courseName);
        }
    }
    @Override
    public String serialize() {
        StringBuilder sb = new StringBuilder();
        sb.append(username).append("|").append(password).append("|");
        sb.append(String.join(",", coursesOffered));
        return sb.toString();
    }
}
