
import java.util.*;
import java.io.*;

public class Task {
    private List<String> assignedMembers = new ArrayList<>();

    public void assignTo(String member) {
        assignedMembers.add(member);
    }

    public void updateStatus(String status) {
        
    }

    public boolean isOverdue() {
        return false;
    }

    public List<String> getAssignedMembers() {
        return assignedMembers;
    }

    public static void main(String[] args) {
        Task task = new Task();
        task.assignTo("Alice");
        task.assignTo("Bob");
        System.err.println("Assigned Members: " + task.getAssignedMembers());
    }
}
