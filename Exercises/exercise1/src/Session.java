import java.util.ArrayList;
import java.util.Collections;

class Session {
    private ArrayList<Student> students;

    public Session() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printQuizScores() {
        for (Student student : students) {
            System.out.print(student.getName() + ": ");
            for (int score : student.quizScores) {
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }

    public void printPartTimeStudents() {
        System.out.print("Part-time students: ");
        for (Student student : students) {
            if (student instanceof PartTimeStudent) {
                System.out.print(student.getName() + " ");
            }
        }
        System.out.println();
    }

    public void printFullTimeStudentExamScores() {
        for (Student student : students) {
            if (student instanceof FullTimeStudent fullTimeStudent) {
                System.out.println(fullTimeStudent.getName() + " - Exam 1: " + fullTimeStudent.getExam1Score() + ", Exam 2: " + fullTimeStudent.getExam2Score());
            }
        }
    }

    public void printQuizScoresAscending() {
        ArrayList<Integer> allScores = new ArrayList<>();
        for (Student student : students) {
            allScores.addAll(student.quizScores);
        }
        Collections.sort(allScores);
        System.out.println("Quiz Scores in Ascending Order: " + allScores);
    }

    public double getAverageQuizScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageQuizScore();
        }
        return sum / students.size();
    }
}
