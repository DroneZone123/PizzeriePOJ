package fabric;

import models.Pizza;

public interface IFabric
{

   Pizza makeVegetarianPizza(int size, int howMany);
   Pizza makeCapriciosaPizza(int size, int howMany);
   Pizza makePepperoniPizza(int size, int howMany);

}

//wymagane metody do wzorca fabryk