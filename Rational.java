//Lecvy Chan
//9844
//2013.11.18
//Hw 27: Stop being Irrational


public class Rational {
   public int numerator, denominator;


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
	return numerator + "/" + denominator;

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

    //Add =================================================================
    public void add (Rational one) {
	numerator = (numerator * one.getDom()) + (denominator * one.getNum()) ;
	denominator = denominator * one.getDom();
    }

    //Subtract ============================================================
  public void subtract (Rational one) {
	numerator = (numerator * one.getDom()) - (denominator * one.getNum()) ;
	denominator = denominator * one.getDom();
  }

    //GCD ==================================================================
  

          public int gcd() {
	      int num = numerator;
	      int dom = denominator;
 if (num== 0){
	return dom;
    }
    if( dom == 0 ) {
    return num;
}

    while (num != dom) {
	if (num > dom) {
	    num = num - dom;
	}
	else {
	    dom = dom - num;
	}
    }

	return num;
    
    }


    //Reduce==============================================================
    public void reduce () {
	int gcd = gcd ();
	if (gcd != 1) {
	denominator /= gcd;
	numerator /= gcd;

    }
    }




    //GCD TAKES INPUTS==============================
    public static int gcder (int a, int b) {
	int temp = a - b;
	if (a > b) {
	    if (a % b == 0) {
		return b;
	    }
	    else {
		return gcder(temp, b);
	    }
	}
	else {
	    return gcder (b, a);
	}
    }

    //compareTo ==========================================
    public double compareTo (Rational x) {
	return (int)this.floatValue() - (int)x.floatValue();
    }
    

    public static void main (String [] args) {
	Rational wrong = new Rational (1,0);
	Rational yo = new Rational(1,2);
	Rational bro = new Rational(2,3);
	Rational one = new Rational(5,5);
	Rational two = new Rational(2,2);
	Rational three = new Rational(7,5);
	Rational four = new Rational(1,2);
	Rational five = new Rational (9,18);
	//COMPARETO
	System.out.println (yo.compareTo(three));
	System.out.println (five.compareTo(four));
	System.out.println (one.compareTo(bro));
	//TESTING GCD and REDUCE
	System.out.println (three);
	System.out.println (three.gcd());
	three.reduce();
	System.out.println (three);
	System.out.println (five);
	System.out.println (five.gcd());
	five.reduce();
	System.out.println (five);
	System.out.println (one.gcd());
	//DIVIDE and DENOMINATOR = 0
	System.out.println (wrong);
	one.divide(two);
	//SUBTRACT and PRINTING STUFF
	System.out.println (one);
	System.out.println (two);
	three.subtract(four);
	System.out.println (three);
	System.out.println (four);
	System.out.println (yo);
	System.out.println (yo.floatValue());
	yo.add (bro);
	System.out.println (yo);
	System.out.println (bro);
	yo.multiply(bro);	
	System.out.println (yo);
	yo.divide(bro);   
	System.out.println (yo);


 }
}