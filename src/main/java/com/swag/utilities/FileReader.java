package com.swag.utilities;

import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;

public class FileReader {


    public String readIniFile (String filepath, String sectionName, String key) throws IOException {
        Wini ini = new Wini(new File(filepath));
        String value = ini.get(sectionName, key, String.class);
        return value;
    }
}
