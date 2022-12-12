Feature: Us 16 Rooms are read, created, updated and deleted

  @RoomGet
  Scenario:TC01 Get Request For Rooms

    Given admin sends GET request
    And  admin deserializes the data coming from DB
    And admin validates the data


  @RoomPost
  Scenario:TC02 post request validation

    Given admin sends post request for rooms
    And  admin validates the data


  @RoomPut
  Scenario: TC03 Put Request For Rooms

    Given  admin sends put request for rooms
    And Admin validates the put request


  @RoomDelete
  Scenario:TC04 delete request for rooms
    Given  admin sends delete request for rooms "245018"
    And  admin validates the delete request