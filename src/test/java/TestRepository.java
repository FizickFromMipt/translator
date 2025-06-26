import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import ru.pervnenko.model.City;
import ru.pervnenko.repository.CityRepository;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import(CityRepository.class)
public class TestRepository {
    @Autowired private CityRepository cityRepository;

    @Test
    void testRepository() {
        City found = cityRepository.findByRuName("Лондон");

        assertThat(found).isNotNull();
        assertThat(found.getEnName()).isEqualTo("London");
    }
}
