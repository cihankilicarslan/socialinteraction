package com.social.interaction.entities;


import java.time.LocalDateTime;

public interface IAuditEntity {

    Long getCreatedUserId();
    void setCreatedUserId(Long createdUserId);

    LocalDateTime getCreatedDateTime();
    void setCreatedDateTime(LocalDateTime createdDateTime);

    Long getUpdatedUserId();
    void setUpdatedUserId(Long updatedUserId);

    LocalDateTime getUpdatedDateTime();
    void setUpdatedDateTime(LocalDateTime updatedDateTime);
}

