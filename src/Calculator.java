
public class Calculator <T>{
	public boolean calculate(T t1, T t2, T t3){
        try{
            if(t1 instanceof Integer){
                if( (int)t3 == (int)(t1)/(int)t2){
                    return true;
                }
            }
            else if(t1 instanceof String){
                if((t3.equals((String)(t1)+(String)t2))){
                    return true;
                }
            }
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
        catch(NumberFormatException e) {
        	System.out.println("Cannot parse non integer to integer type");
        }
        return false;
    }
}
