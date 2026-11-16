package model;

public enum EducationLevel {
    SISWA("Siswa SMA/SMK/MA Sederajat", "Kelas", 10, 12),
    MAHASISWA("Mahasiswa Perguruan Tinggi", "Semester", 1, 8);

    private final String label;
    private final String termUnit;
    private final int minTerm;
    private final int maxTerm;

    EducationLevel(String label, String termUnit, int minTerm, int maxTerm) {
        this.label = label;
        this.termUnit = termUnit;
        this.minTerm = minTerm;
        this.maxTerm = maxTerm;
    }

    public String getLabel() {
        return label;
    }

    public String getTermUnit() {
        return termUnit;
    }

    public int getMinTerm() {
        return minTerm;
    }

    public int getMaxTerm() {
        return maxTerm;
    }
}