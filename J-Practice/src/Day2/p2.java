package Day2;
import java.util.Scanner;

class teams{
    private int groupId;
    private String groupName;

    // Setter for Group ID
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    // Setter for Group Name
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    // Override toString() to display group details
    @Override
    public String toString() {
        return "Group ID: " + groupId + ", Group Name: " + groupName;
    }
}

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        teams[] groups = new teams[3];

        // Taking input for 3 groups
        for (int i = 0; i < 3; i++) {
            groups[i] = new teams();

            System.out.println("Enter group ID:");
            groups[i].setGroupId(sc.nextInt());

            sc.nextLine(); // Consume newline after integer input

            System.out.println("Enter group name:");
            groups[i].setGroupName(sc.nextLine());
        }

        // Printing group details
        for (int i = 0; i < 3; i++) {
            System.out.println(groups[i].toString());
        }

        sc.close(); // Close scanner
    }
}
