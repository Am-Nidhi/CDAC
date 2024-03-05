class que18{

	public static void main(String args[]){
		System.out.println("Simple Calculator");
		System.out.println("-----------------");
		int firstNumber = 10;
		System.out.println("Entered first number: " + firstNumber);

		int secondNumber = 5;
		System.out.println("Entered second number: " + secondNumber);
		
		System.out.println('\n'+"choose an operation:");
		System.out.println("1.Addition"+ '\n'+"2.Subtraction" + '\n'+"3.Multiplication"+ '\n'+"4.Division");
		
		int operation = 3; // for now
		System.out.println('\n' + "Entered choice:" + operation);

		int Result;
		switch(operation) {
			case 1:
    			Result = firstNumber + secondNumber;
			System.out.println('\n'+"Result: " + firstNumber +" + " + secondNumber + " = " + Result);
    			break;

			case 2:
    			Result = firstNumber - secondNumber;
			System.out.println('\n'+"Result: " + firstNumber +" - " + secondNumber + " = " + Result);
    			break;

			case 3:
    			Result = firstNumber * secondNumber;
			System.out.println('\n'+"Result: " + firstNumber +" * " + secondNumber + " = " + Result);
    			break;

			case 4:
    			Result = firstNumber / secondNumber;
			System.out.println('\n'+"Result: " + firstNumber +" / " + secondNumber + " = " + Result);
    			break;
		
		
		}
	}

}