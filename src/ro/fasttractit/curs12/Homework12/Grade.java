package ro.fasttractit.curs12.Homework12;

import java.util.Objects;

public class Grade {
    private final String name;
    private final int grade;

    public Grade(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public int getGrade(){
        return grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grade grade1 = (Grade) o;
        return Objects.equals(name, grade1.name) &&
                Objects.equals(grade, grade1.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
