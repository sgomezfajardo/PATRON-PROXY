/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube;

/**
 *
 * @author TUF ASUS
 */
public class ClaseYoutube{
    
    private String servicio;
    private String listaVideos;
    private int id;
    
    public void VerlistaVideos(){
          System.out.println("Video 1 ");
          System.out.println("Video 2 ");
          System.out.println("Video 3 ");
          System.out.println("Video 4 ");
    }
    
    public void VerinfoVideos(int id){
        if (id>0 && id<5) {
            int rand = (int)(Math.random()*100000000+1);
            System.out.println("El id del video " + id + " es: " + rand);
        }else{
            System.out.println("La id del video no esta disponible ya que no se encuentra en la lista de videos :D");
        }
    }
    public void DescargarVideo(int video){
        if(video > 0 && video<5){
        System.out.println("El video " + video + " ha sido descargado correctamente"); 
        }else{
        System.out.println("El video " + video + " No esta disponible");
        }
    }
}
