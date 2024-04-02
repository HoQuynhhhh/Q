package Baitapvn2;
import java.util.Scanner;

public class Mang1chieu {
    public static void nhap(int a[],int n) {
    	Scanner Scan = new Scanner(System.in);
    	for(int i=0;i<n;i++) {
            System.out.print("Nhap phan tu thu "+(i+1)+" : ");
    	    a[i] = Scan.nextInt();
    	}
    }
    public static void hien(int a[],int n) {
    	for(int i=0;i<n;i++) {
    		System.out.print(a[i]+" ");
    	}
    	System.out.println();
    }
    public static int checknt(int n) {
    	if(n<2) {
    		return 0;
    	}else {
    		for(int i=2;i<=Math.sqrt(n);i++) {
    			if(n%i==0) {
    				return 0;
    			}
    		}
    		return 1;
    	}
    }
    public static void Hiennt(int a[],int n) {
    	System.out.println("Mang so nguyen to !");
    	for(int i=0;i<n;i++) {
    		if(checknt(a[i])==1) {
    			System.out.print(a[i]+" ");
    		}
    	}
    	System.out.println();
    }
    public static int checkcp(int n) {
    	if(n<=0) {
    		return 0;
    	}else {
    		for(int i=1;i*i<=n;i++) {
        		if(i*i==n) {
        			return 1;
        		}
        	}
        	return 0;
    	}
    }
    public static void Hienhh(int a[],int n) {
    	System.out.println("Mang so hoan hao !");
    	for(int i=0;i<n;i++) {
    		if(checkcp(a[i])==1) {
    			System.out.print(a[i]+" ");
    		}
    	}
    	System.out.println();
    }
    public static int checkhh(int n) {
    	if(n<0) {
    		return 0;
    	}else {
    		int sum=0;
    		for(int i=1;i<n;i++) {
    			if(n%i==0) {
    				sum=sum+i;
    			}
    		}
    		if(sum==n) {
    			return 1;
    		}else {
    			return 0;
    		}
    	}
    }
    public static void Ghep(int a[],int n) {
         int nb=0,nc=0,nd=0;
         int[] b=new int[100];
         int[] c=new int[100];
         int[] d=new int[100];
         for(int i=0;i<n;i++) {
        	 if(checknt(a[i])==1) {
        		 b[nb]=a[i];
        		 nb++;
        	 }
        	 if(checkhh(a[i])==1) {
        		 c[nc]=a[i];
        		 nc++;
        	 }
         }
         for(int i=0;i<nb;i++) {
        	 d[nd]=b[i];
        	 nd++;
         }
         for(int i=0;i<nc;i++) {
        	 d[nd]=c[i];
        	 nd++;
         }
         System.out.println("Mang ghep !");
         for(int i=0;i<nd;i++) {
        	 System.out.print(d[i]+" ");
         }
         System.out.println();
    }
    public static int Chen(int a[],int n) {
    	Scanner Scan = new Scanner(System.in);
    	System.out.print("Nhap vi tri muon chen : ");
    	int chen = Scan.nextInt();
    	if(chen>n) {
    		chen=n;
    	}
    	int giatri ;
    	do {
    		System.out.print("Nhap gia tri muon chen : ");
        	giatri = Scan.nextInt();
        	if(checkhh(giatri)==0) {
        		System.out.println("Day khong phai so hoan hao !");
        	}
    	}while(checkhh(giatri)==0);
    	for(int i=n;i>=chen;i--) {
    		a[i]=a[i-1];
    	}
    	a[chen]=giatri;
    	return n+1;
    }
	public static void main(String[] args) {
		int n;
		Scanner Scan = new Scanner(System.in);
    	System.out.print("Nhap so luong phan tu : ");
    	n = Scan.nextInt();
		int[] a=new int[100];
        nhap(a,n);
        hien(a,n);
        Hiennt(a,n);
        Hienhh(a,n);
        Ghep(a,n);
        n=Chen(a,n);
        hien(a,n);
	}

}
