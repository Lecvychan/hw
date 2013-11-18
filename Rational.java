//Lecvy Chan
//9844
//2013.11.18
//Hw 27: Stop being Irrational


public class Rational {
    private int numerator, denominator;


    //DEFAULT CONSTRUCTOR ==================================================
    public Rational () {
	numerator = 0;
	denominator = 1;
    }


    //CONSTRUCTOR=========================================================
    public Rational (int num, int dom) {
	numerator = num;
	denominator = dom;
	if (dom == 0) {
	    System.out.println ("Denominator cannot be zero");
	    numerator = 0;
	    denominator = 1;
	}
    }
    //GET VALUES===========================================================
    public int getNum (){
	return numerator;
    }

    public int getDom () {
	return denominator;
    }


    //toString==============================================================
    public String toString () {
	String retStr = numerator + "/" + denominator;
	return retStr;
    }

    //FloatValue=========================================================
    public double floatValue () {
	double answer = (double)numerator / denominator;
	return answer;
    }

    //Multiply ==========================================================
    public void multiply (Rational one) {
	numerator = numerator * one.getNum();
	denominator *= one.getDom();
    }

    //Divide ===============================================================
    public void divide (Rational one ) {
	numerator = numerator / one.getNum();
	denominator /= one.getDom();
    }

    public static void main (String [] args) {
	Rational yo = new Rational(1,2);
	Rational bro = new Rational(2,3);
	System.out.println (yo);
	System.out.println (yo.floatValue());
	yo.multiply(bro);	
	System.out.println (yo);
	yo.divide(bro);   
	System.out.println (yo);
 }
}