import java.io.*;
class sample15{
    public static void main(String []args){
        System.out.println("some");
        try{
            File file=new File("//home//coolerdude//java//sla_pratice//sample15.txt");
            FileWriter fw=new FileWriter(file);
            char word='o';
            fw.write(word);
            fw.close();
            
            FileReader fr=new FileReader(file);
            char result=(char)fr.read();

            System.out.println("result: "+result);
            fr.close();

        }catch(IOException e){
            System.out.println(e);
        }
    }
}


