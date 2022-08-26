package pl.sz.bunin.mihail.phone.phone;

public abstract class Phone {
    private String label;
    private int model,memory,price;
    private double display;
        public String getLabel(){
            return label;
        }
        public int getModel(){
            return model;
        }
        public double getDisplay(){
            return display;
        }
        public int getMemory(){
            return memory;
        }
        public int getPrice(){
            return price;
        }
        public Phone (String label,int model,double display,int memory,int price){
            this.model=model;
            this.display=display;
            this.label=label;
            this.memory=memory;
            this.price=price;
        }

            public abstract void aboutPhone();




}
