package enums;

public class MainEnums {
    public static void run() {
        System.out.println("\nENUM EXAMPLES");

        UserRole role = UserRole.ADMIN;

        switch (role) {
            case ADMIN -> System.out.println("Role: Admin - full access");
            case MODERATOR -> System.out.println("Role: Moderator - limited access");
            case USER -> System.out.println("Role: User - basic access");
        }

        // exemplo de uso de enum em array
        for (UserRole r : UserRole.values()) {
            System.out.println("Enum value: " + r);
        }
    }
}
