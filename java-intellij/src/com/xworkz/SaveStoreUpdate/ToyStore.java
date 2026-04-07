package com.xworkz.SaveStoreUpdate;

public class ToyStore{

    String[] toyNames;
    int currentIndex;

    ToyStore(String[] toyNames){
        this.toyNames = toyNames;
    }


    void getToyName(String toyName){
        if (this.toyNames != null){

            if (this.currentIndex < this.toyNames.length){
                this.toyNames[currentIndex] = toyName;
                currentIndex++;
                System.out.println("Stored: " + toyName);
            } else {
                System.out.println("Array is full");
            }

        } else{
            System.out.println("Array is null");
        }
    }


    boolean searchToyName(String toyName){
        if (toyName != null && this.toyNames != null){

            for (String name : this.toyNames){
                if (name != null && name == toyName){
                    System.out.println("Found: " + toyName);
                    return true;
                }
            }

            System.out.println("Not Found: " + toyName);
        }
        return false;
    }


    boolean update(String newName, String oldName){

        if (this.toyNames != null && newName != null && oldName != null){
            int index = 0;

            for (String name : this.toyNames){
                if (name != null && name == oldName){
                    this.toyNames[index] = newName;
                    System.out.println("Updated " + oldName + " to " + newName);
                    return true;
                }
                index++;
            }
        }

        System.out.println("Update failed");
        return false;
    }
}