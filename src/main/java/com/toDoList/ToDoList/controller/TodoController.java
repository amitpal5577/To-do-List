package com.toDoList.ToDoList.controller;



import com.toDoList.ToDoList.modle.ToDo;
import com.toDoList.ToDoList.service.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todoList", todoService.getAllTodos());
        model.addAttribute("newTodo", new ToDo());
        return "todo-list";
    }

    @PostMapping("/todos")
    public String addTodo(@ModelAttribute("newTodo") ToDo newTodo) {
        todoService.addTodo(newTodo.getText());
        return "redirect:/";
    }

    @PostMapping("/todos/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {
        todoService.toggleTask(id);
        return "redirect:/";
    }

    @PostMapping("/todos/edit/{id}")
    public String editTask(@PathVariable Long id, @RequestParam String text) {
        todoService.editTask(id, text);
        return "redirect:/";
    }

    @PostMapping("/todos/deleteAll")
    public String deleteAll() {
        todoService.deleteAll();
        return "redirect:/";
    }
}