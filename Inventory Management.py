import psycopg2
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Connect to PostgreSQL database
conn = psycopg2.connect(
    dbname='your_database',
    user='your_username',
    password='your_password',
    host='localhost',
    port='5432'
)

# Function to add a new product
def add_product(product_name, category, quantity, price, supplier):
    with conn.cursor() as cursor:
        cursor.execute("""
            INSERT INTO inventory (product_name, category, quantity, price, supplier, last_updated)
            VALUES (%s, %s, %s, %s, %s, CURRENT_DATE);
        """, (product_name, category, quantity, price, supplier))
    conn.commit()

# Function to fetch and visualize inventory data
def visualize_inventory():
    df = pd.read_sql_query("SELECT * FROM inventory;", conn)
    
    plt.figure(figsize=(10, 6))
    sns.barplot(x='product_name', y='quantity', data=df)
    plt.title('Inventory Levels by Product')
    plt.xticks(rotation=45)
    plt.show()

# Example usage
add_product('Widget E', 'Gadgets', 120, 20.00, 'Supplier 4')
visualize_inventory()

# Close the connection
conn.close()
