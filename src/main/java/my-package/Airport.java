package bmstu.ru;


    private int id;
    private String name;
    private static final String DELIMITER = ",";

    public Airport(String s){
        String[] data = s.split(DELIMITER);
        this.id = Integer.parseInt(data[0]);


    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return name;
    }

}
