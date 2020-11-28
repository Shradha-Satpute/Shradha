package com.capgemini.trainingsession.Lab10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo {

	  public static void main(String rr[])throws IOException
      {
             FileDetails fd=new FileDetails();
             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Enter file name");
             String s=br.readLine();
             fd.analyze(s);
      }
}
