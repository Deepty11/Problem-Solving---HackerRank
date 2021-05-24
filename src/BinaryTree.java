public class BinaryTree {
    Node root;
    class Node{
        int data;
        Node leftChild;
        Node rightChild;
        public Node(int n){
            this.data = n;
            this.leftChild = null;
            this.rightChild = null;
        }
    }
    public void isEqual(Node a, Node b ){
        if(a == null || b == null){
            System.out.println("Cannot compare");
        } else {
            while( a != null || b != null){
                if(a.data == b.data){
//                    return isEqual(a.leftChild,2);
//                    return isEqual(a.leftChild,2);


                }
            }

        }

    }

    public static void main(String[] args) {

    }

}
//id, parentNode  ,   node , leftChild,  rightChild,  data
//1    null             1      2         3              1
//2    1                2       4         5             2
//3    1                3       null      null          3