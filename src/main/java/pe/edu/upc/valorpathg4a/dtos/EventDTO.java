package pe.edu.upc.valorpathg4a.dtos;

import pe.edu.upc.valorpathg4a.entities.EventType;
import pe.edu.upc.valorpathg4a.entities.Users;

import java.time.LocalDate;

public class EventDTO {

    private int idEvent;
    private String name;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate registrationDate;
    private Users verterano;
    private Users psicologo;
    private EventType eventType;

    public int getIdEvent() {
        return idEvent;
    }

    public void setIdEvent(int idEvent) {
        this.idEvent = idEvent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Users getVerterano() {
        return verterano;
    }

    public void setVerterano(Users verterano) {
        this.verterano = verterano;
    }

    public Users getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Users psicologo) {
        this.psicologo = psicologo;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
}
