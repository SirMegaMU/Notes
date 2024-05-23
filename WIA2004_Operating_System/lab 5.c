#include <stdio.h>

void firstFit(int Block[], int n_Block, int Process[], int n_Process) {
    // mark all unallocated Process as -1
    int allocation[n_Process];
    for (int i = 0; i < n_Process; i++)
        allocation[i] = -1;

    // iterate over all process and memory blocks
    for (int i = 0; i < n_Process; i++) {
        for (int j = 0; j < n_Block; j++) {
            if (Block[j] >= Process[i]) {
                // if process smaller than the memory block, 
                // mark it as allocated and reduce the block size
                allocation[i] = j;
                Block[j] -= Process[i];
                break;
            }
        }
    }

    // print the result         
    printf("Process No.\t\tProcess Size\t\tBlock No.\n");
    for (int i = 0; i < n_Process; i++) {
        printf("%d\t\t\t%d\t\t\t", i+1, Process[i]);
        if (allocation[i] != -1)
            printf("%d\n", allocation[i]+1);
        else
            printf("Not Allocated\n");
    }
}

int main() {
    int block[] = {100, 400, 200, 300, 600};
    int process[] = {212, 417, 112, 426};
    int n_Block = sizeof(block) / sizeof(block[0]);
    int n_Process = sizeof(process) / sizeof(process[0]);
    firstFit(block, n_Block, process, n_Process);
    return 0;
}
