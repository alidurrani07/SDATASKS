import java.net.*;
import java.util.*;
public class NetworkInterfaceExample {
    public static void main(String[] args) {
        try {
            // Get all network interfaces on the system
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            
            // Check if network interfaces are available
            if (networkInterfaces == null) {
                System.out.println("No network interfaces found.");
                return;
            }
            System.out.println("Available Network Interfaces:");
            // Iterate over each network interface
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                // Print information about each interface
                System.out.println("Name: " + networkInterface.getName());
                System.out.println("Display Name: " + networkInterface.getDisplayName());
                System.out.println("Loopback: " + networkInterface.isLoopback());
                System.out.println("Up: " + networkInterface.isUp());
                System.out.println("Is Virtual: " + networkInterface.isVirtual());
                System.out.println("Supports Multicast: " + networkInterface.supportsMulticast());
                System.out.println("----------------------------------");
            }
        } catch (SocketException e) {
            System.err.println("Error retrieving network interfaces: " + e.getMessage());
        }
    }
}
