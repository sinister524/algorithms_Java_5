package ru.geekbrains.algorithmsJava5;



public class Bag {
    private double maxSize;
    private Item[] stack;
    private int top;
    private int fullCoast;
    public Bag (double size){
        this.maxSize = size;
        this.stack = new Item[(int)this.maxSize];
        this.top = -1;
        this.fullCoast = 0;
    }
    public void push(Item i){
        this.stack[++this.top] = i;
        if (this.maxSize - i.getWeight() < 0){
            this.maxSize-=i.getWeight();
            this.fullCoast+=i.getPrice();
        }

    }
    public Item pop(){
        return this.stack[this.top--];
    }
    public Item peek(){
        return this.stack[this.top];
    }
    public boolean isEmpty(){
        return (this.top == -1);
    }
    public boolean isFull(){
        return (this.top == this.maxSize-1);
    }


}
