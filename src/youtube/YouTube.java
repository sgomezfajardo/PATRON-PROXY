/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package youtube;

import java.util.Scanner;

/**
 *
 * @author TUF ASUS
 */
public class YouTube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion1; 
        int id,video;
        ClaseYoutube metodos= new ClaseYoutube();
        
        do{
        System.out.println("Digite la opcion correspondiente a lo que quiere hacer");
        System.out.println("1: Para ver la lista de videos");
        System.out.println("2: Para ver la ID de un video");
        System.out.println("3: Para descargar algun video");
        opcion1 = sc.nextInt();
        
        switch(opcion1){
            case 1:
                metodos.VerlistaVideos();
                break;
            case 2:
                System.out.println("Digite el numero del video el cual desea ver su informacion: ");
                id=sc.nextInt();
                metodos.VerinfoVideos(id);
                break;
            case 3:
                System.out.println("Digite el numero del video que se desea descargar");
                video=sc.nextInt();
                metodos.DescargarVideo(video);
                break;
        }
        }while(true);
    }
     
}

        
        