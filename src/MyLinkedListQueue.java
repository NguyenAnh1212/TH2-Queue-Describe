public class MyLinkedListQueue {
    private Node head;
    private Node tail;
// Trong Linked list có 2 điểm đầu cuối
    public MyLinkedListQueue() {// khai báo head và tail = null danh sách bây giờ là rỗng
        this.head = null;
        this.tail = null;
    }
// triển khai phương thức chèn
// (Tạo node đầu tiên và nối nó vào danh sách,
// node đầu tiên đc tạo ra và  cả head và tail đều trỏ tới giá trị này
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        // tail.next = new Node<>(data) Tạo node thứ 2 và nối nó vào danh sách,
        // tạo liên kết node đầu tiên với node mới
        this.tail.next = temp;
        //Node mới bây giờ là node đuôi, di chuyển tail để trỏ đến node mới tail = tail.next.
        this.tail = temp;
    }
// lấy node đầu tiên
    public Node dequeue() {
        if (this.head == null) // danh sách rỗng không có gì để xóa
            return null;
        Node temp = this.head; // Keep the first node temporarily đặt một node tạm là node đầu
        this.head = this.head.next;// trỏ head tới node thứ 2
        if (this.head == null) // sau khi trỏ head tới node 2 mà head = null thì tức là đã xóa danh sách thành rỗng
            this.tail = null;
        return temp;// trả về giá trị đã xóa.
    }
}
