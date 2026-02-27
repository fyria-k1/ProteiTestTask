package TestTools.Helpers;

import java.io.InputStream;
import java.util.Properties;

public class TestProperties {

    private static final Properties props = new Properties();

    static {
        try (InputStream is = TestProperties.class.getClassLoader()
                .getResourceAsStream("testData.properties")) {
            if (is == null) {
                throw new RuntimeException("testData.properties not found");
            }
            props.load(is);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load testData.properties", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

    public static String validEmail()    { return get("auth.valid.email");    }
    public static String validPassword() { return get("auth.valid.password"); }
}
