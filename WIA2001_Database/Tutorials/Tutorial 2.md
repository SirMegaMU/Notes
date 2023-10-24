# Tutorial 2

## 1. Why business rules are important for a good database design? Give 3 examples of business rules in academic environment

Business rules are crucial for a good database design because they help ensure data accuracy, consistency, and integrity, which are essential for the effective functioning of an organization's information system. Business rules are a set of guidelines and constraints that dictate how data should be stored, processed, and accessed in a database. Here are three examples of business rules in an academic environment:

1. Course Registration Constraints:
   - Business Rule: Students can only register for courses that are prerequisites for other courses if they have successfully completed those prerequisites.
   - Importance: This rule ensures that students follow a logical and educational path when selecting their courses, preventing them from registering for classes they are not prepared for, and thus maintaining academic standards.

2. Grading Policies:
   - Business Rule: Instructors must submit final grades within one week after the course ends.
   - Importance: This rule ensures timely and consistent grading, allowing students to track their progress and graduate on time. It also maintains transparency and fairness in the grading process.

3. Student Enrollment Limits:
   - Business Rule: A class can have a maximum of 30 students and a minimum of 5 students to be offered.
   - Importance: This rule helps manage class sizes and resource allocation effectively. It ensures that classes with too few students are canceled, while maintaining a reasonable class size for effective teaching and learning.

In summary, business rules in an academic environment, as in any database design, help maintain data quality, consistency, and integrity. They also ensure that data is used and processed in a way that aligns with the goals and policies of the academic institution, which is crucial for the smooth operation of academic processes and decision-making.

## 2. What is the definition of DDL and DML? Explain the differences between DDL and DML

DDL (Data Definition Language) and DML (Data Manipulation Language) are two types of SQL (Structured Query Language) statements used in database management. They serve different purposes and have distinct functions:

1. DDL (Data Definition Language):
   - Definition: DDL is a subset of SQL that deals with the structure of the database. It is used to define, modify, and manage the structure of database objects, such as tables, indexes, and constraints.
   - Key DDL Statements: Common DDL statements include CREATE, ALTER, DROP, and TRUNCATE. These statements allow you to create new database objects, modify their structure, delete objects, and remove all data from a table.

   Differences:
   - **Purpose**: DDL is used to define and manage the structure of the database, including creating and altering tables, defining constraints, and other database objects.
   - **Result**: DDL statements don't manipulate or retrieve data; instead, they define the schema and structure of the database.

2. DML (Data Manipulation Language):
   - Definition: DML is a subset of SQL that focuses on manipulating, querying, and managing the data stored within the database. It is used for inserting, updating, and retrieving data.
   - Key DML Statements: Common DML statements include SELECT (for querying data), INSERT (for adding new records), UPDATE (for modifying existing records), and DELETE (for removing records).

   Differences:
   - **Purpose**: DML is used to perform operations on the data stored in the database, such as retrieving, adding, updating, or deleting data.
   - **Result**: DML statements directly affect the data stored in the database, making it possible to interact with and manage the actual records within the database.

In summary, the primary distinction between DDL and DML is in their purpose and the aspects of the database they address. DDL is concerned with the structure and schema of the database, while DML focuses on the manipulation and retrieval of data within that structure. Both DDL and DML are essential components of SQL and are used together to create, modify, and manage a fully functional database system.

## 3. Refer to Figure 2.0 below and answer the following questions

- REGION
  > REGION_CODE
  > REGION_DESCRIPT
- 1 - ∞
- STORE
  > STORE_CODE
  > STORE_NAME
  > STORE_YTD_SALES
  > REGION_CODE
- 1 - ∞
- EMPLOYEE
  > EMP_CODE
  > EMP_TITLE
  > EMP_LNAME
  > EMP_FNAME
  > EMP_INITIAL
  > EMP_DOB
  > EMP_JOB_CODE
  > STORE_CODE
- ∞ -1
- JOB
  > JOB_CODE
  > JOB_DESCRIPTION
  > JOB_BASE_PAY

### i. Identify each relationship type and write all of the business rules

- REGION - STORE (1 - ∞):

  - Relationship Type: One-to-Many (1 - ∞)
  - Business Rules: Each region can have many stores, but each store belongs to only one region.
- STORE - EMPLOYEE (1 - ∞):

  - Relationship Type: One-to-Many (1 - ∞)
  - Business Rules: Each store can employ many employees, but each employee works at only one store.
- EMPLOYEE - JOB (∞ - 1):

  - Relationship Type: Many-to-One (∞ - 1)
  - Business Rules: Each employee is assigned to one job, but multiple employees can have the same job.
- STORE - REGION (Many-to-One):

  - Relationship Type: Many-to-One (∞ - 1)
  - Business Rules: Each store is associated with one region, but multiple stores can belong to the same region.

### ii. Create the basic Crow’s Foot ERD for DealCo

## 4

### i. How would you identify entity and relationship types from a user’s requirements specification?

Identifying entity and relationship types from a user's requirements specification is a critical step in the database design process. Here are the steps and considerations to help you identify these elements:

1. **Understand the Requirements Specification:**
   - Begin by thoroughly reading and understanding the user's requirements specification. This document should outline what the system is expected to do and how data is expected to be used.

2. **Identify Nouns as Potential Entities:**
   - Look for nouns in the requirements specification, as they often represent potential entities. For example, if the specification mentions "students," "courses," and "instructors," these could be entities.

3. **Identify Verbs as Potential Relationships:**
   - Look for verbs or actions in the specification, as they often represent potential relationships between entities. For example, if the specification states that "students enroll in courses" or "instructors teach courses," these phrases imply relationships.

4. **Classify Entities and Relationships:**
   - Once you've identified potential entities and relationships, classify them. Entities represent the objects or concepts about which you need to store data. Relationships represent how these entities are related to each other.

5. **Refine and Validate:**
   - Ensure that your identified entities and relationships align with the requirements. Consult with users and stakeholders to validate your understanding and get their feedback. Make refinements as needed.

6. **Create an Entity-Relationship Diagram (ERD):**
   - An ERD is a visual representation of entities, attributes, and relationships. Use it to depict your findings, which can make it easier for others to understand the data model.

7. **Normalize and Define Attributes:**
   - For each entity, identify its attributes. These are specific pieces of information related to the entity. For example, a "student" entity might have attributes like "student ID," "name," and "email." Normalize the data to avoid redundancy and ensure data integrity.

8. **Document Cardinality and Participation:**
   - Define the cardinality of relationships (e.g., one-to-one, one-to-many, many-to-many) and participation constraints (e.g., mandatory or optional) to specify how entities are related and how they interact with one another.

9. **Validate with Users:**
   - Continue to involve users and stakeholders throughout the process to ensure that your entity and relationship types accurately reflect their needs and expectations.

10. **Iterate as Necessary:**
    - Database design is an iterative process. As the project progresses, you may need to revisit and refine your entity and relationship types based on evolving requirements or new insights.

Identifying entity and relationship types correctly is essential for creating an effective database design that accurately represents the user's data requirements and supports the desired functionality of the system.

### ii. How would you identify attributes from a user’s requirements specification and then associate the attributes with entity or relationship types?

Identifying attributes from a user's requirements specification and associating them with entity or relationship types is a crucial step in database design. Here's a systematic approach to accomplish this:

1. **Understand the Requirements Specification:**
   - Carefully read and comprehend the user's requirements specification to gain a deep understanding of what information needs to be stored and how it will be used.

2. **Identify Nouns and Verbs:**
   - Similar to the process of identifying entities and relationships, look for nouns, verbs, and adjectives in the requirements specification. Nouns often represent entities, while verbs or adjectives may hint at attributes.

3. **Recognize Descriptive Information:**
   - Pay attention to phrases or sentences that describe the properties or characteristics of entities or relationships. These descriptions can indicate potential attributes.

4. **List Potential Attributes:**
   - Create a list of potential attributes based on the descriptions and details you've identified. For example, if the requirements specify a "student," potential attributes might include "student ID," "name," "date of birth," and "email address."

5. **Classify Attributes:**
   - Group the identified potential attributes into the appropriate entity or relationship types. An attribute should be directly related to the entity or relationship it describes.

6. **Refine and Verify:**
   - Consult with users and stakeholders to verify that the identified attributes align with their needs and expectations. Make any necessary refinements based on their feedback.

7. **Eliminate Redundancy:**
   - Check for redundancy among attributes. If multiple entities share similar attributes, consider whether it's more efficient to create a new entity to represent that common information.

8. **Define Data Types and Constraints:**
   - Specify the data types for each attribute (e.g., integer, string, date) and any constraints (e.g., required, unique, maximum length) that apply.

9. **Document in an Entity-Attribute-Value (EAV) Matrix:**
   - Create an Entity-Attribute-Value matrix that maps each entity and relationship type to its associated attributes. This matrix provides a structured overview of the data model.

10. **Document Cardinality and Participation:**
    - For relationships, define cardinality and participation constraints. For example, in a "student enrolls in a course" relationship, you may specify that "enrollment date" is an attribute with a cardinality of "one-to-many."

11. **Validate with Users:**
    - Continuously involve users and stakeholders to ensure that the identified attributes accurately reflect their data requirements.

12. **Iterate as Necessary:**
    - Database design is an iterative process, and as the project evolves, you may need to revisit and adjust attributes based on evolving requirements or new insights.

By following this approach, you can systematically identify, classify, and associate attributes with entity or relationship types, ensuring that your database schema accurately captures the data elements required to meet the user's needs.

## 5 The following tables form part of a database held in a relational DBMS:-

- Hotel     (hotelNo, hotelName, city)
- Room      (roomNo, hotelNo, type, price)
- Booking   (hotelNo, guestNo, dateFrom, dateTo, roomNo)
- Guest     (guestNo, guestName, guestAddress)

where

- Hotel contains hotel details and hotelNo is the primary key;
- Room contains room details for each hotel and (roomNo, hotelNo) forms the primary key;
- Booking contains details of the bookings and (hotelNo, guestNo, dateFrom) forms the primary key;

and

- Guest contains guest details and guestNo is the primary key.

### Explain why the primary keys are chosen as such for each of the table

- Hotel Table:

  - Primary Key: hotelNo
  - Explanation: The primary key is chosen as hotelNo because it uniquely identifies each hotel in the database. It ensures that each hotel record is distinct from all others, and it is a logical choice as hotel numbers are typically unique identifiers for hotels.
- Room Table:

  - Primary Key: (roomNo, hotelNo)
  - Explanation: In the context of the Room table, a combination of roomNo and hotelNo is used as the primary key. This choice ensures that rooms are uniquely identified within a specific hotel. It allows for multiple rooms with the same roomNo to exist in different hotels while maintaining their uniqueness within the same hotel.
- Booking Table:

  - Primary Key: (hotelNo, guestNo, dateFrom)
  - Explanation: The Booking table's primary key combines hotelNo, guestNo, and dateFrom to ensure that each booking is uniquely identified within a specific hotel for a particular guest on a given date. It prevents duplicate bookings on the same date for the same guest at the same hotel.
- Guest Table:

  - Primary Key: guestNo
  - Explanation: The primary key guestNo is chosen because it uniquely identifies each guest. It ensures that guest records are distinct and avoids duplicates based on the guest number.

### Identify the foreign keys for each of the table (if any)

In the given schema, the foreign keys are used to establish relationships between tables. Here are the foreign keys:

- In the Room Table, hotelNo is a foreign key referencing the hotelNo primary key in the Hotel Table. This establishes a relationship between rooms and hotels, allowing each room to be associated with a specific hotel.

- In the Booking Table, hotelNo and guestNo are foreign keys referencing the primary keys in the Hotel Table and Guest Table, respectively. These foreign keys establish relationships between bookings, hotels, and guests, indicating which hotel and guest are associated with each booking.

- roomNo in the Booking Table is also a foreign key referencing the roomNo in the Room Table, establishing a relationship between bookings and rooms, indicating which room is booked for a particular booking.

### Explain how the entity and referential integrity rules apply to these relations

- Entity Integrity:

  Entity integrity ensures that each row in a table is uniquely identifiable, primarily through the use of primary keys. In this database schema, entity integrity is maintained by the selection of primary keys in each table. For example, the hotelNo in the Hotel table or guestNo in the Guest table ensures that each hotel and guest is uniquely identifiable.
- Referential Integrity:

  Referential integrity ensures that relationships between tables are maintained. In this schema, referential integrity is upheld through the use of foreign keys. For instance, the foreign key hotelNo in the Room table references the primary key in the Hotel table, linking rooms to specific hotels. Similarly, foreign keys like hotelNo, guestNo, and roomNo in the Booking table maintain referential integrity by linking bookings to hotels, guests, and rooms, respectively.
- Together, entity and referential integrity rules ensure that the data within this relational database remains consistent, accurate, and free from duplicate or orphaned records. They enforce the rules for data relationships and uniqueness, supporting the database's overall reliability and integrity.
