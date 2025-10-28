
import java.util.*;
import java.io.*;

public class Task {
    private List<String> assignedMembers = new ArrayList<>();
    private String status;

    public void assignTo(String member) {
        assignedMembers.add(member);
    }

    public void updateStatus(String status) {
    }

    public String getStatus() {
        return status;
    }

    public boolean isOverdue() {
        if (assignedMembers.isEmpty()) {
            return true;
        }
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
