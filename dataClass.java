/*
*
*Lua thong tin cac class phan tich duoc 
*/

import java.util.ArrayList;


public class dataClass {
    private ArrayList<classObject> listClass;
	dataClass(){
		listClass = new ArrayList<classObject>();
	}
	public ArrayList<classObject> getList(){
		return this.listClass;
	}
	public void addClass(classObject tmp){
		this.listClass.add(tmp);
	}
	//in toan bo cac class ra
	public void printAllClass(){

		for(classObject test:this.listClass){
				test.print();
				System.out.println("--------------------------------------------------------------------------------------------------------------");
		}


	}

}
