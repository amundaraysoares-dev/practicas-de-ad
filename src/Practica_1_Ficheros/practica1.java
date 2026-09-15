package Practica_1_Ficheros;
import java.io.File;
import java.io.IOException;


public class practica1 {

   public static String eDirectorio(String cadea){
       File archivo = new File(cadea);
       if(archivo.isDirectory()){
           return ("é directorio");
       }else{
           return ("non é directorio");
       }

   }

   public static String eFicheros(String cadea){
       File archivo = new File(cadea);
       if(archivo.isFile()){
           return ("é Ficheros");
       }else{
           return ("non é Ficheros");
       }


   }
    public static String creaDirectorio(String ruta) {
        File directorio = new File(ruta);

        if (directorio.exists()) {
            return "Ya existe";
        } else if (directorio.mkdir()) {
            return "Creado";
        } else {
            return "No se pudo crear";
        }
    }

    public static String creafile(String dirName, String fileName) {
        File ruta = new File(dirName);

        if (ruta.exists()) {
            File ficheiro = new File(ruta, fileName);
            try {
                if (ficheiro.createNewFile()) {
                    return "creado";
                } else {
                    return "El archivo ya existe";
                }
            } catch (IOException e) {
                return "Error al crear el archivo: " + e.getMessage();
            }
        } else {
            return "No existe la ruta";
        }
    }
    public static void modoAcceso(String dirName,String fileName){
       File archivo = new File(dirName,fileName);
       if (archivo.canWrite()){
           System.out.println("se puede escribir ");
       }else{
           System.out.println("no se puede escribir ");
       }
       if (archivo.canRead()){
           System.out.println("se puede leer ");
       }else{
           System.out.println("no se puede leer ");
       }
    }
    public static void CaculaLonxitude(String dirName,String fileName){
        File archivo = new File(dirName,fileName);
        if (archivo.exists()){
            System.out.println("bytes "+archivo.length());
        }else {
            System.out.println("no existe");
        }

    }

    public static void mLectura(String dirName,String fileName){
        File archivo = new File(dirName,fileName);
        if (archivo.exists()){
            archivo.setReadOnly();
            System.out.println("solo se puede leer");
        }else {
            System.out.println("no existe");
        }



    }
    public static void mEscritura(String dirName,String fileName){
        File archivo = new File(dirName,fileName);
        if (archivo.exists()){
            archivo.setWritable(true);
            System.out.println("se puede escribir");
        }else {
            System.out.println("no existe");
        }


    }
    public static void borraFicheiro(String dirName,String fileName){
        File archivo = new File(dirName,fileName);
        if (archivo.exists()){
            archivo.delete();
            System.out.println("se ha borrado el archivo");
        }else {
            System.out.println("no existe");
        }
    }
    public static void borraDirectorio(String dirName){
        File archivo = new File(dirName);
        if (archivo.exists()){
            if (archivo.delete()) {
                System.out.println("se ha borrado el directorio");
            } else {
                System.out.println("no se pudo borrar (asegúrate de que el directorio esté vacío)");
            }
        }else {
            System.out.println("no existe");
        }


    }
    public static void mContido(String dirName){
        File archivo = new File(dirName);
        if (archivo.exists()){
            String[] lista = archivo.list();
            if (lista == null || lista.length == 0){
                System.out.println("no hay nada dentro");
            } else{
                for(int i=0; i < lista.length; i++){
                    System.out.println(lista[i]);
                }
            }

        }else {
            System.out.println("no existe");
        }


    }


}
