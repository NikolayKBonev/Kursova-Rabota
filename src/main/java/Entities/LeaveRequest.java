package Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;
    private String status; // PENDING, APPROVED, REJECTED

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    // Getters and Setters
    public Long getId() {
        return id; }

    public void setId(Long id) {
        this.id = id; }

    public LocalDate getStartDate() {
        return startDate; }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate; }
    public LocalDate getEndDate() {
        return endDate; }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate; }
    public String getStatus() {
        return status; }
    public void setStatus(String status) {
        this.status = status; }
    public Employee getEmployee() {
        return employee; }
    public void setEmployee(Employee employee) {
        this.employee = employee; }

}
