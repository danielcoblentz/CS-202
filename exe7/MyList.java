public class MyList {
    //data fields
    public Node head = null;
    public int size = 0;
    
    //methods
    //a
    public int front()
    {
        return head.data;
    }

    //b
public int size()
{
    return size;
}
    //c
    public void insert_Head(int insert_me){
        //step 1: create new node in the memory (contains insert_method)
        Node temp = new Node(insert_me);
        //Step2: assign teh original head of the list as next
        //node   for the new node (created in step 1)

      temp.next = head;

      //step3: assign new node as head of the list
      head = temp;

      size++;

      //one line solution
      //head = new Node(insert_me, head); // review at home


    }

    //d
    public void delete_head(){
        //if(head!=null) return true or false
        //assign the second node in the list as the head of the list
        head = head.next;
        size--;
    }
    //e
    public void display()
    {
        for(Node temp=head;temp!=null; temp=temp.next)
        {
            System.out.print("->"+ temp.data);
        }
        System.out.println();
    }
}
 
//PA3
//f
//public int get_back()
{
    //step 1: use a loop to go through the list and stop at the last node
    // step 2: return the data value inside the node that is referred to by temp
for(int i=0;)

}
/* 
//g
public void insert_back(int insert_me){
    //step 1: create new node that contains "insert_me"
    //step 2: use a loop to go through the list and stop at the last node
    //assign the new node as the next node for the old last node

    size --;
}

public void delete_back {
    //step 1: use a loop to go throuh list and stop at the second to last node
    //step 2: assign null to be the next node for the tmep
}

//i

public boolean search(int target){ //linear search on LL
    //step 1: iterate through the list, compaire the data in each node with teh target
    //if target is found, return true if temp.data == target return true
    //step 1.5: by the time when the loop in step one is done, if we have not returned true yet
    //return false

}

//j

public void insert(int after_me, int insert_me){

    //step1: create new node that contains insert_me

    //step2: iternate through the list, find the node that contains after_me

    //step3:assign the next node of the after me node as the next node for the insert_me node

    //step4:assign the insert_me node as teh next node fro the after_me node

    size ++;
}

//k
public void remove(int delete_me){
    //step1:iternate through the list, find the node that is in front of delete_me
    //temp.next.data

    //step2:assign the next next node to be the next node of the node that is in front of delete_me
}
*/