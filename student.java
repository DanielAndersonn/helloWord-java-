
// this class is responsible for keeping
//tracke os sstudente fees, name , grade e fees

public class student {

  private  int id ;
  private string name;
  private int grade;
  private int feesPaid;
  private int feesTotal 
 
   //[id] for  the student unique
   //[name] name os the student
   //[grade] grade of the students 

  public student (int id, String name, int grade  ){
    this.feesPaid=0;
    this.id=id;
    this.name=name;
    this.grade=grade;

  }

  //not going to alter student name , students
  // use to update the studant {grade}
  //grade for new grade of the students 

  public void setGrade(int grade ){
      this.grade=grade;

  }

  public void payFees(int fees){
      feesPaid+=fees;
      school.updateTptalMoney();


  }

  public string getname(){
    return name; 

}

public int getid(){
    return id;

}
public int getsalary(){
    return salaray 
}
public int getFeesTotal(){

    return feesTotal
}
public int getRemaingFees(){
     return feesTotal-feesPaid
}
@Override
public String toString(){
    return "Stundent'name:"+ name + " total fees paidso far "+ feesPaid
}

}