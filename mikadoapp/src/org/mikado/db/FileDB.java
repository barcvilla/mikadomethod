/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mikado.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author barcvilla
 */
public class FileDB implements Database
{

	private File file;
        
        // listing 2.7
        public FileDB(String storageFile)
        {
            file = new File(storageFile);
        }

	public List<String> load(String key) {
		try {
			ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
			Map<String, Serializable> data = (Map<String, Serializable>)stream.readObject();
			return (List<String>) data.get(key);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public void store(Map<String, Serializable> data) {
		try {
			FileOutputStream out = new FileOutputStream(file);
			ObjectOutputStream stream = new ObjectOutputStream(out);
			stream.writeObject(data);
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

/** este metodo es eliminado - listing 2.7
	public void setStore(String storageFile) {
		file = new File(storageFile);		
	}
*/
}
