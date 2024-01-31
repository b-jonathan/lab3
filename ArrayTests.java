import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3, 4, 5, 7, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 6, 7, 5, 4, 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = { 1, 2 };
    assertArrayEquals(new int[] { 2, 1 }, ArrayExamples.reversed(input1));
  }
}
