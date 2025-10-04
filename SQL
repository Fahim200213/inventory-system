-- Table for item categories
CREATE TABLE Categories (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL
);

-- Table for inventory items
CREATE TABLE Items (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    quantity INTEGER NOT NULL,
    category_id INTEGER,
    FOREIGN KEY (category_id) REFERENCES Categories(id)
);
