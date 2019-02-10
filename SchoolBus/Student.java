public class Student implements Person
{
    private String Name = "Default Name";
    private String Street = "Default Street";
    private int Number = 0;
    public Student(String name,String street,int number){
	Name = name;
	Street = street;
	Number = number;
    }
    public int distance(Student other){
	return (other.getStreet() == Street)? Math.abs(other.getNumber()-Number):99999;
	
    }
    @Override
    public String getName(){return Name;}
    @Override
    public String getStreet(){return Street;}
    @Override
    public int getNumber(){return Number;}
    @Override
    public String toString(){
	return "Name : "+getName() + "  Street:  " + getStreet()+"  Number: "+getNumber();  
    }
}
