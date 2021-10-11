package dev.wilders;

import java.time.LocalDate;
import java.time.Period;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Developer here.
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Developer here.
        boolean isInTrialPeriod = LocalDate.now().minusMonths(6).isBefore(getEmploymentDate());

        if(isInTrialPeriod){
            return false;
        }else{
            return true;
        }

    }
}
