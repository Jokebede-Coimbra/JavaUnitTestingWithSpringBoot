package tdd;

import entities.Person;
import service.PersonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.IPersonService;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    @DisplayName("When Create a Person with Sucess Should Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject() {

        // Given / Arrange
        IPersonService service = new PersonService();

        Person person = new Person("Jayanne", "Coimbra", "jay@gmail.com", "female", "EUA");

        // When / Act
        Person actual = service.createPerson(person);

        // Then / Assert
        assertNotNull(actual, () -> "The createPerson() should not have returned null!");

    }

    @DisplayName("When Create a Person with Sucess Should Contains FirstName in Returned  a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsFirstNameInReturnedPersonObject() {

        // Given / Arrange
        IPersonService service = new PersonService();

        Person person = new Person("Jayanne", "Coimbra", "jay@gmail.com", "female", "EUA");

        // When / Act
        Person actual = service.createPerson(person);

        // Then / Assert
        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FirstName is Different!");

    }
}
