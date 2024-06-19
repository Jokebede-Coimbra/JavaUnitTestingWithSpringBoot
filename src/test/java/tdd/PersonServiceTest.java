package tdd;

import entities.Person;
import org.junit.jupiter.api.BeforeEach;
import service.PersonService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.IPersonService;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    Person person;

    @BeforeEach
    void setup() {
        person = new Person("Jayanne", "Coimbra", "jay@gmail.com", "female", "EUA");
    }

    @DisplayName("When Create a Person with Sucess Should Return a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject() {

        // Given / Arrange
        IPersonService service = new PersonService();

        // When / Act
        Person actual = service.createPerson(person);

        // Then / Assert
        assertNotNull(actual, () -> "The createPerson() should not have returned null!");

    }

    @DisplayName("When Create a Person with Sucess Should Contains Valid Fields in Returned  a Person Object")
    @Test
    void testCreatePerson_WhenSucess_ShouldContainsValidFieldsInReturnedPersonObject() {

        // Given / Arrange
        IPersonService service = new PersonService();

        // When / Act
        Person actual = service.createPerson(person);

        // Then / Assert
        assertNotNull(person.getId(), () -> "Person ID is Missing");
        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The FirstName is Incorrect!");
        assertEquals(person.getLastName(), actual.getLastName(), () -> "The LastName is Incorrect!");
        assertEquals(person.getAddress(), actual.getAddress(), () -> "The Address is Incorrect!");
        assertEquals(person.getEmail(), actual.getEmail(), () -> "The Email is Incorrect!");
        assertEquals(person.getGender(), actual.getGender(), () -> "The Gender is Incorrect!");

    }

}
