# Tutorial 9

1. The EU (Execution Unit) and BIU (Bus Interface Unit) are two important components of a processor:
   - Execution Unit (EU): The EU is responsible for executing instructions. It performs arithmetic and logical operations, accesses data from registers or memory, and controls the flow of instructions within the processor.
   - Bus Interface Unit (BIU): The BIU acts as an interface between the processor and the external memory and I/O devices. It manages the transfer of data between the processor and memory, handles memory requests, and coordinates the flow of data between the processor and the external world.

2. Pipelining improves performance by overlapping the execution of multiple instructions. It breaks down the execution of instructions into a series of sequential stages, allowing multiple instructions to be processed simultaneously. This results in increased instruction throughput and overall system performance. Pipelining reduces the idle time of the processor by keeping different parts of the processor busy with different instructions, maximizing the utilization of system resources.

3. Pipeline latency refers to the total time it takes for an instruction to complete its execution in a pipelined system. It includes the time spent in each pipeline stage and any additional delays introduced by pipeline hazards, such as data dependencies or branch instructions.

5. In a 6-stage pipeline, 600 instructions would take 600 time units to execute. If the same instructions were executed in an unpipelined manner, each instruction would take 6 time units. Therefore, in the unpipelined case, 600 instructions would take 600 * 6 = 3600 time units. The speedup achieved by pipelining can be calculated as the ratio of unpipelined time to pipelined time, which is 3600 / 600 = 6.

6. To calculate the cycle times of the pipelined versions and their latencies, we need to consider the cycle time and the latency introduced by the pipeline latches:
   - 2-stage pipeline: Each stage would have a cycle time of 10 ns, and the latency would be 0.5 ns.
   - 4-stage pipeline: Each stage would have a cycle time of 10 ns, and the latency would be 2 * 0.5 ns = 1 ns.
   - 8-stage pipeline: Each stage would have a cycle time of 10 ns, and the latency would be 4 * 0.5 ns = 2 ns.
   - 16-stage pipeline: Each stage would have a cycle time of 10 ns, and the latency would be 8 * 0.5 ns = 4 ns.

7. Various ways in which an instruction pipeline can deal with conditional branch instructions include:
   - Branch prediction: The pipeline predicts the outcome of a branch instruction and speculatively continues the execution based on the prediction. If the prediction is correct, the pipeline continues without any disruption. If the prediction is incorrect, the pipeline needs to be flushed, and the correct branch path is taken.
   - Delayed branching: The branch instruction is executed in a separate stage, allowing the pipeline to continue with subsequent instructions. The branch instruction's outcome is used to determine whether to discard the instructions fetched after the branch or to continue their execution.
   - Branch target buffer: A cache-like structure that stores the target addresses of frequently encountered branches. It helps in predicting the target address of a branch instruction, reducing the latency associated with fetching the target instruction.
   - Speculative execution: The pipeline executes instructions beyond the branch instruction speculatively, assuming a particular branch outcome. If the assumption is correct, the pipeline continues execution without any disruption. If the assumption is incorrect, the speculatively executed instructions are discarded, and the correct branch path is taken. Speculative execution allows for better utilization of pipeline resources.