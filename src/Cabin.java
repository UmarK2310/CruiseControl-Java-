public class Cabin {
    private int cabinNumber;
    private String category;
    private boolean availability;
    private String guestName;
    private int rate;

    public Cabin(int cabinNumber, String category, int rate) {
        this.cabinNumber = cabinNumber;
        this.category = category;
        this.rate = rate;
        this.availability = true;
    }

    public int getCabinNumber() {
        return cabinNumber;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return availability;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getRate() {
        return rate;
    }

    public void bookCabin(String guestName) {
        this.guestName = guestName;
        this.availability = false;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}