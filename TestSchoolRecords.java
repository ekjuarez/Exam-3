import java.util.ArrayList;

public class TestSchoolRecords {
    public static void main(String[] args) {
        Student Jimmy = new Student("Jimmy Crawford", "1800 Loser Lane", "(970)632-8123", "jimmy@gmail.com", "Senior");
        Student Carla = new Student("Carla Everworth", "9245 Galloper Way", "(970)888-9845", "carlacat@yahoo.com", "Freshman");
        Faculty Betty = new Faculty("Betty Oldwoman", "623 Senior Citizen Street", "(970)000-0001", "Onefootintheground@kickthebucket.com", "History", 4000000.01, "1901 BC", "07:00 am - 07:45 am", "Elder deity");
        Faculty Jessica = new Faculty("Jessica Young", "1765 Her Parents House Blvd", "(970)453-9991", "jessyjackrabbit@nomoney.com", "English", 35000.09, "Today", "10:00 am - 11:59 pm", "Junior");
        Staff Juan = new Staff("Juan Gonzales", "341 Olvera Street", "(224)431-3321", "N/A", "Maintenance", 55000.09, "Oct 09, 2007", "Senior");
        Staff Ricky = new Staff("Ricky Smith", "The school", "(720)876-0989", "rickythefreeloader@noprospects.com", "Maintenance", 24000.03, "Dec 12, 2023", "Junior");

        ArrayList<Person> Persons = new ArrayList<>();
        Persons.add(Jimmy);
        Persons.add(Carla);
        Persons.add(Betty);
        Persons.add(Jessica);
        Persons.add(Juan);
        Persons.add(Ricky);

        for (Person person : Persons) {
            System.out.println(person);
            System.out.println();
        }
        // Could not figure out within the test time
        public static ArrayList<String> getEmployeesFromPersonList (ArrayList < String > persons) {
            ArrayList<Employee> employeeList = new ArrayList<>();

            for (Person person : Persons) {
                if (person instanceof Employee) {
                    employeeList.add((Employee) person);
                }
            }
            return employeeList;
        }
    }
}

