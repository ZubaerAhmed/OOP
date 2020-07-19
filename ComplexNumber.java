package OOP;

public class ComplexNumber{
	public static void main(String[] a){
		Complex2 C1 = new Complex2(4,8);
		Complex2 C2 = new Complex2(5,7);
		Complex2 C3 = new Complex2();
		C3 = C3.AddComplex(C1,C2);
		
		System.out.println("SUM:" + C3.Real +"+i" + C3.Imag);
	}
}
//===============================================================
class Complex2 {
	int Real,Imag;
	
	Complex2(){	
	}
	
	Complex2(int Real,int Imag){
		this.Real = Real;
		this.Imag = Imag;
	}
	
	Complex2 AddComplex(Complex2 C1,Complex2 C2){
		Complex2 CSum = new Complex2();
		CSum.Real = C1.Real + C2.Real;
		CSum.Imag = C1.Imag + C2.Imag;
		return CSum;
	}
}

