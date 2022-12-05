package com.example.retrifit_datafetch_lab;

import java.util.List;
public class ModelStatus {

    String status;
    List<ModelPostData> students;

    public ModelStatus() {
    }

    public ModelStatus(String status, List<ModelPostData> students) {
        this.status = status;
        this.students = students;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ModelPostData> getStudents() {
        return students;
    }

    public void setStudents(List<ModelPostData> students) {
        this.students = students;
    }
}
