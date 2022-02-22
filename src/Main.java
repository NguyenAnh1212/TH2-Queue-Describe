public class Main {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();// tạo 1 queue theo cấu trúc dữ liệu LinhkedList.
        // Tạo ra các node 10,20, sau đó xóa 2 node này.
        // tạo ra các node theo thứ tự 30,40,50
        // Xóa các node theo nguyên tắc FIFO, vào trước ra trước nên giá trị thêm vào đầu tiên sẽ là giá trị được lấy ra (30)
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
