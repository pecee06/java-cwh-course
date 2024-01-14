// Java Generics was introduced to deal with type-safe objects. It makes the code stable.Java Generics methods and classes, enables programmer with a single method declaration, a set of related methods, a set of related types. Generics also provide compile-time type safety which allows programmers to catch invalid types at compile time. Generic means parameterized types. Using generics, the idea is to allow any data type to be it Integer, String, or any user-defined Datatype and it is possible to create classes that work with different data types.

class MyGenericClass<T1,T2>{    // As a convention, we use 'T' for type in generics
    T1 name;
    T2 age;

    MyGenericClass(T1 name, T2 age){
        this.name = name;
        this.age = age;
    }

    T1 getName(){
        return name;
    }
    T2 getAge(){
        return age;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MyGenericClass<String,Integer> obj = new MyGenericClass<>("Priyanshu",18);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
