/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import com.sleepycat.je.Environment;
import com.sleepycat.persist.EntityStore;
import java.io.File;

/**
 *
 * @author sheldon
 */
public class Connect {
    private static final File DATA_DIRECTORY = new File("./db");

    private Environment env;
    private EntityStore store;
    
    private void Connect(){
    DATA_DIRECTORY.mkdirs();
        String[] fileNames = DATA_DIRECTORY.list();
        if (fileNames != null) {
            for (String name : fileNames) {
                File file = new File(DATA_DIRECTORY, name);
                file.delete();
            }
        }
    }

}
