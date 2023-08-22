package com.social.interaction.entities;



import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AuditEntity extends BaseEntity implements IAuditEntity {

    @Column(name = "created_user_id", nullable = false, columnDefinition = "bigint default 0")
    private Long createdUserId;

    @Column(name = "created_datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdDateTime;

    @Column(name = "updated_user_id")
    private Long updatedUserId;

    @Column(name = "updated_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedDateTime;

    @Override
    public Long getCreatedUserId() {
        return createdUserId;
    }

    @Override
    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    @Override
    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    @Override
    public Long getUpdatedUserId() {
        return updatedUserId;
    }

    @Override
    public void setUpdatedUserId(Long updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    @Override
    public LocalDateTime getUpdatedDateTime() {
        return updatedDateTime;
    }

    public void setUpdatedDateTime(LocalDateTime updatedDateTime) {
        this.updatedDateTime = updatedDateTime;
    }
}
