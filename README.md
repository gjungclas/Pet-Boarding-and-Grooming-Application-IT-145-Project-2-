# Pet Boarding and Grooming Application - IT 145 Project 2 
## Overview of Grazioso Salvare Specification Document
Grazioso Salvare currently uses dogs as search and rescue animals. They expect to begin training monkeys as search and rescue animals as well. In current operations, dogs are given the status of "intake" before training starts. Once in training, their status can change to one of five phases: Phase I, Phase II, Phase III, Phase IV, and Phase V. When a dog graduates from training, it is given the status of "in service" and is considered a rescue animal. If a dog does not successfully make it through training, it is given the status of "farm," indicating that it will live a life of leisure on a Grazioso Salvare farm.
### The Animals
When Grazioso Salvare acquires a dog, they record its name, breed, gender, age, and weight. Grazioso Salvare also records the date and the location where they acquired the dog. Additionally, they track dates for when dogs graduate the program and are placed into "in service" status.
### Special Note on Monkeys
As Grazioso Salvare explores the use of monkeys as search and rescue animals, they want their system to support monkey tracking as well as dog tracking. They have identified the following monkey species that are eligible for training:
- Capuchin
- Guenon
- Macaque
- Marmoset
- Squirrel monkey
- Tamarin

There are important data elements for monkeys in addition to what the company uses for dogs: tail length, height, body length, and species.
### Functionality
Work on this application has already been started. You must complete the following functionality:
- Create the Monkey Class. The class should do the following:
  - Inherit from the RescueAnimal class
  - Include monkey-specific attributes
  - Include mutator and accessor methods for each attribute
- Complete the Driver Class:
  - Add a menu loop that does the following:
    - Displays the (included) menu
    - Accepts and validates user input
    - Takes the appropriate action based on the input
  - Complete the method to intake a new dog.
  - Implement the method to intake a new monkey.
  - Implement the method to reserve an animal.
  - Implement the method to print (display) information about the animals.

Note: There are comments throughout the code to guide you. There is also a method that adds some data to a dog array list so that you will have data for testing. You can add a similar method for monkeys if you like.
