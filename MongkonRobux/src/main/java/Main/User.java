package Main;

public class User {
    // กำหนดฟิลด์ (Attributes)
    private String username;
    private String password;
    private int balance;

    
    // Constructor (ตัวสร้าง) สำหรับคลาส User
    public User(String username, String password, int balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    // Getter และ Setter สำหรับแต่ละฟิลด์
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
     public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
