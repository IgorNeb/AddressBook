package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

/**
 * Created by Nebo on 22.11.2016.
 */
public class CollectionAdressBook implements AdressBook{

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);

    }

    @Override
    public void dell(Person person) {
        personList.remove(person);

    }

    @Override
    public void update(Person person) {

    }

    public ObservableList <Person> getPersonList(){
        return personList;
    }


    public void fillData(){
        personList.add(new Person("Andy", "45368463"));
        personList.add(new Person("Borry", "45368463"));
        personList.add(new Person("Tildy", "45368463"));
        personList.add(new Person("Billy", "45368463"));
        personList.add(new Person("Folk", "45368463"));
        personList.add(new Person("Andy", "45368463"));
        personList.add(new Person("Andy", "45368463"));
        personList.add(new Person("Andy", "45368463"));
        personList.add(new Person("Andy", "45368463"));
        personList.add(new Person("Andy", "45368463"));
        personList.add(new Person("Andy", "45368463"));
        personList.add(new Person("Andy", "45368463"));


    }
}
