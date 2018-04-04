package flyweight;

/**
 * @author long
 * @Description
 * @date 2018-04-03 17:55
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        TeacherFactory instance = TeacherFactory.getInstance();
        Teacher teacher = TeacherFactory.getTeacher(10);
        Teacher teacher1 = TeacherFactory.getTeacher(100);
        Teacher teacher2 = TeacherFactory.getTeacher(10);

        System.out.println(teacher.getNumber());
        System.out.println(teacher1.getNumber());
        System.out.println(teacher2.getNumber());

        // 判断是否是相等对象
        if (teacher == teacher2) {
            // 确实打印了，ok
            System.out.print("____________-");
        }

        Thread producer = new Producer();
        Thread consumer = new Consumer();

        producer.setPriority(Thread.MIN_PRIORITY); //Min Priority
        consumer.setPriority(Thread.MAX_PRIORITY); //Max Priority

        producer.start();
        //producer.join();
        consumer.start();
        consumer.join();
        /*Executors.newSingleThreadExecutor(new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                return thread;
            }
        });

        ExecutorService executorService = Executors.newSingleThreadExecutor((runnable) -> new Thread(runnable));
        executorService.submit(new MyThread());
        System.out.println(executorService);*/
    }

    private static class MyThread implements Runnable {
        @Override
        public void run() {
            System.out.println("你好啊");
        }
    }


    private static class Producer extends Thread
    {
        public void run()
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("I am Producer : Produced Item " + i);
                Thread.yield();
            }
        }
    }

    private static class Consumer extends Thread
    {
        public void run()
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("I am Consumer : Consumed Item " + i);
                Thread.yield();
            }
        }
    }
}
