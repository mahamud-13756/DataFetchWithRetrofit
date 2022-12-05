package com.example.retrifit_datafetch_lab;

public class ModelPostData
{
    String student_id;
    String contact;
    String name,email,batch_no,address;

    public ModelPostData() {
    }

    public ModelPostData(String student_id, String contact, String name, String email, String batch_no, String address) {
        this.student_id = student_id;
        this.contact = contact;
        this.name = name;
        this.email = email;
        this.batch_no = batch_no;
        this.address = address;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
