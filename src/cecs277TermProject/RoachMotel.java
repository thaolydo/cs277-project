/**
 * Term project
 * Name: Ly Do, Gustavo Pech, Tyler Vanlerberghe
 */
package cecs277TermProject;

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * This is the Roach motel. It will use the Singleton design pattern. We will
 * set the capacity and name in the constructor.
 */
public class RoachMotel {
    private volatile static RoachMotel motel;
    private Queue<Room> availableRooms; // This is a list of available rooms
    private Map<RoachColony, Room> occupiedRooms; // This is a map from customer -> room
    private String name;
    private int capacity; // This is a dummy variable because it's not used anywhere
    private Logger logger;

    /**
     * Provide RoachMotel singleton instance.
     *
     * @return the RoachMotel singleton instance
     * @throws FileNotFoundException
     */
    public static RoachMotel getRoachMotel() throws FileNotFoundException {
        if (motel == null) {
            synchronized (RoachMotel.class) {
                if (motel == null) {
                    motel = new RoachMotel("The only roach motel", 6);
                }
            }
        }
        return motel;
    }

    /**
     * Private constructor for singleton.
     *
     * @param name     name of the motel
     * @param capacity capacity of the motel
     * @throws FileNotFoundException
     */
    private RoachMotel(String name, int capacity) throws FileNotFoundException {
        this.name = name;
        this.capacity = capacity;
        this.occupiedRooms = new HashMap<>();
        this.logger = Logger.getLogger();

        // Create Rooms and add them to motel
        availableRooms = new LinkedList<>();
        availableRooms.add(RoomFactory.createRoom(101, RoomType.BASIC));
        availableRooms.add(RoomFactory.createRoom(102, RoomType.BASIC));
        availableRooms.add(RoomFactory.createRoom(103, RoomType.BASIC));
        availableRooms.add(RoomFactory.createRoom(104, RoomType.QUEEN));
        availableRooms.add(RoomFactory.createRoom(105, RoomType.SUITE));
        availableRooms.add(RoomFactory.createRoom(106, RoomType.KING));
    }

    /**
     * Method to checkin a roach colony.
     *
     * @param roachColony the roach colony to be checked in
     * @param amenities   list of amenities for the room
     * @return string represent status of the checkin
     */
    public String checkIn(RoachColony roachColony, List<AmenityType> amenities) {
        String result = String.format("Checking in: %s\n", roachColony);
        logger.log(String.format("Colony %1$s attempting to check in.", roachColony));
        if (availableRooms.isEmpty()) {
            logger.log(String.format("Colony %1$s failed to check in, no available rooms.", roachColony));
            return result + "No available room.";
        }

        Room room = availableRooms.poll();
        ArrayList<AmenityType> newList = new ArrayList<AmenityType>();
        for (AmenityType amenity : amenities) {
            if (!newList.contains(amenity)) {
                newList.add(amenity);
                if (amenity == AmenityType.FOODBAR) {
                    room = new RoomWithFoodBar(room);
                } else if (amenity == AmenityType.SPA) {
                    room = new RoomWithSpa(room);
                } else if (amenity == AmenityType.AUTO_REFILL) {
                    room = new RoomWithAutoRefill(room);
                } else if (amenity == AmenityType.SPRAY_RESISTANT_SHOWER) {
                    room = new RoomWithSprayResistantShower(room);
                }
            } else {
                result += (
                        "Whoops seems you opted in for the same Amenity:" + amenity + " Duplicate has been removed");
            }
        }

        double cost = room.getCost();
        occupiedRooms.put(roachColony, room);
        logger.log(String.format("Successfully Checked In: Colony %1$s checking into %2$s", roachColony,
                occupiedRooms.get(roachColony)));
        result += "Successfully checking in Room Number" + " " + room + " " + " \nTotal Cost:" + cost;
        return result;
    }

    /**
     * Method to check out a roach colony.
     *
     * @param roachColony   the roach colony to be checked out
     * @param paymentMethod payment method
     * @param numDays       the number of days the roach colony has stayed
     */
    public void checkOut(RoachColony roachColony, PaymentStrategy paymentMethod, int numDays) {
        logger.log(String.format("Successfully Checked Out: Colony %1$s checking out of %2$s cost: %3$s using %4$s",
                roachColony, occupiedRooms.get(roachColony), (occupiedRooms.get(roachColony).getCost() * numDays),
                paymentMethod));
        this.pay(paymentMethod, roachColony, numDays);
        Room room = occupiedRooms.remove(roachColony);
        room = RoomFactory.createRoom(room.getRoomNumber(), room.getType());
        availableRooms.add(room);
    }

    /**
     * Spray the room given the roach colony.
     *
     * @param roachColony the roach colony
     */
    public void spray(RoachColony roachColony) {
        Room room = occupiedRooms.get(roachColony);
        logger.log(String.format("Spraying room %s", room));
        if (room.isSprayResistant()) {
            roachColony.setPopulation(roachColony.getPopulation() * 3 / 4);
        } else {
            roachColony.setPopulation(roachColony.getPopulation() / 2);
        }
        logger.log(String.format("%s population after spraying is %d", roachColony, roachColony.getPopulation()));
    }

    /**
     * Will allow a colony to pay for the room upon checkout. A payment method
     * (RoachPal or MasterRoach) will be passed in through the main method.
     *
     * @param paymentMethod A payment method (RoachPal or MasterRoach) passed in
     *                      through the main method.
     * @param cost          The total cost to be paid.
     */
    private String pay(PaymentStrategy paymentMethod, RoachColony colony, int numDays) {
        Room paidRoom = occupiedRooms.get(colony);
        double cost = paidRoom.getCost() * numDays;
        return paymentMethod.pay(cost);
    }

    @Override
    public String toString() {
        return String.format("Motel(name=%s, availableRooms=%s, occupiedRooms=%s, vacancySign=%s)", name,
                availableRooms, occupiedRooms, availableRooms.isEmpty() ? "No vacancy" : "Vacancy");
    }

}
