import java.util.*;
class InValidFoodException extends Exception{
  public InValidFoodException(String mesg){
    super(mesg);
  }
}
class sample17{
  public static void main(String[]args){
    Scanner s=new Scanner(System.in);
    System.out.println("give me food");
    String food = s.nextLine();

    try{
      if(food== "briyani"){
        System.out.println("food good");
      }else{
         InValidFoodException wrongfood=new InValidFoodException("wrong food");
         s.close();
        throw wrongfood;
      }
    }catch(InValidFoodException e){
      System.out.println(e.getMessage());
    }
    s.close();
  }
}