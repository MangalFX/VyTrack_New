package com.cydeo.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public static Properties properties = new Properties();

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("Config.properties");
            properties.load(fileInputStream);
            fileInputStream.close();

        }catch (IOException e){
            System.out.println("File not found with given path!!!");
            e.printStackTrace();

        }

    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);

    }

}
