package hw.hw8.part2;

import java.util.Objects;

class Test {
    int intField;
    String stringField;

    public Test(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return intField == test.intField &&
                Objects.equals(stringField, test.stringField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intField, stringField);
    }
}
