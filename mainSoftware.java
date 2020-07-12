import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class mainSoftware {
	static Scanner sc=new Scanner(System.in);
	static  Software s[]=new Software[100];
	static int n;
	 public static void main(String args[]) {
		 int y=0;
		
		 while(y!=1) {
			 System.out.println("Enter 1: add software");
			 System.out.println("Enter 2: sort by cost");
			 System.out.println("Enter 3: search by id");
			 System.out.println("Enter 4: sort by id and name");
			 System.out.println("Enter 5: exit");
			
			 System.out.println("Enter no you want to choose");
			 int choice=sc.nextInt();
			
			 switch(choice) {
			 case 1: System.out.println("Enter the no of software you want to add");
			 n=sc.nextInt();
		
				Software add[] =addSoftware(s);
				for(int i=0;i<n;i++) {
					System.out.println(add[i]);
				}
				 break;
			 case 2:
				 Software sort[]=sortByCost(s);
				 for(int i=0;i<n;i++) {
						System.out.println(sort[i]);
					}
				 break;
			 case 3:Software se[]=SearchById(s);
			 
				for(int i=0;i<n;i++) {
					System.out.println(se[i]);
				}
			 
				 break;
			 case 4:
				Software si[]= insertionSort(s);
				for(int i=0;i<n;i++) {
					System.out.println(si[i]);
				}
				break;
			 case 5:
				 System.out.println("Exit Condition Executed");
				 y=1;
				 break;
				 default:
					System.out.println("invalid input");
				 
				 
			 }
			 
			 
		 }
	 }
	
	private static Software[] insertionSort(Software[] s2) {
		for(int i=1;i<n;i++) {
			int j=i;
			
			while(j>=0&&s[j-1].getSid()>s[j].getSid()) {
				Software key=s[j];
				s[j]=s[j-1];
				s[j-1]=key;
				j=j-1;
			}
		}
		  
		for(int i=1;i<n;i++) {
			int j=i;
		
		if(s[j-1].getSid()==s[j].getSid()) {
		
			while(j>=0&&s[j-1].getSname().compareTo(s[j].getSname())>0){
				Software key=s[j];
				 {
					
				s[j]=s[j-1];
				s[j-1]=key;
				j=j-1;
			}
			}
			
		}
		}
		
		
		
		
		
		
		return s2;
	}
	private static Software[] SearchById(Software[] s) {
		for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(s[i].getSid()>s[j].getSid()) {
						Software temp=s[i];
						s[i]=s[j];
						s[j]=temp;
						
					}
				}
		}
		System.out.println("enter the element you want to serch");
		int ele=sc.nextInt();
		boolean b=false;
		int l=0;
		int h=n-1;
		while(h>=l) {
			int mid=(l+h)/2;
			if(s[mid].getSid()==ele) {
				
				System.out.println("Element is found"+s[mid].getSid()+" ,"+s[mid].getScost()+","+s[mid].getSname());
				b=true;
				break;
			}
			else if(ele>s[mid].getSid())
			l=mid+1;
			else
				h=mid-1;
			if(l>h)
				System.out.println("element not found");
			}	
		return s;
			
		}
		
	private static Software[] sortByCost(Software[] s) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(s[i].getScost()>s[j].getScost()) {
					Software temp=s[i];
					s[i]=s[j];
					s[j]=temp;	
				}
			}
		}
		return s;
	}
	private static Software[] addSoftware(Software[] s2) {
		for(int i=0;i<n;i++) {
		System.out.println("Enter software id");
		int sid=sc.nextInt();
		System.out.println("Enter software name");
		String sname=sc.next();
		System.out.println("Enter software cost");
		int scost=sc.nextInt();
		s2[i]=new Software(sid, sname, scost);
	}
		return s2;
	
	}
	
	
	
	
	
	
	
	
	
	
}
