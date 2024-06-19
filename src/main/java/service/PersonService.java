package service;

import entities.Person;
import service.IPersonService;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {
        return person;
    }
}
