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
    private UserType userType;
    private UserStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime lastLoginAt;

    private User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.password = userBuilder.password;
        this.email = userBuilder.email;
        this.emailVerified = userBuilder.emailVerified;
        this.userType = userBuilder.userType;
        this.status = userBuilder.status;
        this.createdAt = userBuilder.createdAt;
        this.updatedAt = userBuilder.updatedAt;
        this.lastLoginAt = userBuilder.lastLoginAt;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private UUID id;
        private String password;
        private String email;
        private boolean emailVerified;
        private UserType userType; //ENUM
        private UserStatus status; //ENUM
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime lastLoginAt;

        public UserBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder emailVerified(boolean emailVerified) {
            this.emailVerified = emailVerified;
            return this;
        }

        public UserBuilder userType(UserType userType) {
            this.userType = userType;
            return this;
        }

        public UserBuilder status(UserStatus status) {
            this.status = status;
            return this;
        }

        public UserBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public UserBuilder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UserBuilder lastLoginAt(LocalDateTime lastLoginAt) {
            this.lastLoginAt = lastLoginAt;
            return this;
        }

        public User build() {
            return new User(this);
        }
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
