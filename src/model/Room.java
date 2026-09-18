package model;

import model.enums.RoomType;

public class Room {
  private int number;
  private int availableSeats;
  private int floor;
  private String address;
  private RoomType type;

  public Room(int number, int availableSeats, int floor, String address, RoomType type) {
    this.number = number;
    this.availableSeats = availableSeats;
    this.floor = floor;
    this.address = address;
    this.type = type;
  }

  public int getNumber() {
    return number;
  }

  public int getAvailableSeats() {
    return availableSeats;
  }

  public void setAvailableSeats(int availableSeats) {
    this.availableSeats = availableSeats;
  }

  public int getFloor() {
    return floor;
  }

  public String getAddress() {
    return address;
  }

  public RoomType getType() {
    return type;
  }

  @Override
  public String toString() {
    return "Room{" + "number=" + number + ", availableSeats=" + availableSeats + '}';
  }
}
