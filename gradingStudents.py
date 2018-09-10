grades = [23,80,96,18,73,78,60,60,15,45,15,10,5,46,87,33,60,14,71,65,2,5,7,0]
def gradingStudents(grades):
    r = []
    diff = 0
    for g in grades:
        if g < 38:
            r.append(g)
            continue
        if g >= 38:
            if is5Multiply(g):
                r.append(g)
            else:
                for i in range(5):
                    if i == 0:
                        continue
                    re = g + i
                    if is5Multiply(re):
                        diff = i
                        re = 0
                        break
                if ((g + diff) - g) < 3:
                    r.append(g + diff)
                    diff = 0
                else:
                    r.append(g)
    return r
        
def is5Multiply(number):
    if number % 5 == 0:
        return True
    else:
        return False

gradingStudents(grades)