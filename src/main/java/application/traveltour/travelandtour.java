// Location.java - Represents information about a location
public class Location {
    private String name;
    private List<Hotel> hotels;
    private List<String> touristLocations;

    // Constructor, getters, and setters
}

// Hotel.java - Represents information about a hotel
public class Hotel {
    private String name;
    private List<String> cabs;
    
    // Constructor, getters, and setters
}

// BookingRequest.java - Represents a booking request
public class BookingRequest {
    private String location;
    private String customerName;
    private boolean paymentStatus;
    
    // Constructor, getters, and setters
}

// Feedback.java - Represents customer feedback
public class Feedback {
    private String location;
    private String customerName;
    private String comments;
    
    // Constructor, getters, and setters
}

// AdminService.java - Provides admin-related functionalities
public class AdminService {
    private List<Location> locations;
    private List<BookingRequest> bookingRequests;
    private List<Feedback> feedbackList;

    public void addLocation(Location location) {
        // Logic to add a new location
    }

    public void viewBookingRequests() {
        // Logic to view booking requests
    }

    public void confirmBookingRequest(BookingRequest request) {
        // Logic to confirm a booking request
    }

    public void rejectBookingRequest(BookingRequest request) {
        // Logic to reject a booking request
    }

    public void monitorPaymentStatus() {
        // Logic to monitor payment status
    }

    public void viewFeedback() {
        // Logic to view customer feedback
    }
}

// Main.java - Entry point of the application
public class Main {
    public static void main(String[] args) {
        // Initialize and use AdminService here
    }
}
