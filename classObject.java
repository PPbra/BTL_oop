/*
*
*doi tuong class
*
*/

import java.util.*;

public class classObject {
    private String className;
	private String fatherClass;
  	private ArrayList<attribute> listAttribute;
	private ArrayList<method> listMethod;

	classObject(){
		this.fatherClass = null;
		this.className = null;
		this.listAttribute = new ArrayList<attribute>();
		this.listMethod = new ArrayList<method>();
	}

	public String getClassName(){
		return this.className;
	}
	public void setClassName(String s){
		this.className = s;
	}
	public String getFatherName(){
		return this.fatherClass;
	}
    public void addAttribute(attribute a){
            this.listAttribute.add(a);
        }
    public void addMethod(method a){
            this.listMethod.add(a);
    }
    public void setFatherName(String a){
    	this.fatherClass=a;

    }

    //in class nay ra
    public void print(){
    	if(this.fatherClass != null){
    		System.out.println("------->Class name:  "+this.className +  " extends " + this.fatherClass);
    		System.out.println("--->Attributes: ");
    		for(attribute a:this.listAttribute){
    			a.print();
    		}
    		System.out.println("--->Methods: ");
    		for(method b:this.listMethod){
    			b.print();
    		}
    	}else{
    		System.out.println("------->Class name:  "+this.className);
    		System.out.println("--->Attributes: ");
    		for(attribute a:this.listAttribute){
    			a.print();
    		}
    		System.out.println("--->Methods: ");
    		for(method b:this.listMethod){
    			b.print();
    		}
    	}
        
	}
}
