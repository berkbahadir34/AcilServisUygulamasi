import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] argc){

        //Hastalar Acil Serviste Şikayetlerine Göre En önlere Geçecek (Priority Queue)
        //Apandisit>Yanık>BaşAğrısı

        Queue<Hasta> acilservis=new PriorityQueue<Hasta>();
        acilservis.offer(new Hasta ("Berk","Yanık"));
        acilservis.offer(new Hasta("Bahadır","Baş Ağrısı"));
        acilservis.offer(new Hasta ("Burak","Apandisit"));
        acilservis.offer( new Hasta ("Eren","Yanık"));
        acilservis.offer( new Hasta ("Tito","Yanık"));
        acilservis.offer(  new Hasta ("Nedim","Apandisit"));
        int i =1;
        while (acilservis.isEmpty()!=true){
            System.out.println("*******************");
            System.out.println(i+". Sırada");
            System.out.println(acilservis.poll());
            System.out.println("*******************");
            i++;
        }










    }
}
