import tkinter as tk
from tkinter import messagebox

class InventoryUI(tk.Tk):

    def __init__(self):
        super().__init__()
        
        self.title("Inventory Management System")
        
        # Set up the main frame
        self.main_frame = tk.Frame(self)
        self.main_frame.pack(padx=10, pady=10)
        
        # Set up the title label
        self.title_label = tk.Label(self.main_frame, text="Inventory Management System", font=("Verdana", 24))
        self.title_label.pack()

        # Set up the product panel
        self.product_panel = tk.Frame(self.main_frame)
        self.product_panel.pack(pady=10)

        self.product_label = tk.Label(self.product_panel, text="Product Name:")
        self.product_label.grid(row=0, column=0)

        self.product_name = tk.Entry(self.product_panel, width=20)
        self.product_name.grid(row=0, column=1)

        self.quantity_label = tk.Label(self.product_panel, text="Quantity:")
        self.quantity_label.grid(row=1, column=0)

        self.product_quantity = tk.Entry(self.product_panel, width=10)
        self.product_quantity.grid(row=1, column=1)

        # Set up the button panel
        self.button_panel = tk.Frame(self.main_frame)
        self.button_panel.pack(pady=10)

        self.add_button = tk.Button(self.button_panel, text="Add", command=self.add_product)
        self.add_button.pack(side=tk.LEFT, padx=5)

        self.view_button = tk.Button(self.button_panel, text="View", command=self.view_inventory)
        self.view_button.pack(side=tk.LEFT, padx=5)

        # Set the window size
        self.geometry("400x300")

   
