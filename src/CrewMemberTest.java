import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class CrewMember {
    private String name;
    private int id;
    private String rank; // e.g. Captain, First Officer
    private String flightNumber;

    public CrewMember(String name, int id, String rank, String flightNumber) {
        this.name = name;
        this.id = id;
        this.rank = rank;
        this.flightNumber = flightNumber;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getRank() {
        return rank;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "\n" + name + ", " + id + ", " + rank + ", Flight: " + flightNumber + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CrewMember)) return false;
        CrewMember that = (CrewMember) o;
        return id == that.id && Objects.equals(name, that.name)
                && Objects.equals(rank, that.rank)
                && Objects.equals(flightNumber, that.flightNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, rank, flightNumber);
    }
}

public class CrewMemberTest {

    public static void main(String[] args) {

        // 1. Create 3 CrewMember objects
        CrewMember c1 = new CrewMember("John", 1, "Captain", "FL100");
        CrewMember c2 = new CrewMember("Alice", 2, "First Officer", "FL101");
        CrewMember c3 = new CrewMember("Bob", 3, "Captain", "FL102");

        List<CrewMember> crewList = new ArrayList<>(Arrays.asList(c1, c2, c3));
        System.out.println("crewList:" + crewList);

        // 2. Filter only Captains
        List<CrewMember> captains = crewList.stream()
                .filter(c -> "Captain".equalsIgnoreCase(c.getRank()))
                .collect(Collectors.toList());

        System.out.println("Captains:");
        captains.forEach(System.out::println);

        // 3. Use of Collectors.groupingBy
        Map<String, List<CrewMember>> groupedByRank = crewList.stream()
                .collect(Collectors.groupingBy(CrewMember::getRank));

        System.out.println("\nGrouped by Rank:");
        groupedByRank.forEach((rank, members) -> {
            System.out.println(rank + ": " + members);
        });



        // 5. Find unique fleets (flight numbers) - using streams
        Set<String> uniqueFleetsWithStreams = crewList.stream()
                .map(CrewMember::getFlightNumber)
                .collect(Collectors.toSet());

        System.out.println("\nUnique Fleets (with streams): " + uniqueFleetsWithStreams);

        // Without streams
        Set<String> uniqueFleetsWithoutStreams = new HashSet<>();
        for (CrewMember cm : crewList) {
            uniqueFleetsWithoutStreams.add(cm.getFlightNumber());
        }

        System.out.println("Unique Fleets (without streams): " + uniqueFleetsWithoutStreams);

        // 6. Remove duplicates from list using streams
        List<CrewMember> listWithDuplicates = Arrays.asList(c1, c2, c3, c1);
        List<CrewMember> distinctList = listWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("\nDistinct CrewMembers (with streams):");
        distinctList.forEach(System.out::println);

        // Remove duplicates without streams
        Set<CrewMember> distinctSet = new HashSet<>(listWithDuplicates);
        List<CrewMember> distinctListWithoutStreams = new ArrayList<>(distinctSet);

        System.out.println("Distinct CrewMembers (without streams):");
        distinctListWithoutStreams.forEach(System.out::println);
    }
}
