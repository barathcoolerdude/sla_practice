import java.util.*;
class sample8{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int[] num= {10,20,30,20,10,10};
for(int i=0;i<num.length;i++){
			int count=1;
			if(num[i]==0) continue;
			for(int j=i+1;j<num.length;j++){
				if(num[i]==num[j]){
					count+=1;
					num[j]=0;
				}
			}
			System.out.println(num[i]+" comes "+count+" times");	
		}
    s.close();
    }
}