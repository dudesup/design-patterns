package structural_patterns.adapter.squarePegs_into_roundHoles;

import structural_patterns.adapter.squarePegs_into_roundHoles.adapters.SquarePegAdapter;
import structural_patterns.adapter.squarePegs_into_roundHoles.round.RoundHole;
import structural_patterns.adapter.squarePegs_into_roundHoles.round.RoundPeg;
import structural_patterns.adapter.squarePegs_into_roundHoles.square.SquarePeg;

public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (roundHole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        //roundHole.fits(smallSqPeg) Won't compile

        //Adapters!
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (roundHole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
