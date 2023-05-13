package praktikum;

import org.junit.After;
import org.junit.Before;
import org.mockito.MockitoAnnotations;

/**
 * Базовый класс теста
 *
 * @author  smirnov sergey
 * @since   22.04.2023
 */
public class BaseTest {
    private AutoCloseable closeable;

    @Before
    public void openMocks() {
        closeable = MockitoAnnotations.openMocks(this);
    }

    @After
    public void releaseMocks() throws Exception {
        closeable.close();
    }
}