package test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ExercTest {

    private List<Integer> list = new ArrayList<>();

    @BeforeEach
    void initList() {
        list.clear();
    }

    @Test
    public void shouldArrayListIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldAddedItemToArrayList() {
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void shouldAddThreeItemsToArrayList() {
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
    }

    @Test
    public void shouldAddThreeItemsAndRemoveOneFromArrayList() {
        list.add(1);
        list.add(2);
        list.add(3);

        var elem = list.remove(2);

        assertEquals(3, elem);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
    }

    @Test
    public void shouldAddAndRemoveItemFromArrayList() {
        list.add(1);
        list.remove(0);

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
    }

    @Test
    public void shouldThrowErrorWhenTryToAcessNonExistingElementFromArrayList() {
        list.add(1);
        list.add(2);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(2);
        });
    }
}
