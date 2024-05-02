package com.pw.designpattern.adapter;

// Adapter class implementing the Target interface who is which one the client expect (Example client want to have a call() method)
class CellPhoneAdapter implements CellPhone {
    private FriendCellPhone friendCellPhone;

    public CellPhoneAdapter(FriendCellPhone friendCellPhone) {
        this.friendCellPhone = friendCellPhone;
    }

    @Override
    public void call() {
        friendCellPhone.ring(); // adapt ring() from FriendCellPhone to feet what the user contract expect
    }

}
