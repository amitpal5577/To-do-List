# Spring Boot Todo List Application

A simple Todo List web application built with **Spring Boot** and **Thymeleaf**.  
Allows you to add, edit, complete, and delete tasks, all using a clean UI and persistent server-side storage.

## Features

- Add new todo items
- Edit existing todos by clicking on the text and pressing Enter to save
- Mark todos as completed/incomplete using the checkbox
- Delete all todos with a single click
- Responsive and modern UI using custom CSS
- All operations handled on the server (no client-side JavaScript required)

## Folder Structure

```
src/
  main/
    java/
      com/example/todoapp/
        controller/      # Spring MVC controllers
        model/           # Todo entity/model
        service/         # Todo service (in-memory by default)
    resources/
      static/
        home.css        # Application CSS
      templates/
        todo-list.html   # Thymeleaf HTML template
```

## Getting Started

### Prerequisites

- Java 17 or above
- Maven

### Running the Application

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/todo-spring-boot.git
   cd todo-spring-boot
   ```

2. **Build and run:**
   ```bash
   mvn spring-boot:run
   ```

3. **Open your browser and visit:**
   ```
   http://localhost:8080/
   ```

### Usage

- **Add Todo:** Enter a task in the input field and click "Add".
- **Edit Todo:** Click the todo text, change it, and press Enter or click outside to save.
- **Complete Todo:** Click the checkbox to mark as completed (strikethrough style).
- **Delete All:** Click "Delete All" to remove all todos.




**Made with Spring Boot & Thymeleaf**