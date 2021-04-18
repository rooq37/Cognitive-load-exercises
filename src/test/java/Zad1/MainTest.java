package Zad1;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {

    List<Integer> input1 = new ArrayList<Integer>(Arrays.asList(
            1721,
            979,
            366,
            299,
            675,
            1456
    ));

    @Test
    public void solve1() throws IOException {
        List<Integer> input = readAsListOfInteger("/Zad1/input1.txt");
        Main main = new Main();
        Assert.assertEquals(514579, main.solve(input));
    }

    @Test
    public void solve2() throws IOException {
        List<Integer> input = readAsListOfInteger("/Zad1/input2.txt");
        Main main = new Main();
        Assert.assertEquals(1016619, main.solve(input));
    }

    private List<Integer> readAsListOfInteger(String path) throws IOException {
        List<String> inputList = IOUtils.readLines(this.getClass().getResourceAsStream(path), "UTF-8");
        return inputList.stream().map(Integer::parseInt).collect(Collectors.toList());
    }
}
