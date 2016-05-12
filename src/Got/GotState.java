package Got;

/**
 * Created by Sergi on 11/05/2016.
 */
public abstract class GotState {

    protected Got2 got;

    public GotState (Got2 got) {
        this.got = got;
    }

    public abstract void ficar_aigua();

    public abstract void buidar();

    public abstract void colpejar();
}
