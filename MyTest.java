import java.util.*;
import java.io.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MyTest {

    @Test
    public void testAssignTo() {

        Task task = new Task();
        task.assignTo("Alice");
        task.assignTo("Bob");

        List<String> expectedMembers = Arrays.asList("Alice", "Bob");
        Assertions.assertEquals(expectedMembers, task.getAssignedMembers());
    }
}