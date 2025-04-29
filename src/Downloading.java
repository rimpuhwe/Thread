import java.util.ArrayList;
import java.util.List;
//confinement
public class Downloading {
    public static void main(String[] args){
       List<Thread> threads = new ArrayList<>();
       List<Threading> tasks = new ArrayList<>();
       for (int i = 0 ; i < 10 ; i++ ){
           var task = new Threading();
           tasks.add(task);

           Thread thread  = new Thread(task);
           thread.start();
           threads.add(thread);

       }
       for ( Thread thread : threads){
           try {
               thread.join();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
      int totalTask =  tasks.stream().map( t->t.getStatus().getStatus()).reduce(Integer::sum).orElse(0);
        System.out.println(totalTask);
    }


}
