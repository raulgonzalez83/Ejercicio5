package edu.upc.eetac.dsa.rgonzalez.Ejercicio5;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
	
	public int cuentaBytes(){
		int num=0;
		
		try {
			FileReader fr = new FileReader("/home/raul/imagen.jpg");
			BufferedReader br = new BufferedReader(fr);
			int aux = br.read();
			int count =-1;
			while(aux!=-1){
				aux = br.read();
				count++;
			}
			num = count;
			br.close();
			fr.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return num;
	}
	
	

}