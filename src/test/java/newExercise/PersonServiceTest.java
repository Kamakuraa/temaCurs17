package newExercise;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    @Test
    @DisplayName("When")
    void getAllNames(){
        PersonService personService = new PersonService(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti"),
                new Person("Stefan", "Bulzan", 36, "Oradea"),
                new Person("Cristian", "Ion", 80, "Cluj"),
                new Person("Mihai", "Matulescu", 32, "Arad"),
                new Person("Dan", "Georgescu", 12, "Bucuresti")
        ));

        List<String> result = personService.getAllnames();

        Assertions.assertThat(result).isEqualTo(List.of(
                new Person("Alexandru", "Bratu", 36, "Bucuresti"),
                new Person("Stefan", "Bulzan", 36, "Oradea"),
                new Person("Cristian", "Ion", 80, "Cluj"),
                new Person("Mihai", "Matulescu", 32, "Arad"),
                new Person("Dan", "Georgescu", 12, "Bucuresti")
        ));
    }
}