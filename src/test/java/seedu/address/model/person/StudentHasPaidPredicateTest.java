package seedu.address.model.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentHasPaidPredicateTest {
    @Test
    public void equals() {
        StudentHasPaidPredicate predicateHasPaid = new StudentHasPaidPredicate(true);
        StudentHasPaidPredicate predicateHasNotPaid = new StudentHasPaidPredicate(false);

        // same object -> returns true
        assertTrue(predicateHasPaid.equals(predicateHasPaid));
        assertTrue(predicateHasNotPaid.equals(predicateHasNotPaid));

        // same value -> returns true
        StudentHasPaidPredicate predicateHasPaidCopy = new StudentHasPaidPredicate(true);
        StudentHasPaidPredicate predicateHasNotPaidCopy = new StudentHasPaidPredicate(false);
        assertTrue(predicateHasPaid.equals(predicateHasPaidCopy));
        assertTrue(predicateHasNotPaid.equals(predicateHasNotPaidCopy));

        // different type -> returns false
        assertFalse(predicateHasPaid.equals(1));
        assertFalse(predicateHasNotPaid.equals(1));

        // null -> returns false
        assertFalse(predicateHasPaid.equals(null));
        assertFalse(predicateHasNotPaid.equals(null));

        // different value -> returns false
        assertFalse(predicateHasPaid.equals(predicateHasNotPaid));
    }

    @Test
    public void toStringMethod() {
        StudentHasPaidPredicate predicateHasPaid = new StudentHasPaidPredicate(true);
        StudentHasPaidPredicate predicateHasNotPaid = new StudentHasPaidPredicate(false);

        String expectedHasPaid = StudentHasPaidPredicate.class.getCanonicalName() + "{hasPaid=" + true + "}";
        assertEquals(expectedHasPaid, predicateHasPaid.toString());
        String expectedHasNotPaid = StudentHasPaidPredicate.class.getCanonicalName() + "{hasPaid=" + false + "}";
        assertEquals(expectedHasNotPaid, predicateHasNotPaid.toString());
    }
}
