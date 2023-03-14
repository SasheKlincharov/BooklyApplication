package sashko.servicesapp.bookly.service.impl;

import org.springframework.stereotype.Service;
import sashko.servicesapp.bookly.exceptions.EntityNotFoundException;
import sashko.servicesapp.bookly.model.Appointment;
import sashko.servicesapp.bookly.repository.AppointmentRepository;
import sashko.servicesapp.bookly.service.AppointmentService;

import java.util.List;

@Service
public class AppointmentServiceImplementation implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentServiceImplementation(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointment(Long appointmentId) {
        return appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new EntityNotFoundException(Appointment.class, appointmentId));
    }
}
