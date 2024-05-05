package ru.geekbrains.homework_sem4.exercise2.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.homework_sem4.exercise2.repository.PatientCard;
import ru.geekbrains.homework_sem4.exercise2.repository.Registry;

import java.util.List;
@Service
public class RegistryService {
    private final Registry registry = new Registry();
    public List<PatientCard> getAllPatientCards() {
        return registry.getAllPatientCards();
    }
    public PatientCard getPatientCardById(Long id) {
        return registry.getPatientCardById(id);
    }
    public Object addPatientCard(PatientCard patientCard) {
        registry.addPatientCard(patientCard);
        return patientCard.getId();
    }

    public void deletePatientCard(Long id) {
        registry.deletePatientCard(id);
    }
}
