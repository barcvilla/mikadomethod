/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mikado.ui;

public class App {

	private UI ui;
	private static String storePath;

	public void launch() throws ApplicationException {
		ui = new UI();
		ui.showLogin();
	}

	public static String getStorageFile() {
		return storePath;
	}

	public static void setStorageFile(String storePath) {
		App.storePath = storePath;
	}

}
