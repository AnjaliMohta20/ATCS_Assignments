package Day_7;


public class Employee {
	public void EmpDetails(String EmpName,int EmpCode){
		System.out.println(EmpName+" "+EmpCode);
		
	}
public static void main(String[] args) {
	Employee[] e= new Employee[9];
e[0]=new Employee();	
e[1]=new Employee();	
e[2]=new Employee();	
e[0].EmpDetails("Monika",1121);
e[1].EmpDetails("Pheobe",1023);
e[2].EmpDetails("Rachel",1432);
}
}

