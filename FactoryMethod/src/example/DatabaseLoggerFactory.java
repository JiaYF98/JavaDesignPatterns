package example;

public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
