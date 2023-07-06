# Tutorial 6

## 1

Track: A track is a concentric circle on a disk surface. It is a narrow data storage area that extends around the entire circumference of the disk.

Cylinder: A cylinder is a collection of tracks that are vertically aligned across multiple disk surfaces. It includes all the tracks with the same track number on each surface of the disk.

Sector: A sector is the smallest unit of data storage on a disk. It is a fixed-sized portion of a track that can store data.

## 2

Seek Time: Seek time is the time taken by the disk's read/write head to move from its current position to the desired track on the disk.

Rotational Delay (Latency): Rotational delay, also known as latency, is the time taken for the desired sector to rotate under the disk's read/write head once the head is positioned on the correct track.

Access Time: Access time is the sum of seek time and rotational delay. It represents the time taken to position the read/write head on the correct track and wait for the desired sector to rotate under the head.

Transfer Time: Transfer time is the time taken to read or write data from/to the disk once the read/write head is positioned correctly.

## 3

- Data Striping: RAID levels employ data striping, which involves distributing data across multiple drives in the array.
- Redundancy: RAID levels use redundancy techniques to provide fault tolerance and data protection.
- Performance Improvement: RAID levels can improve performance by allowing multiple drives to work in parallel.

## 4

- RAID 1: Redundancy is achieved by mirroring, where data is written identically to two drives.
- RAID 3, 4, 5, 6: Redundancy is achieved using parity, where additional information (parity) is calculated and stored across the drives to allow for data recovery in case of a drive failure.

## 5

1. Average seek time: Assuming 100 tracks traversed per millisecond, and given a random track access: Average seek time = (100 * 30,000) / 2 = 1,500,000 ms = 1500 seconds
2. Average rotational latency: Average rotational latency = 1 / (7200 rpm / 60) = 8.33 ms
3. Transfer time for a sector: Transfer time for a sector = 1 / (7200 rpm / 60) = 8.33 ms
4. Total average time to satisfy a request: Total average time = Seek time + Rotational latency + Transfer time Total average time = 1500 ms + 8.33 ms + 8.33 ms = 1516.66 ms

## 6

1. Disk capacity: Disk capacity = Number of surfaces × Number of tracks per surface × Number of sectors per track × Sector size Disk capacity = 16 × 512 × 64 × 1 KB = 524,288 KB = 512 MB
2. Average access time: Average access time = Seek time + (Track-to-track access time / 2) + Rotational latency Average access time = 6 ms + (1 ms / 2) + (1 / (3600 rpm / 60)) = 7.83 ms
3. Time required to transfer a 5MB file: Number of sectors required = (5 MB / 1 KB) = 5120 sectors Transfer time = Number of sectors × Transfer time per sector = 5120 × (1 / (3600 rpm / 60)) = 8.53 seconds
4. Burst transfer rate: Burst transfer rate = Sector size × Rotational speed = 1 KB × (3600 rpm / 60) = 60 KB/s

## 7

- RAID 0: 4 drives × 300 GB = 1200 GB
- RAID 1: Total capacity of 1 drive = 300 GB
- RAID 3: (Number of drives - 1) × 300 GB = 900 GB
- RAID 4: (Number of drives - 1) × 300 GB = 900 GB
- RAID 5: (Number of drives - 1) × 300 GB = 900 GB
- RAID 6: (Number of drives - 2) × 300 GB = 600 GB