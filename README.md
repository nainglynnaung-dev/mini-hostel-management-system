# mini-hostel-management-system

For Hostel Owners
Register/Login (JWT/OAuth2)

Add/Edit/Delete hostels

Add rooms with details (capacity, price)

View bookings and payments

Dashboard with occupancy stats

For Hostel Users
Register/Login

Browse hostels and rooms

Book a room (with availability check)

Make payments

View booking history

General Features
Search hostels by location/name

Filter rooms by price/capacity

Notifications (email or in-app)

Admin panel (optional) for managing owners/users


AuthUser (id, username, email, password, role, status)
   |
   |-- One-to-One --> HostelOwner (id, name, phone, auth_user_id)
   |
   |-- One-to-One --> HostelUser (id, name, phone, hostel_id, room_id, auth_user_id)

City (id, name, region)
   |
   |-- One-to-Many --> Hostel (id, name, location, description, city_id, owner_id)
         |
         |-- One-to-Many --> Room (id, room_number, capacity, price, hostel_id)
                |
                |-- One-to-Many --> Booking (id, user_id, room_id, start_date, end_date, status)
                        |
                        |-- One-to-One --> Payment (id, booking_id, amount, payment_date, method)
