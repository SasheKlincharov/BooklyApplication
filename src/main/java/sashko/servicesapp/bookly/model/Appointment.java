package sashko.servicesapp.bookly.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @DateTimeFormat(fallbackPatterns = "dd-MM-yyyy")
    private LocalDateTime fromDateTime;

    @DateTimeFormat(fallbackPatterns = "dd-MM-yyyy")
    private LocalDateTime toDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Tenant tenant;

    private boolean isBooked;

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public Appointment() {
    }

}
