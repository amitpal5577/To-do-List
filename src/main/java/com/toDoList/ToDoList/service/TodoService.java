package com.toDoList.ToDoList.service;




import com.toDoList.ToDoList.modle.ToDo;
import org.springframework.stereotype.Service;

import java.util.*;
        import java.util.concurrent.atomic.AtomicLong;

@Service
public class TodoService {
    private final Map<Long, ToDo> todos = new LinkedHashMap<>();
    private final AtomicLong counter = new AtomicLong();

    public List<ToDo> getAllTodos() {
        return new ArrayList<>(todos.values());
    }

    public ToDo addTodo(String text) {
        Long id = counter.incrementAndGet();
        ToDo todo = new ToDo(id, text, false);
        todos.put(id, todo);
        return todo;
    }

    public void toggleTask(Long id) {
        ToDo todo = todos.get(id);
        if (todo != null) {
            todo.setDisabled(!todo.isDisabled());
        }
    }

    public void editTask(Long id, String text) {
        ToDo todo = todos.get(id);
        if (todo != null) {
            todo.setText(text);
        }
    }

    public void deleteAll() {
        todos.clear();
    }
}