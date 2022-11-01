package irang.chapter2.ch24;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;
    private ArrayList<Subject> subjects = new ArrayList<>();
    private int totalScore;

    public Student(int studentId, String name) {
        this.studentName = name;
        this.studentId = studentId;
    }

    public void addSubject(String subjectName, int score) {
        subjects.add(new Subject(subjectName, score));
    }

    public void showStudentInfo() {
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("학생 " + studentName + "의 " + subjects.get(i).getSubjectName() + "과목 성적은 " + subjects.get(i).getScore() + "입니다.");
            totalScore += subjects.get(i).getScore();
        }
        System.out.println("학생 " + studentName + "의 총점은 " + totalScore + "입니다.");
    }
}
