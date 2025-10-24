public class SinglyLinkedList {
    Node head;

    public void add(int data){
        Node newNode=new Node(data);//Creacion de un nuevo Nodo
        if(head==null){//verificacion de lista vacia
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){//Recorrido de los nodos, hasta encontrar el ultimo
            current=current.next;
        }
        current.next=newNode;//insertar nuevo nodo al final de la lista

    }
    
    public boolean contains(int data){
        
        Node current=head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public void remove(int data){
        if(head==null){//pregunta si la lista está vacía
            return;
        }
        if(head.data==data){//valida que el dato esté en head
            return;
        }

        Node current=head;
        while(current!=null && current.next.data!=data){//recorre hasta encontrar el valor
            current=current.next;
        }
        current.next=current.next.next;//asignamos el nodo corriente al siguiente
    }

    public void printList(){
        Node current = head;
        while (current!=null){
            System.out.println(current.data);
            current=current.next;
        }
        System.out.println("null");
    }
}
