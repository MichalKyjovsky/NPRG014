final a = {
    final b = {
        final c = {value + 10}
        c()
    }
    b()
}

//TASK Set the delegates so that to code passes and uses the value below
final values = [value: 20]

// value = 10 works also because it lies in the topmost scope

a.delegate = values

println a()