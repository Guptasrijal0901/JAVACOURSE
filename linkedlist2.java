public class linkedlist2 {
    public static void main(String[] args) {

    }
}
// Floyd's Cycle-Finding Algorithm, often called the "Tortoise and Hare"
// algorithm,
// is a technique used to detect cycles in a sequence, most commonly in a linked
// list.

// Concept:
// - **Cycle**: In a linked list, a cycle occurs when a node's pointer links
// back to a previous node,
// forming a loop in the list.

// How the Algorithm Works:
// - The algorithm uses two pointers:
// - **Tortoise**: This pointer moves one step at a time.
// - **Hare**: This pointer moves two steps at a time.

// Key Steps:
// 1. **Initialization**: Both pointers start at the beginning of the linked

// list.
// 2. **Movement**: The Tortoise moves slowly, advancing one node per step,
// while the Hare moves faster, advancing two nodes per step.
// 3. **Cycle Detection**:
// - If the list has no cycle, the Hare will eventually reach the end of the
// list (a `null` reference).
// - If the list contains a cycle, the Hare,
// moving faster, will eventually catch up to the Tortoise within the cycle.

// Conclusion:
// - If the Tortoise and Hare meet, it confirms that there is a cycle in the
// list.
// - If the Hare reaches the end without meeting the Tortoise, the list is
// cycle-free.

// This approach efficiently detects cycles using only two pointers,
// making it both time and space efficient.