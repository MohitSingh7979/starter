package src;

// Item to be used in linked list
class Item {
  int value; // value of item
  Item next; // reference to next item
}

class LList {
  Item head; // starting point / item
  Item tail; // ending tail
  // push -> insert element/item at last

  void push(int value) {
    Item tmp = new Item();
    tmp.value = value;
    head.next = tmp;
  }
  // pop -> remove element/item at last
  // size -> length of linked list

}

class Test {
  public static void main(String[] args) {
    Item head = new Item();
    head.value = 56;
    head.next = new Item();
    head.next.value = 67;
    System.out.println(head.next.value);
  }
}
