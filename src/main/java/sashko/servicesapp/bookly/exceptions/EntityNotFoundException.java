package sashko.servicesapp.bookly.exceptions;

public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(Class<?> entityClass, Long id) {
        super("Object of class type: " + entityClass.getName() + " not found for id: " + id);
    }
    public EntityNotFoundException(Class<?> entityClass, String id) {
        super("Object of class type: " + entityClass.getName() + " not found for id: " + id);
    }

}
