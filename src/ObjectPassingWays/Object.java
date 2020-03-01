/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPassingWays;

/**
 *
 * @author USER
 */
public class Object {
    
    public int a=1,b=2;
    
    public String test;
    
    public void print(){
        System.out.println("Object-class's print");
        
    }
    
    public Object(int a,int b){
        
        this.a=a;
        this.b=b;
        System.out.println("Constructor Used a="+this.a+" b="+this.b);
        
    }
    
    
}
