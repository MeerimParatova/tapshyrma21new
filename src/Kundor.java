public enum Kundor {
    //    Кундорго enum тузунуз (Monday, Tuesday ...)
//консолдон бир кунду белгилениз . Эгер Monday болсо - анда "Дуйшомбу куну жава окуйм"
// же Tuesday болсо - анда "Шейшемби куну англис тили сабагын окуйм"
// деп кунго жараша кайсы сабакты окуганынызды консольго чыгарыныз.
//    Жуманын кундорун кыргыз тилинде корсотунуз.
    MONDAY("дуйшомбу"),
    TUESDAY("шейшемби"),
    WEDNESDAY("шаршемби"),
    THUSDAY("бейшемби"),
    FRIDAY("жума"),
    SATURDAY("ишемби"),
    SUNDAY("жекшемби");

    String attary;
    Kundor(String ozgocholugu) {
        this.attary=ozgocholugu;
    }

    @Override
    public String toString() {
        return attary;
    }
}
