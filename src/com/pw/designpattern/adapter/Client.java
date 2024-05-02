package com.pw.designpattern.adapter;

public class Client {
    public static void main(String[] args) {
        // Using the adapter to make Adaptee work with Target interface
        FriendCellPhone adaptee = new FriendCellPhone();
        CellPhone adapter = new CellPhoneAdapter(adaptee);
        adapter.call();
    }
}
