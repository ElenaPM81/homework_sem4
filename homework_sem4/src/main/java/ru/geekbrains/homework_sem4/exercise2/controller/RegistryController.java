package ru.geekbrains.homework_sem4.exercise2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.homework_sem4.exercise2.service.RegistryService;
import ru.geekbrains.homework_sem4.exercise2.repository.PatientCard;

import java.util.List;
@Controller
@RestController   //обозначает, что данный класс является контроллером
@RequestMapping("/patients")    // указывает что это базовый путь, на который контроллер будет реагировать
public class RegistryController {

    public String home() {
        return "index2";
    }


    private final RegistryService registryService;

    public RegistryController(RegistryService registryService) {
        this.registryService = registryService;
    }

//   метод который должен обрабатывать GET-запросы
    @GetMapping("/cards")
public ResponseEntity<List<PatientCard>> getAllPatientCards() {
        return new ResponseEntity<>(registryService.getAllPatientCards(), HttpStatus.OK);
    }


    // метод который должен обрабатывать POST-запросы
    @PostMapping ("/cards")
    public ResponseEntity addPatientCard(@RequestBody PatientCard patientCard)
    {
        return new ResponseEntity<>(registryService.addPatientCard(patientCard), HttpStatus.CREATED); }


    @GetMapping("/{id}")
    public ResponseEntity<PatientCard> getPatientCardById(@PathVariable Long id) { PatientCard patientCard = registryService.getPatientCardById(id);
        if (patientCard == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } return new ResponseEntity<>(patientCard, HttpStatus.OK);
    }

    // метод который должен обрабатывать DELETE-запросы
    @DeleteMapping("/{id}") public ResponseEntity<Void> deleteBook(@PathVariable Long id) { registryService.deletePatientCard(id); return new ResponseEntity<>(HttpStatus.NO_CONTENT); }

}
