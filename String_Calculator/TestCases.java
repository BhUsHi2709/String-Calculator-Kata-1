package String_Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class TestCases {
    @Test
    public void nullCase() {
        assertEquals(0, Calculator.Add(""));
    }

    @Test
    public void singleArgument() {
        assertEquals(1, Calculator.Add("1"));
    }

    @Test
    public void sumOfTwoArguments() {
        assertEquals(3, Calculator.Add("1,2"));
    }

    @Test
    public void sumOfMultipleArguments() {
        assertEquals(6, Calculator.Add("1,2,3"));
    }

    @Test
    public void acceptNewLineAsDelimiter() {
        assertEquals(6, Calculator.Add("1\n2,3"));
    }

    @Test
    public void shouldAcceptCustomDelimiters() {
        assertEquals(3, Calculator.Add("//;\n1;2"));
    }

    @Test
    public void exceptionOnNegativeInput() {
        try {
            Calculator.Add("-1,-2,3");
        } catch (RuntimeException ex) {
            assertEquals("Negatives Not Allowed:[-1, -2]", ex.getMessage());
        }
    }

}