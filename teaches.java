public class teachers{

    private int id;
    private string name;
    private int salary ;
    private int salaryEarned ;

}

public Teachers( int id, string name , int salry ){

   this . id =  id 
this.name=name ;
this.salalary = salalary;
this.salaryEarned;
this.feesTotal=0;
}

public string getname(){
    return name; 

}

public int getid(){
    return id;

}
public int getsalary(){
    return salaray; 
}
public int getFeesTotal(){

    return feesTotal;

}

public void receiveSalary(int salary ){
    salaryEarned+=salary;
    school.updateTotalMoneyEarned(salary );

}

@Override
public String toString(){
    return "Teacher'name:"+ name + " total fees paid so far "+ feesPaid
}
