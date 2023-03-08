package fabrica;

import produto.OvoBatomLeite;
import produto.OvoCrocante;
import produto.OvoPascoaAbstrato;
import produto.OvoTalento;

public class FabricaGaroto extends FabricaOvoPascoaAbstrata {
    @Override
    public OvoPascoaAbstrato crieOvo1() {
        return new OvoCrocante();
    }

    @Override
    public OvoPascoaAbstrato crieOvo2() {
        return new OvoTalento();
    }

    @Override
    public OvoPascoaAbstrato crieOvo3() {
        return new OvoBatomLeite();
    }
    
}
