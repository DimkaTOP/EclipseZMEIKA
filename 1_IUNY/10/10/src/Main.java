public class Main {

    public static void main(String[] args) {
        Message message = new Message("������, ��� ����?");

        Waiter waiter1 = new Waiter(message);
        Waiter waiter2 = new Waiter(message);
        Notifier notifier = new Notifier(message);

        new Thread(waiter1, "waiter1").start();
        new Thread(waiter2, "waiter2").start();
        new Thread(notifier, "notifier").start();

        System.out.println("��� ������ ��������");
    }

    private static class Message {
        private String msg;

        public Message(String str){
            this.msg=str;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String str) {
            this.msg=str;
        }
    }

    private static class Waiter implements Runnable{
        private Message message;

        public Waiter(Message message){
            this.message = message;
        }

        @Override
        public void run() {
            synchronized (message) {
                try{
                    System.out.println(Thread.currentThread().getName() + " ������� ��������� � ���������");
                    message.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " ������� ������ � ���������: " + message.getMsg());
            }
        }
    }

    private static class Notifier implements Runnable {

        private Message message;

        public Notifier(Message message) {
            this.message = message;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " �������");
            try {
                Thread.sleep(1000);
                synchronized (message) {
                    message.setMsg("������� �������!");
                    message.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}