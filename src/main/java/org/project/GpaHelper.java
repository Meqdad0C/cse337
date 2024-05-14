package org.project;

import com.google.common.collect.Range;

import java.util.Map;
import java.util.Optional;


public class GpaHelper {
    private static final Map<Range<Integer>, Grade> GRADE_MAP = Map.ofEntries(
            Map.entry(Range.closedOpen(0, 60), Grade.F),
            Map.entry(Range.closedOpen(60, 64), Grade.D),
            Map.entry(Range.closedOpen(64, 67), Grade.D_PLUS),
            Map.entry(Range.closedOpen(67, 70), Grade.C_MINUS),
            Map.entry(Range.closedOpen(70, 73), Grade.C),
            Map.entry(Range.closedOpen(73, 76), Grade.C_PLUS),
            Map.entry(Range.closedOpen(76, 80), Grade.B_MINUS),
            Map.entry(Range.closedOpen(80, 84), Grade.B),
            Map.entry(Range.closedOpen(84, 89), Grade.B_PLUS),
            Map.entry(Range.closedOpen(89, 93), Grade.A_MINUS),
            Map.entry(Range.closedOpen(93, 97), Grade.A),
            Map.entry(Range.closed(97, 100), Grade.A_PLUS));

    private static final Map<Grade, Double> GPA_MAP = Map.ofEntries(
            Map.entry(Grade.A_PLUS, 4.0),
            Map.entry(Grade.A, 4.0),
            Map.entry(Grade.A_MINUS, 3.7),
            Map.entry(Grade.B_PLUS, 3.3),
            Map.entry(Grade.B, 3.0),
            Map.entry(Grade.B_MINUS, 2.7),
            Map.entry(Grade.C_PLUS, 2.3),
            Map.entry(Grade.C, 2.0),
            Map.entry(Grade.C_MINUS, 1.7),
            Map.entry(Grade.D_PLUS, 1.3),
            Map.entry(Grade.D, 1.0),
            Map.entry(Grade.F, 0.0));

    public static double getGPA(Grade grade) {
        return GPA_MAP.get(grade);
    }

    public static String getGrade(int totalMark) throws IllegalArgumentException {
        if (totalMark < 0 || totalMark > 100) {
            throw new IllegalArgumentException("Invalid total mark, it should be between 0 and 100");
        }
        Optional<Map.Entry<Range<Integer>, Grade>> gradeEntry = GRADE_MAP.entrySet()
                .stream()
                .filter(entry -> entry.getKey().contains(totalMark))
                .findFirst();
        return gradeEntry.get().getValue().toString();

    }
}
