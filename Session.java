package org.example.demo4;

import java.util.List;

class Session {
    private User loggedInUser;

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public boolean login(String username, String password, List<SkillProvider> teachers, List<SkillSeeker> students) {
        for (SkillProvider sp : teachers) {
            if (sp.getUsername().equals(username) && sp.checkPassword(password)) {
                loggedInUser = sp;
                return true;
            }
        }
        for (SkillSeeker ss : students) {
            if (ss.getUsername().equals(username) && ss.checkPassword(password)) {
                loggedInUser = ss;
                return true;
            }
        }
        return false;
    }

    public void logout() {
        loggedInUser = null;
    }

    public boolean isLoggedIn() {
        return loggedInUser != null;
    }
}
