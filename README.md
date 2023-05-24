This assignment is designed to understand how you work and what your preferences are. Don't feel nervous, there is no a correct answer, the source code may not compile and you can search in Google and Stackoverflow, we also do it!!


# 📘 Functional requirements

This project lists every species of all Star Wars movies, using the following REST API https://com.optare.swapi.dev/ 

Your task is the following: Modify this project to list species with **planet** associated. For example:

```json
[
  {
    "name": "Human",
    "classification": "mammal",
    "designation": "sentient", 
    "planet": "Coruscant"
  },
  {
    "name": "Droid",
    "classification": "artificial",
    "designation": "sentient",
    "planet": "Coruscant"
  },
  {
    "name": "Wookie",
    "classification": "mammal",
    "designation": "sentient",
    "planet": "Kashyyyk"
  }
]
```

### 💡 Hints:

 * Reuse code of project
 * You may need another call to REST API to get planet. Check API documentation
 * Complete unit and integration tests

You can test project with following command:

```
$ ./mvnw spring-boot:run
``` 

or executing Integration Tests... :)

## 🔝 Points we like

* Add a `TODO` file explaining what more you will do if you would have more than 30 minutes. This is important.
* Add a very short `README` file explaining how to compile it, deploy it and use it. It may empty if you don't have time to do it, no problem at all. We'll discuss it later.

Some things you must consider:

If you are not familiar to git, this may take longer that expected. It's better to upload just one thing than nothing because lack of time.
Use English where you can use it.

Java and Groovy are our favourites languages.

Ask to your interviewer whatever you want, we are here to help.

Good luck and have fun! 😉💪