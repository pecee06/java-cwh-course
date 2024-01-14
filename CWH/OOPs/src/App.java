// Procedural Programming
// ----------------------

// Procedural Programming can be defined as a programming model which is derived from structured programming, based upon the concept of calling procedure. Procedures, also known as routines, subroutines or functions, simply consist of a series of computational steps to be carried out. During a program’s execution, any given procedure might be called at any point, including by other procedures or itself.

// Object-oriented programming
// ---------------------------

// Objects
// -------
// Any entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical.
// An Object can be defined as an instance of a class. An object contains an address and takes up some space in memory. Objects can communicate without knowing the details of each other's data or code. The only necessary thing is the type of message accepted and the type of response returned by the objects. Example: A dog is an object because it has states like color, name, breed, etc. as well as behaviors like wagging the tail, barking, eating, etc.

// Classes
// -------
// Collection of objects is called class. It is a logical entity.
// A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space.

// Object-oriented programming can be defined as a programming model which is based upon the concept of objects. Objects contain data in the form of attributes and code in the form of methods. In object-oriented programming, computer programs are designed using the concept of objects that interact with the real world. Object-oriented programming languages are various but the most popular ones are class-based, meaning that objects are instances of classes, which also determine their types.

// Modelling a problem in OOPs
// noun => classes eg: employee
// property => attributes eg: name, salary
// verb => methods eg: greetName(), incSalary()

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Object Oriented Programming System");
    }
}

// Key concepts
// ------------

// 1. Abstraction : Hiding internal details and showing functionality is known as abstraction.
// Basically, "Aam khao, guthli mat gino!"
// Eg: You are driving a car, you applied brakes and the car stopped. Do you know, how exactly the mechanism worked, how by applying a minute amount of force, you've stopped the fast moving car? No, you don't, neither you need to know. It's enough for you to know that, when you'll apply brakes, the car will stop for sure.
// Eg: You've unlocked your smartphone using your fingerprint. Do you know, how exactly the circuitery worked? No, you don't, neither you need to know. It's enough for you to know that when you press your finger against the scanner, your phone will unlock for sure.

// 2. Encapsulation : Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.
// A java class is the example of encapsulation.
// Eg: Your phone is a capsule, which encapsulates camera, mic, speaker, display, etc.

// 3. Inheritance : When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability.
// Eg: You own a factory that manufacture cars. Now, your company wants to produce flying cars. So, will you start from the very begining (like designing wheels, seats, panels, chassy, etc.)? No, you would take your existing car, and build upon it so as to upgrade it to a flying car.
// Basically concept of DRY ,i.e., Do Not Repeat Yourself

// 4. Polymorphism :  If one task is performed in different ways, it is known as polymorphism.
// In Java, we use method overloading and method overriding to achieve polymorphism.
// Eg: You have a shoe, sometimes it's a footwear, at other times it's a weapon to kill insects :>
// Eg: Let's take the case of a smartphone. You're recording a video using it, right now it's your video camera. You're using it's flash to see in dark, right now it's your torch. You're playing music using it, right now it's your music player.
// Eg: We humans, we have multiples features. When we cook, we're cooks. When we sing, we're singers. When we learn, we're students. When we teach, we're teachers.