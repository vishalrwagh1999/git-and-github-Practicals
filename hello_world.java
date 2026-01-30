import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import time;

public class hello_world {
    
    private static List<String> logs = new ArrayList<>();
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    public static void main(String[] args) {
        System.out.println("=== Welcome to DevOps day 2 session ===");
        
        // Initialize application
        initializeApplication();
        
        // Display user information
        User user = new User("Vishal", "vishal@example.com", 25);
        user.displayInfo();
        
        // Process data
        processData();
        
        // Display logs
        displayLogs();
    }
    
    private static void initializeApplication() {
        addLog("Application initialized");
        System.out.println("Initializing application...");
    }
    
    private static void processData() {
        addLog("Starting data processing");
        System.out.println("\n--- Processing Data ---");
        
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum: " + calculateSum(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
        
        addLog("Data processing completed");
    }
    
    private static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    private static double calculateAverage(List<Integer> numbers) {
        if (numbers.isEmpty()) return 0;
        return (double) calculateSum(numbers) / numbers.size();
    }
    
    private static void addLog(String message) {
        String timestamp = LocalDateTime.now().format(formatter);
        logs.add("[" + timestamp + "] " + message);
    }
    
    private static void displayLogs() {
        System.out.println("\n--- Application Logs ---");
        for (String log : logs) {
            System.out.println(log);
        }
    }
    
    // Inner User class
    static class User {
        private String name;
        private String email;
        private int age;
        
        public User(String name, String email, int age) {
            this.name = name;
            this.email = email;
            this.age = age;
        }
        
        public void displayInfo() {
            System.out.println("\n--- User Information ---");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Age: " + age);
        }
    }
}
