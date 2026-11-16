package contracts;

import model.EducationLevel;

public interface Matchable {
    boolean matches(EducationLevel level, int term);
}