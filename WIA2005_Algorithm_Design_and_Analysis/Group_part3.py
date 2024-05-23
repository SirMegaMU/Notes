class Item:
    def __init__(self, name, value, weight):
        self.name = name
        self.value = value
        self.weight = weight
        self.ratio = value / weight

def knapsack(items, max_weight):
    # Sort items by value-to-weight ratio in descending order
    # Using builtin Timsort

    items.sort(key=lambda x: x.ratio, reverse=True)

    total_weight = 0
    total_value = 0
    selected_items = []

    # Select items to maximize total value without exceeding max weight
    for item in items:
        if total_weight + item.weight <= max_weight:
            selected_items.append(item)
            total_weight += item.weight
            total_value += item.value

    return selected_items, total_value

# Define items
items = [
    Item("Sceptre of Eternal Power", float('inf'), 5),
    Item("The Eye of Horus Pendant", 2, 0.5),
    Item("The Ankh of Immortality", 5, 1.5),
    Item("The Scarab Amulet of Fortune", 1, 0.2),
    Item("The Golden Mask of Osiris", 10, 2),
    Item("The Crown of the Pharaohs", 15, 3),
    Item("The Emerald Scarab of Transformation", 3, 2)
]

max_weight = 10

selected_items, total_value = knapsack(items, max_weight)

print("\033[34mSelected items:\033[0m")
for item in selected_items:
    print(f"{item.name} \t(Value: \033[34m{item.value}\033[0m, \tWeight: \033[34m{item.weight}\033[0m\t)")

print(f"Total value: \033[34m{total_value}\033[0m")
