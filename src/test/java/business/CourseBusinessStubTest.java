package business;

import mockito.entities.CourseBusiness;
import mockito.services.CourseService;
import org.junit.jupiter.api.Test;
import service.stubs.CourseServiceStub;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseBusinessStubTest {

    @Test
    void testCoursesRelatedToSpring_When_UsingAStub() {

        // Given / Arrange
        CourseService stubService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubService);

        // When / Act
        var filteredCourses = business.retriveCoursesRelatedToSpring("Leandro");

        // Then / Assert
        assertEquals(4, filteredCourses.size());

    }
}
