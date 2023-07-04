package bug;

import com.google.common.base.Optional;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationTest {

    @Test
    void name() {
        Optional<Object> absent = Optional.absent();
        assertThat(absent.toJavaUtil()).isEmpty();
    }
}
