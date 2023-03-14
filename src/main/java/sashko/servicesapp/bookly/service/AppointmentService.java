package sashko.servicesapp.bookly.service;

import sashko.servicesapp.bookly.model.Appointment;

import java.util.List;

public interface AppointmentService {

    List<Appointment> getAllAppointments();

    Appointment getAppointment(Long appointmentId);
}
