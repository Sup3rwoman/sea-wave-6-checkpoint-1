package dev.wilders;

import java.time.LocalDate;
import java.time.Period;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public LocalDate getLastCertified() {
        return lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Admin here.
        boolean isCertified = LocalDate.now().minusYears(1).isBefore(getLastCertified());

        if(isCertified){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
        boolean isCertified = LocalDate.now().minusYears(1).isBefore(getLastCertified());

        if(isCertified){
            return true;
        }else{
            return false;
        }
    }
}
