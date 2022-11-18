package utilities;

import java.io.FileInputStream;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;
    static {
        //path of the configuration file
        String path="configuration.properties";
        try {
            //Opening configuration.properties file using FileInputStream
            FileInputStream fileInputStream = new FileInputStream(path); //(bu filelari okumak icn javadan gelen metod)
            properties = new Properties();  //opening file
            properties.load(fileInputStream);  //loading file
            //close the file
            fileInputStream.close();   //closing file
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //This method will get the key from properties file,
    //And return the value as String
    //We create this method to read the file
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }

}