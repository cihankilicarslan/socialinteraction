package com.social.interaction.enums;

public enum UserRole {
    ADMIN("ADMIN"),
    USER("USER"),
    MODERATOR("MODERATOR");

    private final String value;

    UserRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
