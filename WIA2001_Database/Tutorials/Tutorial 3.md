# Tutorial 3

## 1. Draw the following relationship using a suitable notation. Show the cardinalities.

> A doctor can treat many patients but must treat at least 1 patient and a patient is treated by only one doctor.  It is optional for a patient to be given any medication, but it is also possible for the patient to receive up to 10 medications. A medication can be given to many patients. 

```
DOCTOR      (1)			----<	(Many)		PATIENT
PATIENT		(1) 		----< 	(0-10) 	MEDICATION
MEDICATION	(0-Many) 	>---- 	(Many) 	PATIENT
```



## 2. Based on the following ERD, state **TEN** possible business rules

> ```
  CUSTOMER	(1) 		----< 	(0-Many)	CAR
  CAR 		(1)			----< 	(0-Many)	MAINTENANCE
  MAINTENANCE	(1)			----< 	(1-Many)	MAINT_LINE
  MAINT_LINE	(0-Many)	>---- 	(1)		PART
> ```

1. A customer can own one or more cars, but it is not required for a customer to own any cars.
2. A car must belong to one and only one customer.
3. A car can have zero or more maintenance records, but it is not required for a car to have any maintenance records.
4. Each maintenance record belongs to one and only one car.
5. A maintenance record can have one or more maintenance line items.
6. Each maintenance line item belongs to one and only one maintenance record.
7. A maintenance line item can be associated with one or more parts.
8. Each part can be used in zero or more maintenance line items.
9. A part is not required to be associated with any maintenance line item.
10. A customer can be associated with cars that may or may not have maintenance records, and those maintenance records may or may not have maintenance line items that use parts.

## 3.

A manufacturing company produces products. The following product information is stored: product name, product ID and quantity on hand. These products are made up of many components. Each component can be supplied by one or more suppliers. The following component information is kept: component ID, name, description, suppliers who supply them, and products in which they are used. 

> Create an ERD to show how you would track this information. Show entity names, primary keys, attributes for each entity, relationships between the entities and cardinality.

> Assumptions can be made:
  - A supplier can exist without providing components.
  - A component does not have to be associated with a supplier.
  - A component does not have to be associated with a product. Not all components are used in products.
  - A product cannot exist without components



Entities

| Product      | Product_Component | Component      | Supplier      | Supplier_Component |
| ------------ | ----------------- | -------------- | ------------- | ------------------ |
| PRODUCT_ID   | PRODUCT_ID        | COMPONENT_ID   | SSUPPLIER_ID  | SUPPLIER_ID        |
| PRODUCT_NAME | COMPONENT_ID      | COMPONENT_NAME | SUPPLIER_NAME | COMPONENT_ID       |
| QUANTITY_ON  | QUANTITY_USED     | DESCRIPTION    | CONTACT       |                    |
| HAND         |                   |                |               |                    |

Relationships

```
Product 			(1)		----<	(Many)	Product_Component
Product_Componnet	(Many)	>----	(1)		Component

Supplier			(1)		----<	(Many)	Supplier_Component
Supplier_Component	(Many)	>----	(1)		Component
```



## 4. Draw an Entity Relationship Diagram based on the following statements, using Chen’s or Crow’s Foot Notation:

> An art gallery keep information about artists, their names (which are unique), birthplace, age and style of art. For each piece of artwork, the artist, the year it was made, its unique title, its type of art (e.g., painting, sculpture, photograph), and its price must be stored. Pieces of artwork are also classified into groups of various kinds, for example, portraits and sculptures (given piece may belong to more than one group). Each group is identified by a group name that describes the group. The gallery keep all the information about customers. For each customer, the gallery keep that person’s unique name, address, total amount of ringgit’s spent, and the artists and groups of art that the customer tends to like.



Entities

| Artist            | Artwork       | ArtworkGroup      | Customer         |
| ----------------- | ------------- | ----------------- | ---------------- |
| ARTIST_ID         | ARTWORK_ID    | ARTWORKGROUP_NAME | CUSTOMER_ID      |
| ARTIST_NAME       | ARTWORK_TITLE |                   | CUSTOMER_NAME    |
| ARTIST_BIRTHPLACE | ARTWORK_YEAR  |                   | CUSTOMER_ADDRESS |
| ARTIST_AGE        | ARTWORK_TYPE  |                   | CUSTOMER_SPENT   |
| ARTIST_STYLE      | ARTWORK_PRICE |                   | CUSTOMER_FLAVOR  |

Relationships

```
Artist			(1)		----<	(Many)	Artwork
Artwork			(Many)	>---<	(Many)	ArtworkGroup

Customer		(Many)	>---<	(Many)	Artist
CUSTOMER_FLAVOR	(Many)	>----	(1)		Customer
CUSTOMER_FLAVOR	(Many)	>----	(1)		Artist

Customer		(Many)	>---<	(Many)	ArtworkGroup
```

