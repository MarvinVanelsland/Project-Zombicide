# Project Zombicide

## Team

- Marvin Vanelsland
- Theophane Tartare
- Lucas Reverchon
- Logan Josse

## Project Overview

This project is a simplified model of the **Zombicide** board game. It includes both an **automatic/random** version and a **manual/interactive** version.

### Project Details

- **Automatic Version**: Runs with randomized gameplay, creating a fully automated Zombicide experience.
- **Interactive Version**: Allows players to make decisions and interact directly with the game.

You can view the detailed project subject [here](https://www.fil.univ-lille.fr/~varre/portail/l2s4-projet/sujet2024.pdf).


### UML Diagram

The UML diagram for this project can be found here: [UML Diagram](./UML.png)

## Getting Started

This section covers the steps for generating documentation, compiling the project, and creating the executable `.jar` files.

### Makefile Commands

- **Generate Documentation**  
  To generate the Javadoc documentation, run:

```
make doc
```

- **Compile the Project**  
  To compile the Java classes, run:

```
make cls
```

- **automatic Version**  
  To create the zombicide.jar executable, run:

```
make zombicide.jar
```

- **Interactive Version**  
  To create the zombicide-interactive.jar executable, run:

```
make zombicide-interactive.jar
```

- **Clean Up Generated Files**  
  To clean up the docs and classes directories, run:

```
make clean
```

### Running the Project

Once the `.jar` files are created, you can run them as follows:

- **Run the Automatic Version**  
To run the `zombicide.jar` file (automatic/random version):

```
java -jar jar/zombicide.jar
```

- **Run the Interactive Version**  
To run the `zombicide-interactive.jar` file (manual/interactive version):

```
java -jar jar/zombicide-interactive.jar
```