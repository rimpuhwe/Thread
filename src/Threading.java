public class Threading  implements  Runnable{
//confinement
    public DownloadStatus status;
     Threading() {
         this. status = new DownloadStatus();
    }

    @Override
    public void run() {

         for (int i = 0 ; i <= 10_000; i++){
             System.out.println("Downloading file "+ Thread.currentThread().getName());
             status.incrementStatus();
         }
    }
    public DownloadStatus getStatus() {
        return status;
    }

}
