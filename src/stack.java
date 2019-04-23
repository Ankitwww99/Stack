class MyStack
{
    int size;
    int top;
    int stackarray[];
    public MyStack()
    {
        size =10;
        top=-1;
        stackarray = new int[size];
    }
    public void push(int value)
    {
        if(! isFull())
        {
            top++;
            stackarray[top]=value;
        }
    }

    public boolean isFull() {
        return (top==stackarray.length-1);
    }
    public int pop(){
        return stackarray[top--];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }

}
class A {
    public static void main(String[] args)
    {
        MyStack obj = new MyStack();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        obj.push(45);
        System.out.println(obj.pop());
    }
}
