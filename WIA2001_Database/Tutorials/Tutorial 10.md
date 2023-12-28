# Tutorial 10

## 1

### a)

```sql
SELECT *
FROM Publisher
ORDER BY pubName;
```

### b)

```sql
SELECT pubName, telNo
FROM Publisher
WHERE pubID IN (SELECT pubID FROM BookJob WHERE jobType = 'R');
```

### c)

```sql
SELECT creditCode, COUNT(*) AS numberOfPublishers
FROM Publisher
GROUP BY creditCode;
```

### d)

```sql
SELECT jobType
FROM BookJob
GROUP BY jobType
HAVING COUNT(*) >= 3;
```

### e) 

```sql
SELECT *
FROM Item
WHERE price < (SELECT AVG(price) FROM Item);
```

## 2

### a)

```sql
SELECT DISTINCT Category
FROM ANIMAL;
```

### b)

```sql
SELECT *
FROM ANIMAL
WHERE Category = 'Cat' AND Color = 'White' AND ListPrice > 2000;
```

### c)

```sql
SELECT Category, COUNT(*) AS NumberOfAnimals
FROM ANIMAL
GROUP BY Category
ORDER BY NumberOfAnimals DESC;
```

### d)

```sql
SELECT *
FROM ANIMAL
WHERE Category IN (
    SELECT Category
    FROM ANIMAL
    GROUP BY Category
    HAVING COUNT(*) > 10
);
```

