package loose.oose.fis.documents;

import java.util.Arrays;

public class PDF extends Document {
    public PDF(String[] continut) {
        super(continut);
    }

    @Override
    public String[] analizeaza() {
        String[] res = new String[continut.length];
        int      pos = 0;

        for (String cuvant : continut) {
            if(cuvant.contains("pdf")) {
                System.out.println("Word has string 'pdf'");
            }
        }

        return Arrays.copyOf(res, pos);
    }

    @Override
    public String toString() {
        return "PDF" + super.toString();
    }
}
