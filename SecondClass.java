package Com.sarthak;

public class SecondClass {
	
	    private int lastDigit1;
	    private int lastDigit2;

	    public void SecondClass(FirstClass firstClass) {
	        this.lastDigit1 = firstClass.getNumber1() % 10;
	        this.lastDigit2 = firstClass.getNumber2() % 10;
	    }

	    public int getLastDigit1() {
	        return lastDigit1;
	    }

	    public int getLastDigit2() {
	        return lastDigit2;
	    }
	}

	

