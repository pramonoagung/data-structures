public class SLL {
    private Node pointer;
    private int size;

    //the starting index of this program is 1

    void newNode(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = pointer;
        pointer = newNode;
        size++;
    }

    void print(String value) {
        Node pointer = this.pointer;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println("Null");
    }

    boolean isEmpty() {
        Node head = pointer;
        if (this.size == 0 && head == null) {
            return true;
        } else {
            return false;
        }
    }

    int getSize() {
        return size;
    }

    int search(int value) {
        Node pointer = this.pointer;
        int result = 0, index = 1;
        while (pointer != null) {
            if (pointer.data == value) {
                result = index;
            }
            index++;
            pointer = pointer.next;
        }
        return result;
    }

    boolean remove(int value) {
        if (search(value) != 0) {
            Node pointer = this.pointer, pointerBefore = null;
            while (pointer != null) {
                if (pointer.data == value) {
                    pointerBefore.next = pointer.next;
                    pointer = pointer.next;
                }
                pointerBefore = pointer;
                pointer = pointer.next;
            }
            return true;
        } else {
            return false;
        }
    }

    boolean removeFirst() {
        return true;
    }

    boolean removeLast() {
        return true;
    }

    boolean addBefore(int value) {

        return true;
    }

    boolean addAfter(int value) {

        return true;
    }

    boolean addLast() {
        return true;
    }

    boolean addFirst() {
        return true;
    }

    int getValueOfNodeIndex() {
        return 0;
    }

    public static void main(String[] args) {
        SLL sll = new SLL();
        System.out.println("Is empty : " + sll.isEmpty());
        sll.newNode(2);
        sll.newNode(21);
        sll.newNode(48);
        sll.newNode(8);
        sll.print("The values ");
        System.out.println("Is empty : " + sll.isEmpty());
        System.out.println("The Size : " + sll.getSize());
        int toBeFind = 2;
        System.out.println("Looking for the " + toBeFind + " in SLL : " +
                ((sll.search(toBeFind) == 0 ? "Not found" : "Catched in " + (sll.search(toBeFind)) + " node")));
        int toBeDelete = 48;
        System.out.println("Deleting " + toBeDelete + " : " + sll.remove(toBeDelete));
        sll.print("The values ");
    }
}
