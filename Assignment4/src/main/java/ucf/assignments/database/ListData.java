/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Diego Santiago
 */

package ucf.assignments.database;

public class ListData {
    //calls and is called by the ListController, facilitates sorting and storage
    private String listname;

    public ListData() {
    }

    public ListData(String listname) {
        this.listname = listname;
    }

    public String getListname() {
        return listname;
    }

    public void setListname(String listname) {
        this.listname = listname;
    }
}

