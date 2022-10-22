package myJavaStart.Dziedziczenie.paramorfizm.Dziekanat;

public enum Kierunek {
    ELEKTROTECHNIKA("1 - Elektrotechnika", 1), INFORMATYKA("2 - Informatyka", 2),
    MECHANIKA("3 - Mechanika", 3), FIZYKA("4 - Fizyka", 4), MATEMATYKA("5 - Matematyka", 5);

    private final String pozycjaMenu;
    private final int menuId;

    Kierunek(String pozycjaMenu, int menuId) {
        this.pozycjaMenu = pozycjaMenu;
        this.menuId = menuId;

    }

    public String opisMenu() {
        return pozycjaMenu;
    }

    public static Kierunek menuID(int menu) {
        for (Kierunek value : values()) {
            if(value.menuId == menu){
                return value;
            }

        }
        return null ;
    }
}

