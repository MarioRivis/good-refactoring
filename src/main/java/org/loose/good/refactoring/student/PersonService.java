package org.loose.good.refactoring.student;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public List<String> getOveragePeopleNames(List<Person> people) {

        List<Person> overagePeople = keepOnlyOveragePeople(people);

        List<String> overagePeopleNames = getPeopleFullNames(overagePeople);

        overagePeopleNames = sortNamesAlphabetically(overagePeopleNames);

        printNames(overagePeopleNames);

        return overagePeopleNames;
    }

    private void printNames(List<String> names) {
        for (String name : names)
            System.out.println(name);
    }

    private List<String> sortNamesAlphabetically(List<String> names) {
        List<String> sortedNames = new ArrayList<>(names);
        for (int i = 0; i < sortedNames.size(); i++)
            for (int j = i; j < sortedNames.size(); j++)
                if (sortedNames.get(i).compareToIgnoreCase(sortedNames.get(j)) > 0) {
                    String aux = sortedNames.get(j);
                    sortedNames.set(j, sortedNames.get(i));
                    sortedNames.set(i, aux);
                }
        return sortedNames;
    }

    private ArrayList<String> getPeopleFullNames(List<Person> overagePeople) {
        ArrayList<String> stringList = new ArrayList<>();

        for (Person s : overagePeople) {
            stringList.add(s.getFullName());
        }
        return stringList;
    }

    private ArrayList<Person> keepOnlyOveragePeople(List<Person> people) {
        ArrayList<Person> overagePeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() >= 18) {
                overagePeople.add(person);
            }
        }
        return overagePeople;
    }
}