

public class SinglyLinkedList {
    public static void main(String[] args) {
        SingleLinkedList<Integer>list=new SingleLinkedList<Integer>();
        System.out.println(list.size());
       System.out.println( list.isEmpty());
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.size());
        System.out.println( list.isEmpty());

        
    }

     
}

class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this .data=data;
        this.next=null;
    }
}










class SingleLinkedList<T>{
    Node<T> head;
    int size;
    T data;

    public int size()
    {
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public void add(T data){
        Node<T> current=new Node<T>(data);
        if(head==null){
            head=current;
        }
        else{
            Node<T> temp=head;

            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=current;

        }
        size++;
        
        
    }

}

