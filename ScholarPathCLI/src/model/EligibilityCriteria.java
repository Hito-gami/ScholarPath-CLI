package model;

public class EligibilityCriteria {
    private final EducationLevel level;
    private final int targetTerm;
    private final String requirementNote;

    public EligibilityCriteria(EducationLevel level, int targetTerm, String requirementNote) {
        this.level = level;
        this.targetTerm = targetTerm;
        this.requirementNote = requirementNote;
    }

    public boolean isEligible(EducationLevel candidateLevel, int candidateTerm) {
        return this.level == candidateLevel && this.targetTerm == candidateTerm;
    }

    public EducationLevel getLevel() {
        return level;
    }

    public int getTargetTerm() {
        return targetTerm;
    }

    public String getRequirementNote() {
        return requirementNote;
    }

    public String formatTargetCohort() {
        return level.getLabel() + " - " + level.getTermUnit() + " " + targetTerm;
    }
}