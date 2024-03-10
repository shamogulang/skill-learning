package cn.yishijie;

import java.util.Stack;

public class MinStack0 {

    private Stack<Integer> data;
    private Stack<Integer> mins;

    public MinStack0() {
        this.data = new Stack<>();
        this.mins = new Stack<>();
    }

    public Integer pop(){
        if(data.isEmpty()){
            throw  new RuntimeException("栈空了。。。");
        }
        mins.pop();
        return data.pop();
    }

    public void push(Integer value){
        data.push(value);
        if(mins.isEmpty()){
            mins.push(value);
        }if(value <= mins.peek()){
            mins.push(value);
        }else{
            Integer min = mins.peek();
            mins.push(min);
        }
    }

    public Integer getMin(){
        if(mins.isEmpty()){
            throw  new RuntimeException("栈空了。。。");
        }
        return mins.peek();
    }
}
