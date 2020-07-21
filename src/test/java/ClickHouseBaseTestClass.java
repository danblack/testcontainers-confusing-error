import org.junit.jupiter.api.Test;
import org.testcontainers.containers.FixedHostPortGenericContainer;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.wait.strategy.Wait;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
public class ClickHouseBaseTestClass {

    @Container
    protected static GenericContainer clickHouseContainer =
            new FixedHostPortGenericContainer("yandex/clickhouse-server:latest")
                    .withExposedPorts(8123)
                    .waitingFor(Wait.forListeningPort());

    @Test
    void shouldExecute() {

    }

}
