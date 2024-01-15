package work_schedules.demo.DTO;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.TemporalType;

public class ScheduleDto {
    // private Long userId;

    // private Date startDate;

    // private Date endDate;

    // private String shift;

    // private String notes;

    // public Date getStartDate() {
    // return startDate;
    // }

    // public void setStartDate(Date startDate) {
    // this.startDate = startDate;
    // }

    // public Date getEndDate() {
    // return endDate;
    // }

    // public void setEndDate(Date endDate) {
    // this.endDate = endDate;
    // }

    // public String getShift() {
    // return shift;
    // }

    // public void setShift(String shift) {
    // this.shift = shift;
    // }

    // public String getNotes() {
    // return notes;
    // }

    // public void setNotes(String notes) {
    // this.notes = notes;
    // }

    // public Long getUserId() {
    // return userId;
    // }

    // public void setUserId(Long userId) {
    // this.userId = userId;
    // }

    private long id;

    private Date startDate;

    private Date endDate;

    private String shift;

    private String notes;

    private int status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @PrePersist
    public void setCreatedAt() {
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @PreUpdate
    public void setUpdatedAt() {
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

}
