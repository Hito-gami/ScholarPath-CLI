package model;

import contracts.Renderable;

public class ApplicantCard implements Renderable {
    private final String applicantName;
    private final String institutionName;
    private final EducationLevel level;
    private final int term;
    private final Scholarship targetScholarship;
    private final String preparationNote;

    public ApplicantCard(
            String applicantName,
            String institutionName,
            EducationLevel level,
            int term,
            Scholarship targetScholarship,
            String preparationNote) {
        this.applicantName = applicantName;
        this.institutionName = institutionName;
        this.level = level;
        this.term = term;
        this.targetScholarship = targetScholarship;
        this.preparationNote = preparationNote;
    }

    @Override
    public void render() {
        System.out.println("\n+====================================================================+");
        System.out.println("|                 KARTU RENCANA PENDAFTARAN BEASISWA                 |");
        System.out.println("+====================================================================+");
        System.out.println("  Nama Lengkap      : " + applicantName);
        System.out.println("  Asal Sekolah/PT   : " + institutionName);
        System.out.println("  Status & Tingkat  : " + level.getLabel() + " (" + level.getTermUnit() + " " + term + ")");
        System.out.println("  Beasiswa Pilihan  : " + targetScholarship.getName());
        System.out.println("  Kategori Program  : " + targetScholarship.getCategory());
        System.out.println("  Ketentuan Khusus  : " + targetScholarship.getCriteria().getRequirementNote());
        System.out.println("  Catatan Persiapan : " + preparationNote);
        System.out.println("+====================================================================+");
    }
}