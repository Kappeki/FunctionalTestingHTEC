package environment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigReader {

    private static String defaultFileName = "src/test/resources/env.properties";

    public static Map<String, Properties> config = new HashMap<>();

    public static void init(String fileName) {
        try(InputStream inputStream = new FileInputStream(fileName)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            config.put(fileName, properties);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
    }

    protected static String getValue(String key, String fileName) {
        if (config == null || !config.containsKey(fileName)) {
            init(fileName);
        }

        String value = config.get(fileName).getProperty(key);
        if (value != null) {
            return value;
        }

        return System.getenv(key);
    }

    protected static String getValue(String key) { return getValue(key, defaultFileName); }
}
