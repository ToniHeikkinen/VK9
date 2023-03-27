package com.example.studentregister;

import java.util.ArrayList;
public class userStorage {
    private static ArrayList<User> users = new ArrayList<>();

    private static userStorage storage = null;


    private userStorage() {
    }
    public static void listUsers() {
        int i = 0;
        for(i = 0; i < users.size(); i++) {
            System.out.print(users.get(i));
        }
    }
    public static userStorage getInstance() {
        if(storage == null) {
            storage = new userStorage();
        }
        return storage;
    }

    public static String listStudents() {
        String first1 =null;
        StringBuilder str = new StringBuilder();
        for (User User : users) {
            first1 = ("Nimi on: " + User.getFirstName() + " " + User.getLastName() + "\n Sähköposti: " + User.getEmail() + "\n Koulutussuuntaus: " + User.getDegreeProgram()+"\n");
            str.append(first1);
        }
        System.out.println(str);
        System.out.println("\n");
        return str.toString();
    }

    public static userStorage getStorage() {
        return storage;
    }

    public static ArrayList<User> getUsers() {

        return users;
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public User getRocketById(int id) {
        return users.remove(id);
    }

}
