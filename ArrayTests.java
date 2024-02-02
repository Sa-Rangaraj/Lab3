import static org.junit.Assert.*;

import javax.swing.plaf.synth.SynthStyle;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testReverseInPlaceBug(){
    int[] originalArr = {1, 2, 3};
    int[] reversedOriginArray = {3, 2, 1};
    ArrayExamples.reverseInPlace(originalArr); 
    assertArrayEquals(reversedOriginArray, originalArr);
  }
 
  @Test
  public void testReversedBug(){
    int[] originalArr = {1, 2, 3};
    int[] reversedOriginArray = {3, 2, 1};
    int[] reversedWithMethod = ArrayExamples.reversed(originalArr); 
    assertArrayEquals(reversedOriginArray, reversedWithMethod);
  }
}
