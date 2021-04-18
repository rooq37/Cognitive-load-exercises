package Zad2;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class MainTest {

    @Test
    public void solve1() throws IOException {
        List<String> input = readAsList("/Zad2/input1.txt");
        Zad2.Main main = new Zad2.Main();
        Assert.assertEquals(2, main.solve(input));
    }

    @Test
    public void solve2() throws IOException {
        List<String> input = readAsList("/Zad2/input2.txt");
        Zad2.Main main = new Zad2.Main();
        Assert.assertEquals(524, main.solve(input));
    }

    private List<String> readAsList(String path) throws IOException {
        return IOUtils.readLines(this.getClass().getResourceAsStream(path), "UTF-8");
    }

}
