package dev.group.sortify.strategy;

import dev.group.sortify.model.Student;
import java.util.Comparator;

public interface SortingStrategy {
    void sort(Student[] array, Comparator<Student> comparator);
}