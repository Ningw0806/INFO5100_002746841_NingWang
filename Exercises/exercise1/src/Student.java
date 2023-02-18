import java.util.ArrayList;

class Student {
    protected String name;
    protected ArrayList<Integer> quizScores;

    public Student(String name) {
        this.name = name;
        quizScores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addQuizScore(int score) {
        quizScores.add(score);
    }

    public double getAverageQuizScore() {
        double sum = 0;
        for (int score : quizScores) {
            sum += score;
        }
        return sum / quizScores.size();
    }
}
