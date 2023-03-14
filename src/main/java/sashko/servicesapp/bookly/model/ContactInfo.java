package sashko.servicesapp.bookly.model;

public class ContactInfo {

    private String address;

    private String phoneNumber;

    private String email;

    private String facebookLink;

    private String instagramLink;

    public ContactInfo() {
    }

    public ContactInfo(String address, String phoneNumber, String email, String facebookLink, String instagramLink) {
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.facebookLink = facebookLink;
        this.instagramLink = instagramLink;
    }
}
