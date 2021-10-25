enum DAYS {
    Sun, Mon, Tue, Wed, Thu, Fri, Sat
}

import static DAYS.*

def currentDay = Tue

assert Wed in [Mon, Wed, Fri]
assert Wed in Mon..Fri
assert ++currentDay == Wed
assert ++currentDay == Thu
assert currentDay.previous() == Wed
assert currentDay.next() == Fri

switch (currentDay) {
    case [Sun, Sat]: println 'Vivat weekend'
        break
    case Mon..Thu: println 'Hard work today'
        break
    case Fri: println 'It is coming...'
        break
    case null: println 'What?'
        break
    default: println 'Sorry, no help here'
}

assert Fri in (Wed..Fri)

println 'ok'