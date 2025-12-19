class StudentRecord:
    def __init__(self, student_id, name, grade, address):
        self.student_id = student_id
        self.name = name
        self.grade = grade
        self.address = address
    def __str__(self):
        return f"ID: {self.student_id}, Name: {self.name}, Grade: {self.grade}, Address: {self.address}"
class SequentialFileAllocation:
    def __init__(self): 
        self.database = []
    def add_record(self, record):
        """Add a new student record sequentially."""
        self.database.append(record)
        print(f"Record added: {record}")
    def display_records(self):
        """Display all student records."""
        if not self.database:
            print("No records in the database.")
            return
        print("\nStudent Records:")
        for record in self.database:
            print(record)
    def find_record(self, student_id):
        """Find a record by student ID."""
        for record in self.database:
            if record.student_id == student_id:
                return record
        return None 
school_database = SequentialFileAllocation() 
student_a = StudentRecord(101, "John Doe", 10, "123 Main Street")
student_b = StudentRecord(102, "Jane Smith", 11, "456 Elm Street")
student_c = StudentRecord(103, "Michael Brown", 9, "789 Oak Avenue")
school_database.add_record(student_a)
school_database.add_record(student_b)
school_database.add_record(student_c) 
school_database.display_records() 
search_id = 102
found_record = school_database.find_record(search_id)
if found_record:
    print(f"\nRecord found for ID {search_id}: {found_record}")
else:
    print(f"\nRecord with ID {search_id} not found.")
