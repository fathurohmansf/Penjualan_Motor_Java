package Penjualan_Motor_Java;

/**
 *
 * @author User
 */
public class ProsesTugas {

    public String merk, byr;
    public int hrg, manual, sport, matic, total = 0, diskon = 0, totdis = 0;

    public void setMerk(String val) {
        merk = val;
    }

    public String getMerk() {
        return merk;
    }

    public void setBayar(String val) {
        byr = val;
    }

    public String getBayar() {
        return byr;
    }

    public int getManual() {
        return manual;
    }

    public int getSport() {
        return sport;
    }

    public int getMatic() {
        return matic;
    }

    public void resetValues() {
        total = 0;
        diskon = 0;
        totdis = 0;
    }

    public void setSeleksiMerk() {
        if (merk.equalsIgnoreCase("HONDA")) {
            manual = 12000000;
            sport = 32000000;
            matic = 14000000;
        } else if (merk.equalsIgnoreCase("YAMAHA")) {
            manual = 14500000;
            sport = 31000000;
            matic = 14000000;
        } else if (merk.equalsIgnoreCase("SUZUKI")) {
            manual = 14000000;
            sport = 33000000;
            matic = 13500000;
        } else if (merk.equalsIgnoreCase("KAWASAKI")) {
            manual = 15000000;
            sport = 30000000;
            matic = 13500000;
        }
    }

    public void setSeleksiBayar() {
        if (merk.equalsIgnoreCase("HONDA")) {
            if (byr.equalsIgnoreCase("TUNAI")) {
                diskon = 20;
            } else if (byr.equalsIgnoreCase("KREDIT")) {
                diskon = 8;
            }
        }
        if (merk.equalsIgnoreCase("YAMAHA")) {
            if (byr.equalsIgnoreCase("TUNAI")) {
                diskon = 20;
            } else if (byr.equalsIgnoreCase("KREDIT")) {
                diskon = 7;
            }
        }
        if (merk.equalsIgnoreCase("SUZUKI")) {
            if (byr.equalsIgnoreCase("TUNAI")) {
                diskon = 20;
            } else if (byr.equalsIgnoreCase("KREDIT")) {
                diskon = 6;
            }
        }
        if (merk.equalsIgnoreCase("KAWASAKI")) {
            if (byr.equalsIgnoreCase("TUNAI")) {
                diskon = 20;
            } else if (byr.equalsIgnoreCase("KREDIT")) {
                diskon = 5;
            }
        }
    }
}
