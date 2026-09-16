enum RoomType {
  LECTURE_HALL,
  LAB,
  SEMINAR_ROOM
}

class Room {
  int number;
  int available_seats;
  int floor;
  String address;
  RoomType type;

  // validation for overlapping coursess
}