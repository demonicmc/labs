

def increment(i):
    return ++i


def countLetters(text):
    text2 = text
    i = 0
    str = "abcdefghijklmnopqrstuvwxyz"
    mas = [0] * text2.__len__()

    dic = {}

    while text2.__len__() > i:
        count = 0
        while str.__len__() > count:
            if (text2[i].lower() == str[count]):
                mas[i] = increment(mas[i])
            dic[text2[i]] = mas[i]
            ++count
        ++i

    mas.sort()
    text2.sort()
    l = []

    j = 0
    while (text2.__len__() > j):
        value = dic.get(text[j])
        if (value == mas[-1]):
            l.append(text2[j])
    return l[0]

name = "Misha"
print(countLetters(name))