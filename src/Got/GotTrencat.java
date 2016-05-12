package Got;

/**
 * Created by Sergi on 11/05/2016.
 */
public class GotTrencat extends GotState {

    public GotTrencat (Got2 got) {
        super (got);
    }

    public void ficar_aigua() {
        got.setState(got.TRENCAT);
    }

    public void buidar() {
        got.setState(got.TRENCAT);
    }

    public void colpejar() {
        got.setState(got.TRENCAT);
    }
}
