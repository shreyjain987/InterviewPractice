package com.practice;

import java.io.File;

public class CaptureScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filePath;
		//Convert web driver object to TakeScreenshot
		TakeScreenshot scrnShot = ((TakeScreenshot) driver);
		
		//Call getScreenshotAs method to create image file
		File scrcPath = scrnShot.getScreenshotAs(OutputType.FILE);
		
		//Move image file to new destination
		File destPath = new File(filePath);
		
		//Copy file at destination
		FileUtils.copyFile(srcPath, destPath);
		
	}

}
