

public class Student {
    private int iDNumber;
    private int score;

    public Student()
    {
        iDNumber = (int) (Math.random() * ((1000) + 1));
        score = (int) (Math.random() * ((100) + 1));
    }

    public Student(Student A)
    {
        this.iDNumber=A.getiDNumber();
        this.score=A.getScore();
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setFirstName(String nextLine) {
    }

    public void setSecondName(String nextLine) {
    }

    public void setSpecialization(String nextLine) {
    }

    public void setGroup(short nextShort) {
    }

    public void setCourse(byte nextByte) {
    }

    public void setScore(double nextDouble) {
    }

    public double getGroup() {
        return 0;
    }

    public double getCourse() {
        return 0;
    }
}
