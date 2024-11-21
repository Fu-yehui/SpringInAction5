package entity;

import org.springframework.stereotype.Component;


public class Employee {
    private Person person;
    private Position position;

    public Employee() {
        this.person = null;
        this.position=null;
    }

    public Employee(Person person, Position position) {
        this.person = person;
        this.position = position;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person +
                ", position=" + position +
                '}';
    }
}
