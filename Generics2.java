


// generic class 

// how to use generic parameter type in method
// bound to use some values - bounded parameter type - extends( for both class and interface)
//extends Number - T can only accept values that are child of Number - Integer, Long = Bounded parameter type
// why - when we want the parameter type to accept only few classses/intefrace and their childclasses/interfaces
// upper bound - super - only types that are parent of the class can be passed


class AnyDataType<U>{
	
	U var;
	
	public <? super Integer>void printValue(U value){
		System.out.println(value);
	}

}





public class Generics2 {
	
	public static void main(String args[]) {
		
		AnyDataType<String> intObj = new AnyDataType<>();
		intObj.var = "String";
		
		intObj.printValue(intObj.var);
		
	}
	
}