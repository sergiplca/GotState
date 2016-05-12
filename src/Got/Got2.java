package Got;

/**
 * Created by Sergi on 11/05/2016.
 */
public class Got2 {

    public final GotState BUIT = new GotBuit (this);
    public final GotState PLE = new GotPle (this);
    public final GotState DESBORDAT = new GotDesbordat (this);
    public final GotState TRENCAT = new GotTrencat (this);

    private GotState state = BUIT;

    public void ficar_aigua() {
        state.ficar_aigua();
    }

    public void buidar() {
        state.buidar();
    }

    public void colpejar() {
        state.colpejar();
    }

    public void setState (GotState state) {
        this.state = state;
    }
}
