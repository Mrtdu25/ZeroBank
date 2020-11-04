package com.zerobank.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties=new Properties();


    static {

        try {
            FileInputStream file=new FileInputStream("Configuration.properties");

            properties.load(file);
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No such a properties");
        }


    }



    public static String getProperties(String keyword){

        return properties.getProperty(keyword);

    }


}
