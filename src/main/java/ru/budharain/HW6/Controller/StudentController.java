package ru.budharain.HW6.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.budharain.HW6.Model.Student;
import ru.budharain.HW6.Repository.StudentRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping
    public String mainView(Model model){
        List<Student> students = this.studentRepository.findAll();
        model.addAttribute("students",students);
        return "main";
    }
    @GetMapping("/add")
    public String addStudent(Student student){

        return "add";
    }
    @PostMapping
    public String addFormStudent(@Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "add";
        }
        this.studentRepository.save(student);
        return "redirect:/students";
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable("id")Long id){
        this.studentRepository.deleteById(id);
        return "redirect:/students";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model){
        Student student = this.studentRepository.findById(id).orElse(new Student());
        model.addAttribute("student",student);
        return "edit";
    }

}
