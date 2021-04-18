package Zad4;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    @Test
    public void solve() throws IOException {
        List<Long> input = readAsListOfLong("/Zad4/input1.txt");
        Zad4.Main main = new Zad4.Main();
        Assert.assertEquals(104054607, main.solve(input));
    }

    private List<Long> readAsListOfLong(String path) throws IOException {
        List<String> inputList = IOUtils.readLines(this.getClass().getResourceAsStream(path), "UTF-8");
        return inputList.stream().map(Long::parseLong).collect(Collectors.toList());
    }
}
