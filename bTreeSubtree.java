public class bTreeSubtree {
    public static void main(String[] args) {

    }
}
// given the roots of two bimary tree root and subroot,
// return true if there is a subtree of root with the same structure and node
// values of subroot anf false otherwise.
// APPROACH
// 1. FIND SUBROOT IN TREE
// 2. CHECK IDENTICAL(SUBROOT, NODE SUBTREE)
// NON IDENTICAL CONDITIONS:
// 1. node.data!= subroot.data
// 2. node=null || subroot = nul
// 3. leftsubtree -> non identical
// 4. rightsubtree -> non identical