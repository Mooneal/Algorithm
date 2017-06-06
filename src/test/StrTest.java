package test;

import dataStruct.MaxSubSquence;

public class StrTest{
   
    public static void main(String[] args) {
    	/*int[] arr={-2,11,-4,13,-5,-2};
        MaxSubSquence m=new MaxSubSquence(arr);
        int max=m.method2();
        System.out.println(max);*/
    	DuoTai d=new DuoTai();
    	Polymorphism p=new Polymorphism();
    	tes(d);
    	tes(p);        //动态绑定，java中特有的功能，当函数的参数是一个多态的类/接口的话，那它可以接受它的子类。
    				//调用同样的方法的情况下，jvm会自动识别是接受了子类还是父类，且会分别调用方法。
    }
    
    public static void tes(DuoTai d){
    	d.eat();
    }
}