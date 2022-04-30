package scalar.in;

public class Pattern {
	public static void main(String args[]) {
		int n=5;
		p1(n);
		p2(n);
		p3(n);
		p4(n);
		p5(n);
		p6(n);
		p7(n);
		p8(n);
		p9(n);
		p11(n);
}
	static void p1(int n) {
		System.out.println("pattern :1");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		}
	
static void p2(int n) {
	System.out.println("pattern :2");
		
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>i;j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		}
static void p3(int n) {
	System.out.println("pattern :3");
	
	
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	}
static void p4(int n) {
	System.out.println("pattern :4");
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			
			System.out.print(" ");		
		}
		for(int k=i;k<n;k++){
			System.out.print("*");}
		System.out.println();
	}
	}
static void p5(int n) {
	System.out.println("pattern :5");
	
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			
			System.out.print(" ");
		}
    for(int k=0;k<=i;k++) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	}
static void p6(int n) {
	System.out.println("pattern :6");
	
	for(int i=0;i<2*n;i++) {
		int col=i>n?2*n-i:i;
		for(int k=1;k<=col;k++) {
				
			
			System.out.print("*");
		}
		
		
		System.out.println();
		
	}
	}
	
static void p7(int n) {
	System.out.println("pattern :7");
	char c='A';
	for(int i=0;i<2*n;i++) {
		int tcol=i>n?2*n-i:i;
		for(int j=1;j<=tcol;j++) {
			
			System.out.print(c++);
		}
		System.out.println();
	}
	}
	
static void p8(int n) {
	System.out.println("pattern :8");
	char c='A';
	for(int i=0;i<2*n;i++) {
		int tcol=i>n?2*n-i:i;
		for(int j=1;j<=tcol;j++) {
			
			System.out.print("*");
		}
		for(int k=0;k<n-tcol;k++) {
			System.out.print("  ");
		}
      for(int j=1;j<=tcol;j++) {
			
			System.out.print("*");
		}
		System.out.println();
	}
	}

static void p9(int n) {
	System.out.println("pattern :9");
	
	for(int i=0;i<2*n;i++) {
		int tcol=i>n?2*n-i:i;
		for(int k=0;k<n-tcol;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=tcol;j++) {
			
			System.out.print("* ");
		}
		
     
		System.out.println();
	}
	}


static void p10(int n) {
	System.out.println("pattern :10");
	
	for(int i=1;i<=n;i++) {
		
		for(int k=1;k<=n-i;k++) {
			System.out.print(" ");
		}
		
		for(int j=i;j>=1;j--) {
			
			System.out.print(j);
		}
            for(int j=2;j<=i;j++) {
			
			System.out.print(j);
		}
		
     
		System.out.println();
	}
	}
static void p11(int n) {
	System.out.println("pattern :11");
	int or=n;
	n=2*n;
	for(int i=1;i<=n;i++) {
		
		for(int k=1;k<=n;k++) {
			int pn=or-Math.min(Math.min(i, k),Math.min(n-i, n-k));
			System.out.print(pn);
		
		}
		System.out.println();
	}
	}

}
