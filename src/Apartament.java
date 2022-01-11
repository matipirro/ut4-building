import java.util.Arrays;
import java.util.Objects;

public class Apartament {
    private int plantnum;
    private String door;
    private Owner[] owners;

    public Apartament(int plantnum, String door, Owner[] owners) {
        this.plantnum = plantnum;
        this.door = door;
        this.owners = owners;
    }

    public int getPlantnum() {
        return plantnum;
    }

    public void setPlantnum(int plantnum) {
        this.plantnum = plantnum;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartament that = (Apartament) o;
        return plantnum == that.plantnum && Objects.equals(door, that.door) && Arrays.equals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(plantnum, door);
        result = 31 * result + Arrays.hashCode(owners);
        return result;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "plantnum=" + plantnum +
                ", door='" + door + '\'' +
                ", owners=" + Arrays.toString(owners) +
                '}';
    }
}


