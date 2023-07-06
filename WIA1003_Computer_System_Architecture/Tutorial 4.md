# Tutorial 4

## 1

1. Access Time: Access time refers to the time it takes to retrieve or store data in memory. In general, faster access times are desirable as they allow for quicker data retrieval and processing. However, faster access times often come at a higher cost. Memory technologies with faster access times, such as cache memory or solid-state drives (SSDs), tend to be more expensive compared to slower memory technologies like hard disk drives (HDDs).
2. Memory Cost: Memory cost refers to the price associated with a certain amount of memory capacity. As memory capacity increases, the cost typically increases as well. However, different memory technologies have varying cost structures. For example, RAM (Random Access Memory) is generally more expensive per unit of capacity compared to secondary storage devices like HDDs or SSDs. Higher-performance memory technologies also tend to be more expensive compared to slower ones.
3. Capacity: Capacity refers to the amount of data that can be stored in memory. As memory capacity increases, more data can be stored, allowing for larger programs and data sets to be handled. Increasing memory capacity often leads to higher costs, although advancements in technology over time can result in reduced costs per unit of capacity.

# 2

Direct Mapping: In direct mapping, each block of main memory can be mapped to only one specific cache location. The mapping is determined by dividing the main memory into equally sized blocks and assigning each block to a specific cache location. The mapping is based on the address of the memory block modulo the number of cache locations. Direct mapping allows for a simple and efficient implementation but may result in cache conflicts if multiple memory blocks map to the same cache location, leading to cache misses.

Associative Mapping: In associative mapping, each block of main memory can be placed in any cache location. The mapping is determined by comparing the memory block address with the addresses stored in the cache. If a match is found, the block is considered present in the cache. Associative mapping eliminates the issue of cache conflicts as any memory block can be placed in any cache location. However, the search for a specific block in the cache is more complex and requires comparing the address of the requested block with all the stored addresses in the cache, resulting in higher hardware complexity and access time.

Set Associative Mapping: Set associative mapping combines aspects of both direct mapping and associative mapping. The cache is divided into multiple sets, with each set containing a fixed number of cache locations. Each memory block is mapped to a specific set based on its address. Within each set, the block can be placed in any of the cache locations using an associative approach. This allows for a compromise between the simplicity of direct mapping and the flexibility of associative mapping. Set associative mapping reduces cache conflicts compared to direct mapping while still maintaining a reasonable level of hardware complexity.

# 3

1. tag 11 bits, line number 5 bits, byte number 3 bits

2.  

   a) 0001 0001 0001 1011: Line Number = 00011 (binary) = 3 (decimal)

   b) 1100 0011 0011 0100: Line Number = 00001 (binary) = 1 (decimal)

   c) 1101 0000 0001 1101: Line Number = 00100 (binary) = 4 (decimal)

   d) 1010 1010 1010 1010: Line Number = 01010 (binary) = 10 (decimal)

3. the addresses of the bytes stored along with this byte would be: 0001 1010 0001 1000 0001 1010 0001 1001 0001 1010 0001 1010 (given address) 0001 1010 0001 1011 0001 1010 0001 1100 0001 1010 0001 1101 0001 1010 0001 1110 0001 1010 0001 1111

4. The cache consists of 32 lines, and each line can store one block of 8 bytes. Therefore, the total bytes of memory that can be stored in the cache would be: 32 lines × 8 bytes per line = 256 bytes

5. The tag is stored in the cache to compare it with the tag bits of the memory address during cache access. By comparing the tags, the cache can determine if the requested memory block is present in the cache or if it needs to fetch it from the main memory. Storing the tag allows for efficient and accurate cache lookups, ensuring that data consistency is maintained and cache hits and misses are correctly identified.

# 4

128 lines and 32 sets

# 5

1. Least Recently Used (LRU): The LRU replacement policy tracks the usage history of cache lines. Each time a cache line is accessed, it is marked as the most recently used. When a cache line needs to be replaced, the least recently used cache line (the one that has not been accessed for the longest time) is chosen for eviction. LRU aims to minimize cache misses by evicting the least recently used data, assuming that recently used data is more likely to be accessed again in the near future.
2. First-In, First-Out (FIFO): The FIFO replacement policy follows a simple rule: the cache line that was brought into the cache first is evicted first when a replacement is needed. It maintains a queue or circular buffer of cache lines and removes the one at the head of the queue. FIFO provides a fair replacement scheme, but it may not consider the actual usage patterns of cache lines and can suffer from cache thrashing if certain cache lines are accessed more frequently than others.
3. Random: The random replacement policy selects a cache line randomly for eviction when a replacement is required. It does not consider usage history or any specific pattern of cache line access. The advantage of the random replacement policy is its simplicity and lack of bias toward any specific data or access pattern. However, it may result in suboptimal cache performance compared to more sophisticated replacement policies like LRU.

# 6

- Write-Though
- Write-Back
- Write-Allocation

# 7

125 ns

# 8

Ta = Tc1 + (1 - H1) * (Tc2 + (1 - H2) * Tm)

Explanation:

- Tc1: First-level cache access time (time to access the cache if the data is found in the first-level cache).
- H1: First-level hit ratio (probability of finding the data in the first-level cache).
- (1 - H1): Miss ratio for the first-level cache (probability of missing the data in the first-level cache).
- Tc2: Second-level cache access time (time to access the cache if the data is found in the second-level cache).
- H2: Combined first/second-level hit ratio (probability of finding the data in either the first-level or second-level cache).
- (1 - H2): Miss ratio for the combined first/second-level cache (probability of missing the data in both the first-level and second-level caches).
- Tm: Main memory access time (time to access the data if it is not found in any cache).

