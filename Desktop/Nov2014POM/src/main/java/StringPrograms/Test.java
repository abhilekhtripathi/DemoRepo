package StringPrograms;

import java.util.Arrays;
import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) {
		String [] strarr = {"App", "Selenium" , "Samsung"};
		
		System.out.println("the oroginal array is:" + Arrays.toString(strarr));
		
		for (int i = 0; i < strarr.length/2; i++) {
			String temp = strarr[i];
			strarr[i]= strarr[strarr.length-1-i];
			strarr[strarr.length-1-i]=temp;
		} 
		
		System.out.println("the reverse array is:"+ Arrays.toString(strarr));
	}
}
