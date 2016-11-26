package sample;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by Nebo on 21.11.2016.
 */
public class Person {

    private SimpleStringProperty name = new SimpleStringProperty("");
    private SimpleStringProperty tel = new SimpleStringProperty("");

    public Person() {}

    public Person(String name, String tel) {
        this.name = new SimpleStringProperty(name);
        this.tel = new SimpleStringProperty(tel);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getTel() {
        return tel.get();
    }

    public void setTel(String tel) {
        this.tel.set(tel);
    }

    public SimpleStringProperty propertyName() {return name;}
    public SimpleStringProperty propertyTel() {return tel;}
}
