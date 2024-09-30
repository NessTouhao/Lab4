public enum Season {winter(-8),spring(14),summer(21),fall(6);
    private final int Temp;
    public int getTemp() {
        return Temp;
    }
    private Season(int Temp) {
        this.Temp = Temp;
    }
    public String getDescription() {
        if (this == Season.summer)
            return "Тёплое время года";
        else
            return "Холодное время года";
    }
}
