package Zad3;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void solve1() throws IOException {
        List<String> input = readAsList("/Zad3/input1.txt");
        Zad3.Main main = new Zad3.Main();
        Assert.assertEquals(820, main.solve(input));
    }

    @Test
    public void solve3() throws IOException {
        List<String> input = readAsList("/Zad3/input2.txt");
        Zad3.Main main = new Zad3.Main();
        Assert.assertEquals(989, main.solve(input));
    }

    private List<String> readAsList(String path) throws IOException {
        return IOUtils.readLines(this.getClass().getResourceAsStream(path), "UTF-8");
    }
}
