package org.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Addressbook {

    public ArrayList<org.phonebook.Phonebook> pb = new ArrayList();
    public void Addressbook(){
        pb.add(new org.phonebook.Phonebook("Иванов Иван Иванович", "1234567890", "Иваново"));
        pb.add(new org.phonebook.Phonebook("Сидоров Сидор Сидорович", "0987654321", "Сидорово"));
    }

    public void showAddressBook(){
        for(org.phonebook.Phonebook i : pb){
            System.out.println(i.getName() + " " + i.getPhone() + " " + i.getCity());
        }
    }
}
