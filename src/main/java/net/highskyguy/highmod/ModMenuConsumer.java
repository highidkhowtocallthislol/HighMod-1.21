package net.highskyguy.highmod;

import java.util.function.Consumer;

public class ModMenuConsumer {

    public void attachModpackBadges(Consumer<String> consumer) {
        consumer.accept("modmenu"); // Indicates that 'modmenu' is part of the modpack
    }
}
