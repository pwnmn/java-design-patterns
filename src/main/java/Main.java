import com.github.pwnmn.design_patterns.creational.builder.BankAccount;
import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Animal;
import com.github.pwnmn.design_patterns.creational.factory_abstract.factory.AbstractFactory;
import com.github.pwnmn.design_patterns.creational.factory_abstract.factory.AnimalFactory;
import com.github.pwnmn.design_patterns.creational.factory_abstract.factory.FactoryProvider;
import com.github.pwnmn.design_patterns.creational.factory_method.Plan;
import com.github.pwnmn.design_patterns.creational.factory_method.PlanFactory;
import com.github.pwnmn.design_patterns.structural.adapter.SackOfPotatoes;
import com.github.pwnmn.design_patterns.structural.adapter.Weighable;
import com.github.pwnmn.design_patterns.structural.adapter.WeighableAdapter;
import com.github.pwnmn.design_patterns.structural.adapter.WeighableAdapterImpl;
import com.github.pwnmn.design_patterns.structural.decorator.ChristmasTree;
import com.github.pwnmn.design_patterns.structural.decorator.ChristmasTreeImpl;
import com.github.pwnmn.design_patterns.structural.decorator.Garland;
import com.github.pwnmn.design_patterns.structural.decorator.Lights;

public class Main {

    public static void main(String[] args) {

        var planFactory = new PlanFactory();
        Plan instPlan = planFactory.getPlan(PlanFactory.PlanType.INSTITUTIONAL);
        System.out.println(instPlan.calculateRate(3));
        BankAccount account = BankAccount.builder().owner("Peter").accountNumber("12345").balance(100).branch("Bangkok").interestRate(1.0).build();

        AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory(FactoryProvider.FactoryTypes.Animal.name());
        Animal dog = animalFactory.create(AnimalFactory.AnimalType.Dog.name());
        System.out.println(dog.makeSound());

        Weighable sackOfPotatoes = new SackOfPotatoes(10.5);
        WeighableAdapter weightInKilo = new WeighableAdapterImpl(sackOfPotatoes);
        System.out.println(weightInKilo.weight());

        ChristmasTree tree = new Garland(new Lights(new ChristmasTreeImpl()));
        System.out.println(tree.decorate());
    }
}
