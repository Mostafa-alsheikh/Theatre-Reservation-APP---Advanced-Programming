# Seat Reservation System in a Theatre

## Description

This program enables users to reserve seats in a theatre, where seats are categorized into three classes with different seat capacities and ticket prices. Users can perform actions such as reserving seats, canceling reservations, resetting the theatre reservations, or exiting the system.

## Classes of Reservations

1. **First Class:**
   - Number of seats: 20 (4 rows x 5 columns)
   - Ticket Price: 50 L.E.

2. **Second Class:**
   - Number of seats: 40 (8 rows x 5 columns)
   - Ticket Price: 15 L.E.

3. **Third Class:**
   - Number of seats: 50 (10 rows x 5 columns)
   - Ticket Price: 10 L.E.

## Features

### 1. **Ticket Reservation:**
   - User selects a class (First, Second, or Third) to make a reservation.
   - A seating chart for the selected class is displayed, with seats represented by unique IDs.
     - `O`: Empty seat
     - `X`: Reserved seat
   - User enters the IDs of the seats they wish to reserve.
   - If a user attempts to reserve a seat that is already taken, an error message will be displayed.
   - After selecting seats, the total cost of the reservation will be displayed.

### 2. **Ticket Cancellation:**
   - User enters the class and the ID of the seat they want to cancel.
   - If the seat was not reserved (i.e., the seat ID is incorrect), an error message will be shown.
   - If the seat was reserved, the amount to be refunded will be displayed.

### 3. **Reset Theatre Reservations:**
   - This option clears all reservations and resets all seats to empty.

### 4. **Exit:**
   - Terminates the program.

## Usage

1. **Start the program**:
   - The user will be prompted with a menu of options:
     - Ticket Reservation
     - Ticket Cancellation
     - Reset Theatre Reservations
     - Exit

2. **Ticket Reservation**:
   - Choose a class (First, Second, or Third).
   - View the current seat availability.
   - Enter the seat IDs to reserve. 
   - View the total amount to pay.

3. **Ticket Cancellation**:
   - Choose the class and seat ID to cancel.
   - If the seat was already unreserved, an error will be shown.

4. **Reset Reservations**:
   - Resets the seating chart to empty.

5. **Exit**:
   - Ends the program.


