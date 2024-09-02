package com.eddy.recursion;

public class TowerOfHanoi {
    /*
    *   PROBLEM:
    *
    *   Three rods and a number of disks of different sizes which can slide onto any rod
    *   Start with the disks on one rod with ascending order of size, the smallest on top, making the conical size
    *   Objective of the puzzle: move the entire stack to another rod, follow the rules:
    *   +   only one disk may be moved at a time
    *   +   each move consists of taking the upper disk from one of the rods and sliding it onto another rod, on top of
    *   the other disks that may be present on that rod
    *   +   no disk may be placed on top of a smaller disk
     */

    /*
    *   SOLUTION:
    *   Call 3 rods as Source, Destination and Auxiliary rod
    *   Step:
    *       +   Move the top n-1 disks from Source to Aux
    *       +   Move the n'th' disk from Source to Destination
    *       +   Move the n-1 disks from Aux to Destination
    *       +   Transfer the top n-1 disks from Source to Aux can be considered as a fresh problem and can be solved
    *       as the same manner
    *
     */

    public void towerOfHanoi(int diskCounts, String fromPeg, String toPeg, String auxPeg) {
        if(diskCounts == 1){
            System.out.println("Move 1 disk from " + fromPeg + " to " + toPeg);
            return;
        }

        // move the n-1 disks from A to B, using C as auxPeg
        towerOfHanoi(diskCounts -1, fromPeg, auxPeg, toPeg);

        // move remaining disks from A to C
        System.out.println("Move disk from " + fromPeg + " to " +toPeg);

        //move n-1 disks from B to C, using A as aux
        towerOfHanoi(diskCounts -1, auxPeg, toPeg, fromPeg);


    }


}
