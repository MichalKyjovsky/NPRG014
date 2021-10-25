//TASK Define the unless (aka if not) method

def unless(boolean cond, Closure code) {
    if (!cond) code()
}

unless(1 > 5) {
    println "Condition not satisfied!"
}

println 'done'