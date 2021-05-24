import java.util.Stack;

public class Queue {
    static  private Queue queue;
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    private Queue(){

    }
    public static Queue getInstance(){
        if(queue == null){
            return queue = new Queue();
        }
        return queue;
    }
    public void push(int n){
        stack1.push(n);
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }

        }
    }
    public int pop(){

        return stack2.pop();
    }
    public int count(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }

        }
        int count =0;
        for (int i=0;i< stack2.size();i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Queue queue = Queue.getInstance();
        queue.push(1);
        queue.push(2);
        queue.push(10);
        queue.pop();
        System.out.println("Total element in the queue: "+ queue.count());


    }
}
