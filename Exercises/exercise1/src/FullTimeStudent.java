class FullTimeStudent extends Student {
    private int[] examScores = new int[2];

    public FullTimeStudent(String name) {
        super(name);
    }

    public void setExamScores(int exam1Score, int exam2Score) {
        this.examScores[0] = exam1Score;
        this.examScores[1] = exam2Score;
    }

    public int getExam1Score() {
        return examScores[0];
    }

    public int getExam2Score() {
        return examScores[1];
    }
}
