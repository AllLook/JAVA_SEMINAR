import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Laptop<S, I extends Number> implements Map {
    private String name;
    public String Ram;//доступны внутри своего класса
    private String Hdd;
    private String OS;
    private String color;


    public String getName(String hp) {
        return name;
    }

    public String getRam() {
        return Ram;
    }

    public String getHdd() {
        return Hdd;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public void setHdd(String hdd) {
        Hdd = hdd;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", Ram=" + Ram +
                ", Hdd=" + Hdd +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // добавились методы Map при добавлении интерфейса Map
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        return null;
    }

    @Override
    public Object remove(Object key) {
        return key;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
