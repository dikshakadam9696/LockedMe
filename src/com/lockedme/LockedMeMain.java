package com.lockedme;

public class LockedMeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockedMe", "Diksha Kadam");
		
		HandleOptions.handleWelcomeScreenInput();
	  }
   }


