public class Notebook {
    static int count = 0;
    String company;
    String product;
    String typeName;
    Double inches;
    int ram;
    String operationSys;
    Double weight;
    Double price;

    @Override
    public String toString() {
        return "company: " + company
                + ", product: " + product
                + ", typeName: "+ typeName
                + ", inches: " + inches
                + ", ram: " + ram + " GB"
                + ", operationSys: " + operationSys
                + ", weight: " + weight + " kG"
                + ", price: " + price;
    }


    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if (obj instanceof Notebook){
            Notebook notebook = (Notebook) obj;
            return company.equals(notebook.company)
                    && product.equals(notebook.product)
                    && typeName.equals(notebook.typeName)
                    && inches.equals(notebook.inches)
                    && ram==notebook.ram
                    && operationSys.equals(notebook.operationSys)
                    && weight.equals(notebook.weight)
                    && price.equals(notebook.price);
        }
        return false;
    }

    @Override // код необходимо дописывать в ручную если появятся критерии.
    public int hashCode() {
        count++;
        return company.hashCode()
                +product.hashCode()
                +typeName.hashCode()
                +inches.hashCode()
                +ram
                +operationSys.hashCode()
                +weight.hashCode()
                +price.hashCode();
    }


}


