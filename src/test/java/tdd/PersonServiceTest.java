package tdd;

import entities.PersonService;
import org.junit.jupiter.api.DisplayName;
import service.IPersonService;

public class PersonServiceTest {

    @DisplayName("When Create a Person with Sucess Should Return a Person")
    void testCreatePerson_WhenSucess_ShouldReturnPersonObject() {

        // Given / Arrange
        IPersonService service =  new PersonService();

        // When / Act
        // Then / Assert

    }
}
