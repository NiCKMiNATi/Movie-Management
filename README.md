# Movie-Management

This is a project to learn JAVA WEB Application by using:
1. JAVA SpringBoot
2. ThymeLeaf (A framework that helps in embedding JAVA code/variables into HTML)
3. H2 Database (An in-built lightweight database which only runs when the app is running)
4. Lombok dependency (Helps reducing boilerplate code with the help of annotations)

Created using : 
1. Spring Initializr website to generate the necessary files
2. IntelliJ
3. ChatGPT
4. Git BASH(to push code to Repository)

Folders:
1. Model
2. Repository
3. Service 
4. Controller 
5. Movie

Details:
MovieManagementApplication.java -
 - The starting point of the application
 - Run this file/code to start the project/webpage

Model - 
  - aka 'Entity'
  - Used to store the Variables that are gonna be used throughout the project
  - Uses annotations like
      - @Entity -> To let the app know that this is an Entity file
      - @Data -> An annotation of Lombok dependency which automatically creates Getters and Setters.
      - @Id -> To let Jpa know that this is a unique variable
      - @GeneratedValue(strategy = GenerationType.IDENTITY) -> Lets Jpa to automatically generate ID values
      - @NoArgsConstructor -> Necessary to create a no-argument constructor (Need to specify this annotation)
      - @AllArgsConstructor -> Necessary to create all-argument constructor (Need not write this, unless there is a use for it)

Repsository - 
  - An interface that allows contact with the Database
  - Extends JpaRepository Interface
  - Uses annotations like
      - @Repository -> To let Jpa know this is the repository

Service -
  - Where the Backend starts
  - Here is where the methods are created to add, edit, save, delete and list (basic CRUD operations)
  - Uses annotations like
      - @Service - Lets Jpa know this is the Service file
      - @Autowired - Allows us to embed Repository file into this, and auto-add dependencies

Controller - 
  - Where the real backend is.
  - Allows our project to be an API (Application Programming Interface)
  - Gets Request from the User, gets in contact with the database and returns Response to the HTML files, which the user can see.
  - Uses annotations like
      - @Controller -> Lets Jpa know this is the Constructor file
      - @Autowired -> Allows us to embed Service file into this, and auto-add dependencies
      - @RequestMapping("/") -> To create the base path/URL
      - @GetMapping, @PostMapping -> To get the certain URL, to save data into certain URL using POST method

Movie -
  - Contains all the necessary HTML files.(In other terms, the JSP[Java Servlet Pages] files)
