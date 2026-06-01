import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testTriangleClassifier0() {
        int a = 2, b = 2, c = 2;
        String expected = "Tam giác đều";
        String result = TriangleClassifier.classifyTriangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier1(){
        int a = 2, b = 2, c = 3;
        String expected = "Tam giác cân";
        String result = TriangleClassifier.classifyTriangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier2(){
        int a = 3, b = 4, c = 5;
        String expected = "Tam giác thường";
        String result = TriangleClassifier.classifyTriangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier3(){
        int a = 8, b = 2, c = 3;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.classifyTriangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier4(){
        int a = -1, b = 2, c = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.classifyTriangle(a,b,c);
        assertEquals(expected, result);
    }

    @Test
    void testTriangleClassifier5(){
        int a = 0, b = 1, c = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.classifyTriangle(a,b,c);
        assertEquals(expected, result);
    }
}