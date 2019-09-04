
package Archivo;

import funciones.clsEstadistica;
import funciones.mdalumno;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class clsarchivo {
    public  List<mdalumno> leer(){
     File archivo = null;
     FileReader fr = null;
     BufferedReader br = null;
     List<mdalumno> alumno = new ArrayList();

try{
  
    archivo = new File ("C:\\Users\\mario\\Downloads\\archivo.csv");
    fr = new FileReader (archivo);
    br = new BufferedReader(fr);
    clsEstadistica calcula;
    double mediana, media,rango, desviacion;
    int moda;

    String linea;
         while((linea=br.readLine())!=null){
            mdalumno al = new mdalumno(); 
            String[] dts = linea.split(",");
            int[] arr = new int[dts.length];
               
               for(int i = 4; i<dts.length;i++) {
                   try {
                   arr[i] = Integer.parseInt(dts[i]);
                    } 
                   catch (NumberFormatException nfe) {
                     System.out.print(nfe.getMessage());
                   }          
               }
       calcula = new clsEstadistica(arr);
       al.setCarne(dts[0]);
       al.setId(dts[1]);
       al.setCorreo(dts[2]);
        al.setNombre(dts[3]);
       mediana = calcula.mediana();
        al.setMediana(mediana);
       desviacion = calcula.desviacion();
        al.setDesviacion(desviacion);
       moda = calcula.moda();
        al.setModa(moda);
       rango = calcula.rango();
        al.setRango(rango);
       media = calcula.promedio();
        al.setRango(media);
       
        alumno.add(al);
         }        
      }
      catch(IOException e){System.out.print(e.getMessage());
          
      }finally{
        
         try{                    
            if( null != fr ){   
               fr.close();  
               br.close();
            }                  
         }catch (IOException e2){ 
         }
      }

  return alumno;
}  
    public void escribir(List<mdalumno> datos){
       try{
        File archivo = new File("C:\\Users\\mario\\Desktop\\archivo.txt");
        FileWriter fw = new FileWriter(archivo); 
        BufferedWriter bw = new BufferedWriter(fw);
   
        for(mdalumno e: datos){
            bw.write(e.getCarne());
            bw.newLine();
            bw.write(e.getId());
            bw.newLine();
            bw.write(e.getCorreo());
            bw.newLine();
            bw.write(e.getNombre());
            bw.newLine();
            bw.write(Double.toString(e.getMediana()));
            bw.newLine();
            
        }
         bw.close();
         fw.close();
           }
          catch(IOException e){
              System.out.println("Algo a salido mal");
              }
      
       }
}
