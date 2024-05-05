package ru.geekbrains.homework_sem4.exercise2.repository;

import ru.geekbrains.homework_sem4.exercise2.repository.PatientCard;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private List<PatientCard> aiiPatientCards = new ArrayList<>();
    private Long idCounter = 1L;

    public List<PatientCard> getAiiPatientCards() {
        return aiiPatientCards;
    }

    public PatientCard getPatientCardById(Long id) {
        for (PatientCard patientCard : aiiPatientCards) {
            if (patientCard.getId().equals(id)) {
                return patientCard;
            }
        }
        return null;
    }

    public void addPatientCard(PatientCard patientCard) {
        patientCard.setId(idCounter++);
        aiiPatientCards.add(patientCard);
    }

    public void deletePatientCard(Long id) {
        for (PatientCard patientCard : aiiPatientCards) {
            if (patientCard.getId().equals(id)) {
                aiiPatientCards.remove(patientCard);
                break;
            }
        }
    }

    public List<PatientCard> getAllPatientCards() {

        return aiiPatientCards;
    }
}
