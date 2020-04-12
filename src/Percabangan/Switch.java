package Percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs :\"terimakasih pak\"");
                System.out.println("dosen :\"selamatya\"");
            break;
            case 'B':
                System.out.println("Mhs :\"kenapa ulun kada dapat a pa\"");
                System.out.println("dosen : \" asdasd\"");

            break;
                default:
                    System.out.println("mhs :\"uln trn pul pa ai , tugas pul jua");
                    System.out.println("dosen : \" bujurjuakah\"" );
                    System.out.println("dosen : \" *memeriksaberkas\"");
                    System.out.println("dosen : \" *mencelengi\"");
                    System.out.println("mhs : \" kabur....\"");
                    break;

        }
    }
}
