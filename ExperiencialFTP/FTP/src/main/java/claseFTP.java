import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class claseFTP {

    public static void main(String[] args) throws IOException {

        FTPClient ftp=new FTPClient();                                          //Creamos el objeto para trabajar con FTP
        ftp.connect("derbi.damiansu.com");                             //Creamos la conexion con la url a traves del ftp
        boolean login= ftp.login("alumno","alumno-2025");     //Con un booleano, creamos un login con el usuario y la contraseña
        if (!login){                                                            //Si el booleano de logn da falso...
            System.out.println("Conexion Incorrecta");                          //Mensaje de error
            System.out.println(ftp.getReplyString());
        }else{                                                                  //Si da "True"...
            System.out.println("Estamos dentro");                               //Mensaje de Exito
            ftp.setFileType(FTPClient.BINARY_FILE_TYPE);                        //Indicamos el tipo de datos que van a contener los ficheros Del FTP

            //EMPIEZA EL EJERCICIO

            System.out.println(ftp.printWorkingDirectory());                    //Imprimimos el directorio completo
            FTPFile[] ficheros = ftp.listFiles();                               //Creamos una variable "Array" donde guardaremos el listado de archivos encontrados
            System.out.println("Contenido de la carpeta: "+ficheros.length+" ficheros.");

            for(int i=0;i<ficheros.length;i++) {                                 //Bucle FOR para recorrer el listado de ficheros
                if (ficheros[i].getName().contains("hola.txt")) {                //Si i contiene el nombre de fichero "Hola.txt...
                    System.out.println("Hemos encontrado el fichero!!");
                }
            }


            ftp.changeWorkingDirectory("RealMadrid");

            //Subir fichero --> Trabajo a la altura del proyecto
            File f=new File("Excelente.jpg");
            FileInputStream fSubida=new FileInputStream(f);
            ftp.storeFile("Excelente.jpg",fSubida);


            //Bajar fichero

            ftp.changeWorkingDirectory("../AupaAtleti");
            System.out.println(ftp.listFiles().length);
            FileOutputStream fbajada=new FileOutputStream("Foto.jpg");
            ftp.retrieveFile("atleti.jpg",fbajada);

        }
        ftp.logout();
    }

}
