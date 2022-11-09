package TugasPraktikum4;

public class Lingkaran extends BangunDatar{
    //membuata bangun datar Lingkaran
    int r;

    public Lingkaran(int r){
        this.r = r;

    }
    @Override
    public float luas (){
        return (float) (Math.PI * r *r);
    }
    @Override
    public float keliling(){
        return (float) (2 * Math.PI * r);
    }
}
