public class Main {
    public static void main(String[] args) {
        Session session = new Session();

        // Add 10 Part-time students with dummy quiz scores
        for (int i = 1; i <= 10; i++) {
            PartTimeStudent student = new PartTimeStudent("PTStudent" + i);
            for (int j = 1; j <= 15; j++) {
                student.addQuizScore((int) (Math.random() * 100));
            }
            session.addStudent(student);
        }

        // Add 10 Full-time students with dummy quiz and exam scores
        for (int i = 1; i <= 10; i++) {
            FullTimeStudent student = new FullTimeStudent("FTStudent" + i);
            for (int j = 1; j <= 15; j++) {
                student.addQuizScore((int) (Math.random() * 100));
            }
            student.setExamScores((int) (Math.random() * 100), (int) (Math.random() * 100));
            session.addStudent(student);
        }

        System.out.println("Quiz Scores:");
        session.printQuizScores();

        System.out.println("\nPart-time Students:");
        session.printPartTimeStudents();

        System.out.println("\nFull-time Student Exam Scores:");
        session.printFullTimeStudentExamScores();

        System.out.println("\nQuiz Scores in Ascending Order:");
        session.printQuizScoresAscending();

        System.out.println("\nAverage Quiz Score for the Session: " + session.getAverageQuizScore());
    }
}
