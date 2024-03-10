package cn.yishijie;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> datas;
    private Stack<Integer> mins;

    public MinStack() {
        datas = new Stack<>();
        mins  = new Stack<>();
    }

    public int pop(){
        if(datas.isEmpty()){
            throw new RuntimeException("栈为空。。。");
        }
        Integer result = datas.pop();
        if(result == mins.peek()){
            mins.pop();
        }
        return result.intValue();
    }

    public void push(int value){
        datas.push(value);
        if(mins.isEmpty()){
            mins.push(value);
        }else if(value <= mins.peek()){
            mins.push(value);
        }
    }

    public int getMin(){
        if(mins.isEmpty()){
            throw new RuntimeException("栈为空。。");
        }
        return mins.peek();
    }
}
