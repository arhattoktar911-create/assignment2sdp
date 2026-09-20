import logistics.Logistics;
import logistics.RoadLogistics;
import logistics.SeaLogistics;
import ui.GUIFactory;
import ui.MacOSFactory;
import ui.WindowsFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Logistics Application ===");

        System.out.print("Enter delivery mode (ROAD/SEA): ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        if (deliveryMode.isEmpty()) {
            System.out.println("Delivery mode cannot be empty.");
            System.out.println("Program stopped.");
            scanner.close();
            return;
        }

        System.out.print("Enter UI platform (WINDOWS/MACOS): ");
        String uiPlatform = scanner.nextLine().trim().toUpperCase();

        if (uiPlatform.isEmpty()) {
            System.out.println("UI platform cannot be empty.");
            System.out.println("Program stopped.");
            scanner.close();
            return;
        }

        Logistics logistics;

        if (deliveryMode.equals("ROAD")) {
            logistics = new RoadLogistics();
        } else if (deliveryMode.equals("SEA")) {
            logistics = new SeaLogistics();
        } else {
            System.out.println(
                    "Unsupported delivery mode: " + deliveryMode
            );
            System.out.println("Program stopped.");
            scanner.close();
            return;
        }

        GUIFactory guiFactory;

        if (uiPlatform.equals("WINDOWS")) {
            guiFactory = new WindowsFactory();
        } else if (uiPlatform.equals("MACOS")) {
            guiFactory = new MacOSFactory();
        } else {
            System.out.println(
                    "Unsupported UI platform: " + uiPlatform
            );
            System.out.println("Program stopped.");
            scanner.close();
            return;
        }

        System.out.println();
        System.out.println("Delivery mode: " + deliveryMode);
        System.out.println("UI platform: " + uiPlatform);
        System.out.println();

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        application.run();

        scanner.close();
    }
}