package com.freelancehub.identity.domain.model;

import com.freelancehub.shared.enums.UserStatus;
import com.freelancehub.shared.enums.UserType;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {

    private UUID id;
    private String password;
    private String email;
    private boolean emailVerified;
    private UserType userType; //ENUM
    private UserStatus status; //ENUM
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLoginAt;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getLastLoginAt() {
        return lastLoginAt;
    }

    public void setLastLoginAt(LocalDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", email_verified=" + emailVerified +
                ", userType=" + userType +
                ", status=" + status +
                ", createAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", lastLoginAt=" + lastLoginAt +
                '}';
    }
}
