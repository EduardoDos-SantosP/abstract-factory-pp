package fabrica;

import produto.OvoALeite;
import produto.OvoOreo;
import produto.OvoPascoaAbstrato;
import produto.OvoSonhoValsa;

public class FabricaLacta extends FabricaOvoPascoaAbstrata {
    @Override
    public OvoPascoaAbstrato crieOvo1() {
        return new OvoALeite();
    }

    @Override
    public OvoPascoaAbstrato crieOvo2() {
        return new OvoOreo();
    }

    @Override
    public OvoPascoaAbstrato crieOvo3() {
        return new OvoSonhoValsa();
    }    
}
