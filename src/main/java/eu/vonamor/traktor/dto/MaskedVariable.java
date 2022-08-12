package eu.vonamor.traktor.dto;

public class MaskedVariable extends Variable {

    @Override
    public String getValue() {
        if (this.isProtected()) {
            return "******";
        }

        return super.getValue();
    }

}
