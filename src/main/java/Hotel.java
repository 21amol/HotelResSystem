public class Hotel {
    private String hotelName;
    private String customerType;
    private int hotelRegularRate;
    private int hotelWeekendRate;
    private int hotelStarRating;

    public Hotel(String hotelName,String customerType, int hotelRegularRate,int hotelWeekendRate, int hotelStarRating){
        this.hotelName = hotelName;
        this.customerType = customerType;
        this.hotelRegularRate = hotelRegularRate;
        this.hotelWeekendRate = hotelWeekendRate;
        this.hotelStarRating =  hotelStarRating;
    }
}