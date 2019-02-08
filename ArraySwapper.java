class ArraySwapper {

  public int[] arraySwap(int []inputArray) {

    // Swap the two items in "inputArray" and return the output
    int[] outputArray = new int[2];

    // Set the first item of the outputArray to the second item of the inputArray
    outputArray[0] = inputArray[1];

    // Set the second item of the outputArray to the first item of the inputArray
    outputArray[1] = inputArray[0];

    // Return the new, swapped array
    return outputArray;

  }

  public static void main(String[] args) {

    ArraySwapper testSwapper = new ArraySwapper();

    int[] exampleInput = {1,2};
    int[] exampleOutput = testSwapper.arraySwap(exampleInput);

    if (exampleInput[0] != exampleOutput[1] || exampleInput[1] != exampleOutput[0]) {
      System.out.println("Swap failed");
    } else {
      System.out.println("Swap succeeded!");
    }
  }
}
