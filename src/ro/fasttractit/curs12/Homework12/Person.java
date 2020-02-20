package ro.fasttractit.curs12.Homework12;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Person {
       private final List<String> name;
       private final int age;
       private final String hairColor;

    public Person(String name, int age, String hairColor) {
        this.name = Collections.singletonList(name);
        this.age = age;
        this.hairColor = hairColor;
    }
    public List<String> getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public java.lang.String getHairColor() {
        return hairColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(hairColor, person.hairColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, hairColor);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
