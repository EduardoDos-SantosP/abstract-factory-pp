package fabrica;

import produto.OvoAlpino;
import produto.OvoClassic;
import produto.OvoKitKat;
import produto.OvoPascoaAbstrato;

public class FabricaNestle extends FabricaOvoPascoaAbstrata {
    @Override
    public OvoPascoaAbstrato crieOvo1() {
        return new OvoAlpino();
    }

    @Override
    public OvoPascoaAbstrato crieOvo2() {
        return new OvoClassic();
    }

    @Override
    public OvoPascoaAbstrato crieOvo3() {
        return new OvoKitKat();
    }
}
