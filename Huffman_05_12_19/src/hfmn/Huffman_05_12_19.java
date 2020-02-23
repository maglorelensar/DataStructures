package hfmn;


import java.util.PriorityQueue; 
import java.util.Scanner; 



public class Huffman_05_12_19 { 


	public static void printCode(HuffmanNode root, String s) 
	{ 

		
		if (root.left 
				== null
			&& root.right 
				== null
			&& Character.isLetter(root.c)) { 

		
			System.out.println(root.c + ":" + s); 

			return; 
		} 

	
		printCode(root.left, s + "0"); 
		printCode(root.right, s + "1"); 
	} 

	
	public static void main(String[] args) 
	{ 

		Scanner s = new Scanner(System.in); 

		 
		int n = 6; 
		char[] charArray = { 'a', 'b', 'k', 'm', 'd', 'ğ' }; 
		int[] charfreq = { 50, 35, 20, 10, 8, 4 }; 
                  System.out.print("Karakter frekansları :a,b,k,m,d,ğ --> ");        
                for(int i=0; i<6; i++){
                    int x =charfreq[i];
                   System.out.print(x+" ");
                }
                System.out.println("");
                int a_bitsayisi=1; int b_bitsayisi=2; int k_bitsayisi=3; int m_bitsayisi=4; int d_bitsayisi=5; int ğ_bitsayisi=5;
                   int z= (charfreq[0]+charfreq[1]+charfreq[2]+charfreq[3]+charfreq[4]+charfreq[5]);
                   int h=(charfreq[0]+charfreq[1]+charfreq[2]+charfreq[3]+charfreq[4]+charfreq[5])*8;
                   
                   int b=charfreq[0]*a_bitsayisi+charfreq[1]*b_bitsayisi+charfreq[2]*k_bitsayisi+charfreq[3]*m_bitsayisi+charfreq[4]*d_bitsayisi+charfreq[5]*ğ_bitsayisi;
                   
                System.out.println("Frekansların toplamı : "+charfreq[0]+"+"+charfreq[1]+"+"+charfreq[2]+"+"+charfreq[3]+"+"+charfreq[4]+"+"+charfreq[5]+"="+z);
            
                System.out.print("Frekansların Huffmandan Önceki bit hesaplaması : ");
                System.out.println("127*8= "+h+" bit");
                System.out.print("Frekansların Huffmandan Sonraki bit hesaplaması : ");
                
               System.out.println("50*1+35*2+20*3+10*4+8*5+4*5= "+b+" bit");
                System.out.print("Elde ettiğimiz başarı= ");
             int basari=h-b;
                System.out.println("1016-280= "+basari);
		          System.out.println("Sıkıştırma Başarısı = %72");         
		PriorityQueue<HuffmanNode> q 
			= new PriorityQueue<HuffmanNode>(n, new MyComparator()); 

		for (int i = 0; i < n; i++) { 

			
			HuffmanNode hn = new HuffmanNode(); 

			hn.c = charArray[i]; 
			hn.data = charfreq[i]; 

			hn.left = null; 
			hn.right = null; 

			q.add(hn); 
		} 

		
		HuffmanNode root = null; 

		
		while (q.size() > 1) { 

			
			HuffmanNode x = q.peek(); 
			q.poll(); 

			 
			HuffmanNode y = q.peek(); 
			q.poll(); 

		
			HuffmanNode f = new HuffmanNode(); 

			
			f.data = x.data + y.data; 
			f.c = '-'; 
			
			f.left = x; 
			
			f.right = y; 

			
			root = f; 

			
			q.add(f); 
		} 

		
		printCode(root, ""); 
	} 
} 


