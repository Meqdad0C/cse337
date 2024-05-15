package org.project;

import java.util.Objects;

public record Subject(String name, String code, String fullMark) {

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Subject subject = (Subject) obj;
        return Objects.equals(name, subject.name) &&
                Objects.equals(code, subject.code) &&
                Objects.equals(fullMark, subject.fullMark);
    }
}