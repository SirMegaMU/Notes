def first_Fit(Block: list, Process: list):

    # get the total number of memory block and Prosess
    n_Block = len(Block)
    n_Process = len(Process)

    # mark all unallocated Process as -1
    allocation = [-1]*n_Process

    # iterate over all process and memory blocks
    for i in range(n_Process):
        for j in range(n_Block):
            if Block[j] >= Process[i]:

                # if process smaller than the memory block, 
                # mark it as allocated and reduce the block size
                allocation[i] = j
                Block[j] -= Process[i]
                break
    
    # print the result         
    print("Process No.\t\tProcess Size\t\tBlock No.")
    for i in range(n_Process):
        print(
            i+1,
            "\t\t\t",
            Process[i],
            "\t\t\t",
            allocation[i]+1 if allocation[i] != -1 else "Not Allocated"
        )


if __name__ == "__main__":
    block = [100, 400, 200, 300, 600]
    process = [212, 417, 112, 426]
    first_Fit(block, process)

