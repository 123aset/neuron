import com.googlecode.fannj.Fann;

/**
 * Created by aset on 27.02.18.
 */
public class Main2 {
    public static void main(String[] args) {
        Fann fann = new Fann("ann");
        float[][] tests = {
                {10, 0, 0},
        };
        for (float[] test:tests){
            System.out.println(getAction(fann.run(test)));
        }
    }

    private static String getAction(float[] out){
        int i = 0;
        for (int j = 1; j < 4; j++) {
            if(out[i]<out[j]){
                i = j;
            }
        }
        switch (i){
            case 0:return "атаковать";
            case 1:return "прятаться";
            case 2:return "бежать";
            case 3:return "ничего не делать";
        }
        return "";
    }
}
