public class Job implements Runnable {
    private int jobNumber;

    WorkerThread(int jobNumber) {
        this.jobNumber = jobNumber;
    }

    public void run() {
        // Undertake required work, here we will empulate it by simply sleeping for a period
        System.out.println("Job: " + jobNumber + " is being processed by thread: ", + Thread.currentThread().name);
        try {
            Thread.sleep((int)(1000));
            } catch (InterruptedException e) {  
                // no catching as example should not experience interruptions
            }
        }
    }
}
