package restaurant_management_system;

class RestaurantOwner extends User {
    private String ownerId;

    public RestaurantOwner(String name, String phone) {
        super(name, phone);
        this.ownerId = "OWNER1";
    }

    public String getOwnerId() { return ownerId; }
}

