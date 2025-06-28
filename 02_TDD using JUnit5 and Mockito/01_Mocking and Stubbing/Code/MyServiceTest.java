import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Step 1: Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Stub the getData() method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Step 3: Inject the mock into the service
        MyService service = new MyService(mockApi);

        // Step 4: Call the method and assert
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
