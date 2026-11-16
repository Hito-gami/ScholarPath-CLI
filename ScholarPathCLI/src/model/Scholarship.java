package model;

import contracts.Matchable;
import contracts.Renderable;

public class Scholarship implements Matchable, Renderable {
    private final String name;
    private final String category;
    private final EligibilityCriteria criteria;

    public Scholarship(String name, String category, EligibilityCriteria criteria) {
        this.name = name;
        this.category = category;
        this.criteria = criteria;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public EligibilityCriteria getCriteria() {
        return criteria;
    }

    @Override
    public boolean matches(EducationLevel level, int term) {
        return criteria.isEligible(level, term);
    }

    @Override
    public void render() {
        System.out.println("+--------------------------------------------------------------------+");
        System.out.println("  Nama Beasiswa : " + name);
        System.out.println("  Kategori      : " + category);
        System.out.println("  Sasaran       : " + criteria.formatTargetCohort());
        System.out.println("  Keterangan    : " + criteria.getRequirementNote());
        System.out.println("+--------------------------------------------------------------------+");
    }
}