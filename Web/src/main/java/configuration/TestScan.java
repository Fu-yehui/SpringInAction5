package configuration;

import entity.Person;
import entity.Position;

public class TestScan {
    private Person person;
    private Position position;

    public TestScan() {
        this.person = null;
        this.position=null;
    }

    public TestScan(Person person, Position position) {
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
        return "TestScan{" +
                "person=" + person +
                ", position=" + position +
                '}';
    }
}