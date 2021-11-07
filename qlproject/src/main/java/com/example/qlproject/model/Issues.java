package com.example.qlproject.model;


import javax.persistence.*;

@Entity
public class Issues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idissues;
    private  String issuesName;
//     nội dung
     private  String content;
     private  String status;
     private  String startTime;
     private String endTime;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idWork", nullable = false)
    private Work idwork;

//    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE})
//    @JoinColumn(name = "accountName",referencedColumnName = "accountName")
//    private Account account;

    public Issues() {
    }

    public int getIdissues() {
        return idissues;
    }

    public void setIdissues(int idissues) {
        this.idissues = idissues;
    }

    public String getIssuesName() {
        return issuesName;
    }

    public void setIssuesName(String issuesName) {
        this.issuesName = issuesName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Work getIdwork() {
        return idwork;
    }

    public void setIdwork(Work idwork) {
        this.idwork = idwork;
    }

//    public Account getAccount() {
//        return account;
//    }
//
//    public void setAccount(Account account) {
//        this.account = account;
//    }
}
