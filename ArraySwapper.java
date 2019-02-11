import java.util.Arrays;

class Main {
  
  public void arraySwap(int []inputArray) {
    // Initalize a variable named 'temp' to store the value of inputArray[0]
    int temp;

    // Switch inputArray[0] and inputArray[1] using temp as a middle man
    temp = inputArray[0];
    inputArray[0] = inputArray[1];
    inputArray[1] = temp;
  }
  
  // This method swaps any 2 items in any array
  public void arraySwapAny2(int []inputArray, int loc1, int loc2) {
    
    // Initialize a variable 'temp' to help switch the values of the arrays
    int temp;
    
    // First check to make sure that 'loc1' and 'loc2' are both greater than zero AND less than the array's length
    if ((loc1 > 0 && loc1 < inputArray.length) && (loc2 > 0 && loc2 < inputArray.length)) {
      temp = inputArray[loc1]; // Store the first value to be switched into 'temp'
      inputArray[loc1] = inputArray[loc2]; // Switch the first location with the second
      inputArray[loc2] = temp; // Set the second location's value to the value of the first position through 'temp'
    }
  }

  public static void main(String[] args) {

    Main testSwapper = new Main();
    
    // ***** Test the first swap method *******
    System.out.println("*** Trying first method ***");
    int[] exampleInput = {1, 2};
    int[] exampleOutput = {2, 1};
    System.out.println("exampleInput before: " + Arrays.toString(exampleInput));    
    System.out.println("exampleOutput: " + Arrays.toString(exampleOutput));    
    
    // This calls the first swap method
    testSwapper.arraySwap(exampleInput);
    System.out.println("exampleInput after: " + Arrays.toString(exampleInput));    
    
    if (java.util.Arrays.equals(exampleInput, exampleOutput)) {
      System.out.println("arraySwap succeeded");
    } else {
      System.out.println("arraySwap FAILED!");
    }

    // ***** Test the second swap method *******
    System.out.println("\n*** Trying second method ***");
    exampleInput = new int[]{1, 22, 333, 4444};
    exampleOutput = new int[]{1, 333, 22, 4444};
    System.out.println("exampleInput before: " + Arrays.toString(exampleInput));    
    System.out.println("exampleOutput: " + Arrays.toString(exampleOutput));    
    
    // This calls the second swap method
    testSwapper.arraySwapAny2(exampleInput, 1, 2);
    System.out.println("exampleInput after: " + Arrays.toString(exampleInput));    
    
    if (java.util.Arrays.equals(exampleInput, exampleOutput)) {
      System.out.println("arraySwapAny2 succeeded");
    } else {
      System.out.println("arraySwapAny2 FAILED!");
    }
  }
}
