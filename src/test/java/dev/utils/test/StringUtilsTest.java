package dev.utils.test;
import static org.junit.Assert.*;

import org.junit.Test;

import dev.utils.StringUtils;

public class StringUtilsTest {
	
	@Test
	public void levenshteinDistanceTest(){
		String chaines1[]= {"chat","machins","aviron","distance","Chien",""};
		String chaines2[]= {"chats","machine","avion","instance","Chine","chat"};
		int resultatsAttendus[]= {1,1,1,2,2,4};
		int resultatsTests[]= new int[chaines1.length];
		
		for(int i= 0; i< chaines1.length; i++){
			resultatsTests[i]= StringUtils.levenshteinDistance(chaines1[i], chaines2[i]);
			System.out.println(resultatsTests[i]);
		}
		
		assertArrayEquals(resultatsAttendus, resultatsTests);
	}
	
	@Test
	public void levenshteinDistanceTestAvecNull(){
		String chaines1[]= {null,null,"aviron"};
		String chaines2[]= {null,"machine",null};
		int resultatsAttendus[]= {0,7,6};
		int resultatsTests[]= new int[chaines1.length];
		
		for(int i= 0; i< chaines1.length; i++){
			resultatsTests[i]= StringUtils.levenshteinDistance(chaines1[i], chaines2[i]);
			System.out.println(resultatsTests[i]);
		}
		
		assertArrayEquals(resultatsAttendus, resultatsTests);
	}
	
}
