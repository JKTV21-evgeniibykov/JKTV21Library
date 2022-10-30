/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class DataManager {

    public void saveObjects(Object[] objects, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(objects);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "error no file", ex);
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "error input/output", ex);
        }
    }

    public Object loadObjects(String fileName) {
        Object objects = new Object[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            objects = objectInputStream.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "error no file", ex);
            objects = null;
        } catch (IOException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "error input/output", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, "eroor no class", ex);
        }
        return objects;
    }
    
}
