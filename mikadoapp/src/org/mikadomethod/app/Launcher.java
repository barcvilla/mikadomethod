/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mikadomethod.app;

import org.mikado.ui.App;
import org.mikado.ui.ApplicationException;
/**
 *
 * @author barcvilla
 */
public class Launcher 
{
    public static void main(String[] argv) {
        try
        {
            /**
             * 1. Refactoring: Aqui tenemos una ubicacion hard-coded
             * queremos evitar la ruta hardcoded y conseguir esto pero sin romper el codido.
            
            App.setStorageFile("opt/local/app/db.txt");
            */
            App.setStorageFile(argv[0]); //inicio de al app configurado via parametro command line.
            App app = new App();
            app.launch();
        }
        catch(ApplicationException ex)
        {
            System.err.println("Could not start the app");
            ex.printStackTrace();
        }
    }
}
