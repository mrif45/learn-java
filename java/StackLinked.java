class item{ // atau node/simpul
    public int data; // data item
    public item next; // next node link in list
    public item prev; // previous node link in list

    public item(int id) {
        data = id; // initialize data
    } // set to null)

    public void displayLink() { // display ourself
        System.out.print("{" + data + "}");
    }
} // end class Link

class StackLinkList {
    private item top; // ref to first link on list
    private item bottom; // ref to last link on list

    public StackLinkList() {
        top = bottom = null; // no items on list yet
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public void push(int id){ // make new link
        item newitem = new item(id);
        if (top == null) {
            top = bottom = newitem; // first –> newLink
        } else {
            top.next = newitem; // next dr top (awal) diarahkan ke node baru
            newitem.prev = top; // prev dr node baru diarahkan ke tail (awal)
            top = newitem; // top (baru) diarahkan ke node baru
        }
    }

    public item pop() { 
        item temp = null;
        if (top == null) // stack is empty
            System.out.println("Stack is empty");
        else if (top == bottom) {
            temp = top;
            top = bottom = null;
        } else {
            temp = top; // save reference to link
            top = top.prev; // delete it: first–>old next
            top.next = null;
        }
        return temp;
    }

    public void display(){
        item current = bottom; // start from the first data
        while(current != null) {
            current.displayLink(); // print data
            current = current.next; // move to next link
        }
        System.out.println("");
    }
} // end class LinkList

public class StackLinked {
    public static void main(String[] args) {
        StackLinkList theStack = new StackLinkList(); // make new list
        System.out.println("Initializing Stack");
        theStack.push(22); // insert four items
        theStack.push(44);
        theStack.push(66);
        theStack.push(88);
        System.out.println("Display Forward :");
        theStack.display(); // display list
        System.out.println("Delete Stack from Top");

        while( !theStack.isEmpty() ){
            item aLink = theStack.pop(); // delete link
            System.out.print("Deleted "); // display it
            aLink.displayLink();
            System.out.println("");
        }
        
        theStack.display(); // display list
    } // end main()
}
