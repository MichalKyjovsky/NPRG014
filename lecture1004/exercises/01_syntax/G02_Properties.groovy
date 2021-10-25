class City {
    String name
    int size
    boolean capital = false
    
    static def create(String n, int v, boolean e = true) {
        return new City(name: n, size: v, capital: e)
    }

    @Override
    public String toString() {
        // return capital == true ? "City of " + name
        return "${capital?'Capital c':'C'}ity of $name, population: $size"
    }
}

println City.create("Brno", 400000).dump()

City c = new City(name: 'Písek', size: 25000, capital: false)

println c.dump()
c.size = 25001
println c.dump()

println c
//TASK Provide a customized toString() method to print the name and the population
assert 'City of Písek, population: 25001' == c.toString()
c.capital = true
assert 'Capital city of Písek, population: 25001' == c.toString()