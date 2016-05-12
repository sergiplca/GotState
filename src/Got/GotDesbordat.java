package Got;

/**
 * Created by Sergi on 11/05/2016.
 */
public class GotDesbordat extends GotState {

    public GotDesbordat (Got2 got) {
        super (got);
    }

    public void ficar_aigua() {
        got.setState(got.DESBORDAT);
    }

    public void buidar() {
        got.setState(got.BUIT);
    }

    public void colpejar() {
        got.setState(got.TRENCAT);
    }
}
